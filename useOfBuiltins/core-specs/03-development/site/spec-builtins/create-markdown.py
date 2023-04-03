#!/usr/bin/env python
# coding: utf-8

# In[41]:


import string
import pandas as pd
import sparql_dataframe
from rdflib import Graph
import rdflib.plugins.sparql as sparql
import urllib


# ### organize prefixes

# In[42]:


dic_prefixes = {
    "http://purl.org/dc/terms/": 'dcterms' ,
    "https://w3id.org/function/ontology#": 'fno' ,
    "https://w3id.org/function/ontology/n3#": 'fnon' ,
    "http://www.w3.org/2000/10/swap/crypto#": 'crypto' ,
    "http://www.w3.org/2000/10/swap/list#": 'list' ,
    "http://www.w3.org/2000/10/swap/log#": 'log' ,
    "http://www.w3.org/2000/10/swap/math#": 'math' ,
    "http://www.w3.org/1999/02/22-rdf-syntax-ns#": 'rdf' ,
    "http://www.w3.org/2000/01/rdf-schema#": 'rdfs' ,
    "http://www.w3.org/2000/10/swap/string#": 'string' ,
    "http://www.w3.org/2000/10/swap/time#": "time" ,
    "http://www.w3.org/2003/06/sw-vocab-status/ns#": "vc" ,
    "http://www.w3.org/2001/XMLSchema#": "xsd" ,
}


# In[43]:


from glob import glob
from os.path import join

g = Graph()
# iterate recursively over all files in the src directory
files = glob(join('src', '**', '*.n3'), recursive=True)
try:
    for file in files:
        g += Graph().parse(file, format='n3')
except:
    print('Error parsing file: ' + file)
    raise

# test single file
# g += Graph().parse(open("src/list/append.n3"), format='n3')


# In[44]:


[g.bind(v, k) for k, v in dic_prefixes.items()]


# In[45]:


sparql_prefixes = ' '.join(['prefix ' + v + ': <' + k + '>\n' for k, v in dic_prefixes.items()])


# In[46]:


query = """
    select distinct (concat(strbefore(str(?s), '#'), '#') as ?namespace) 
    where { ?s a fno:Function . ?s ?p ?o . }
"""
prefixes = [dic_prefixes[str(row.namespace)] for row in g.query(query)]


# ### processing

# In[47]:


editor_uri = "https://n3-editor.herokuapp.com/n3/editor/?formula="
md_string = ""


# In[48]:


for p in prefixes:
    # print(f"processing {p}")

    md_string += f"## {p} ##" + " {#" + p + "}\n"
    q = sparql_prefixes + """
        select (strafter(str(?s), '#') as ?name) ?s ?tldr ?comment ?exampleDescription ?example
        where {
            ?s a fno:Function ;
                fno:name ?name ;
                fnon:tldr ?tldr ;
                dcterms:comment ?comment ;
            .
            filter(strstarts(str(?s), "$NAMESPACE"))            
        }
    """
    # name and description
    # TODO doesn't seem to work with prepareQuery (cannot find "name" as result attr?)
    query = string.Template(q).substitute(NAMESPACE=next(key for key, value in dic_prefixes.items() if value == p))
    for func in g.query(query, initBindings={'namespace': next(key for key, value in dic_prefixes.items() if value == p)}):
        md_string += "### " + p + ":" + func.name + " ### {#" + str(func.name) + "}\n"
        md_string += func.tldr + "\n\n"
        md_string += func.comment + "\n\n"
        md_string += "**Schema**<br>"
        # PARAMETERS

        spec_string = ""
        q = sparql.prepareQuery(sparql_prefixes + """
            select ?member ?positionName ?mode ?predicate ?description ?type
            where {
                ?function a fno:Function ;
                    fno:parameter ?list .
                    ?list rdf:rest*/rdf:first ?member .
                    ?member a fno:Parameter ;
                        fno:mode ?mode ;
                        fno:predicate ?predicate ;
                        fnon:position ?position
                OPTIONAL {
                    ?member dcterms:description ?description ;
                        fno:type ?type
                }
                bind(strafter(str(?position), '#') as ?positionName)
            }
        """)
        q_listElType = sparql.prepareQuery(sparql_prefixes + """
            select ?mode ?predicate ?type
            where {
                ?member fnon:listElementType ?listElType .
                ?listElType fno:mode ?mode ;
                    fno:predicate ?predicate .
                OPTIONAL {
                    ?listElType fno:type ?type
                }
            }""")
        
        q_listEls = sparql.prepareQuery(sparql_prefixes + """
            select ?element ?mode ?predicate ?type
            where {
                ?member fnon:listElements ?list .
                ?list rdf:rest*/rdf:first ?element .
                ?element fno:mode ?mode ;
                    fno:predicate ?predicate .
                OPTIONAL {
                    ?element fno:type ?type
                }
            }""")
        
        subject = None
        object = None

        for param in g.query(q, initBindings={'function': func.s}):
            term = None
            
            # test to make sure both subject, object are being returned
            # print(param)

            # look for listElementType
            r_listElType = g.query(q_listElType, initBindings={'member': param.member})
            if len(r_listElType) > 0:
                listElType = next(iter(r_listElType))
                term = f"( {str(listElType.predicate)}{str(listElType.mode)} ){str(param.mode)}"
            
            else:
                # look for listElements
                r_listEls = g.query(q_listEls, initBindings={'member': param.member})
                if len(r_listEls) > 0:
                    terms_list = []
                    for listEl in r_listEls:
                        terms_list.append(f"{str(listEl.predicate)}{str(listEl.mode)}")
                    terms_str = " ".join(terms_list)
                    term = f"( {terms_str} ){str(param.mode)}"
                
                # if none are found, use "standard" representation
                else:
                    term = f"{str(param.predicate)}{str(param.mode)}"
            
            if str(param.positionName) == "subject":
                subject = term
            elif str(param.positionName) == "object":
                object = term

        md_string += f"`{subject} {p}:{str(func.name)} {object}`\n\n"

        # examples
        query = sparql.prepareQuery(sparql_prefixes + """
            select ?description ?seeAlso ?expression ?result
            where {
                ?function a fno:Function ;
                    fno:example ?list .
                ?list rdf:rest*/rdf:first ?test .
                ?test a fno:Test ;
                    dcterms:description ?description ;
                    rdfs:seeAlso ?seeAlso ;
                    fno:expression ?expression ;
                    fno:result ?result .
            }
            """)
        
        query_results = g.query(query, initBindings={'function': func.s})
        if len(query_results) > 0:
            md_string += "**Examples**<br>"
            for example in query_results:
                e = """
    <div class=example>
        <p>$DESCRIPTION
        <p><b>Formula:</b>
        ```$EXPRESSION```
        <p><b>Result:</b>
        ```$RESULT```
    </div>            
    """         
                url_param = urllib.parse.quote_plus(example.expression.strip(), safe='', encoding=None, errors=None)
                example_url = editor_uri + url_param

                expression = string.Template(e).substitute(DESCRIPTION=str(example.description), EXPRESSION=str(example.expression), RESULT=str(example.result))
                md_string += f"""<a href="{example_url}" target="_blank">Try in Notation3 Editor &#128640;</a>\n\n"""
                md_string += expression + "\n"        
            
            


# In[49]:


template = open('index_TEMPLATE.bs').read()
with open('index.bs', 'w+') as f:
    string = template.replace('{{__CONTENT__}}', md_string)
    f.write(string)


# In[50]:


print(md_string)


# In[ ]:




