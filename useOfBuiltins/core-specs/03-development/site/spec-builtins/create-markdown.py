#!/usr/bin/env python
# coding: utf-8

# In[598]:


import string
import pandas as pd
import sparql_dataframe
from rdflib import Graph
import rdflib
import rdflib.plugins.sparql as sparql
import urllib


# ### organize prefixes

# In[599]:


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


# In[600]:


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

# # test single file
# g += Graph().parse(open("src/crypto/sha.n3"), format='n3')


# In[601]:


[g.bind(v, k) for k, v in dic_prefixes.items()]


# In[602]:


sparql_prefixes = ' '.join(['prefix ' + v + ': <' + k + '>\n' for k, v in dic_prefixes.items()])


# In[603]:


query = """
    select distinct (concat(strbefore(str(?s), '#'), '#') as ?namespace) 
    where { ?s a fno:Function . ?s ?p ?o . }
"""
prefixes = [dic_prefixes[str(row.namespace)] for row in g.query(query)]


# ### processing

# In[604]:


editor_uri = "https://n3-editor.herokuapp.com/n3/editor/?formula="
md_string = ""


# In[605]:


q_unionEls = sparql.prepareQuery(sparql_prefixes + """
    select ?element
    where {
        ?type owl:unionOf ?union .
        ?union rdf:rest*/rdf:first ?element .
    }
""")

def qname(r):
    uri = str(r)
    if "#" in uri:
        ridx = uri.rindex("#")
    else:
        ridx = uri.rindex("/")
    ns = uri[:ridx+1]
    ln = uri[ridx+1:]
    # print(ns, ln)

    return f"{dic_prefixes[ns]}:{ln}"

def printDatatype(r, g):
    if type(r) == rdflib.term.URIRef:
        return f"`{qname(r)}`"
    else:
        # assume unionOf
        strs = []
        r_unionEls = g.query(q_unionEls, initBindings={'type': r})
        for el in r_unionEls:
            strs.append(f"`{qname(el.element)}`")
        str = " | ".join(strs)
        return f"({str})"

def createNote(r, g):
    note = f"`{r.predicate}`: "
    if r.type or r.description:
        if r.type:
            note += f"{printDatatype(r.type, g)}\n"
        if r.description:
            note += f"({r.description})"
        return note.strip()
    else:
        return ""


# In[606]:


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
                OPTIONAL { ?member dcterms:description ?description }
                OPTIONAL { ?member fno:type ?type }
                bind(strafter(str(?position), '#') as ?positionName)
            }
        """)
        q_listElType = sparql.prepareQuery(sparql_prefixes + """
            select ?mode ?predicate ?description ?type
            where {
                ?member fnon:listElementType ?listElType .
                ?listElType fno:mode ?mode ;
                    fno:predicate ?predicate .
                OPTIONAL { ?listElType dcterms:description ?description }
                OPTIONAL { ?listElType fno:type ?type }
            }""")
        
        q_listEls = sparql.prepareQuery(sparql_prefixes + """
            select ?element ?mode ?predicate ?description ?type
            where {
                ?member fnon:listElements ?list .
                ?list rdf:rest*/rdf:first ?element .
                ?element fno:mode ?mode ;
                    fno:predicate ?predicate .
                OPTIONAL { ?element dcterms:description ?description }
                OPTIONAL { ?element fno:type ?type }
            }""")
        
        subject = None
        object = None
        notes = [ None, None ]

        for param in g.query(q, initBindings={'function': func.s}):
            term = None
            note = ""
            
            # test to make sure both subject, object are being returned
            # print(param)

            # look for listElementType
            r_listElType = g.query(q_listElType, initBindings={'member': param.member})
            if len(r_listElType) > 0:
                listElType = next(iter(r_listElType))
                term = f"( {str(listElType.predicate)}{str(listElType.mode)} ){str(param.mode)}"
                note = createNote(listElType, g)
                
            else:
                # look for listElements
                r_listEls = g.query(q_listEls, initBindings={'member': param.member})
                if len(r_listEls) > 0:
                    terms_list = []
                    notes_list = []
                    for listEl in r_listEls:
                        terms_list.append(f"{str(listEl.predicate)}{str(listEl.mode)}")
                        el_note = createNote(listEl, g)
                        if el_note.strip():
                            notes_list.append(el_note)
                        
                    terms_str = " ".join(terms_list)
                    term = f"( {terms_str} ){str(param.mode)}"

                    # print(notes_list)
                    if len(notes_list) > 0:
                        notes_str = ", ".join(notes_list)
                        note = notes_str
                
                # if none are found, use "standard" representation
                else:
                    term = f"{str(param.predicate)}{str(param.mode)}"
                    note = createNote(param, g)
            
            if str(param.positionName) == "subject":
                subject = term
                notes[0] = note
            elif str(param.positionName) == "object":
                object = term
                notes[1] = note

        md_string += f"`{subject} {p}:{str(func.name)} {object}`"
        all_notes_str = "\n".join(notes).strip()
        if all_notes_str:
            all_notes_str = all_notes_str.replace("\n", "<br>")
            md_string += f"<div class='schema_where'>where:" + f"<div class='schema_datatypes'>{all_notes_str}</div></div><br>"

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
        
        md_string += "\n"
            


# In[607]:


template = open('index_TEMPLATE.bs').read()
with open('index.bs', 'w+') as f:
    string = template.replace('{{__CONTENT__}}', md_string)
    f.write(string)


# In[608]:


# print(md_string)


# In[ ]:




