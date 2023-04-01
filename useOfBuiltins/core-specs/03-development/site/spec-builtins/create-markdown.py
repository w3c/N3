#!/usr/bin/env python
import string
import pandas as pd
import sparql_dataframe
from rdflib import Graph

md_head = """
<pre class='metadata'>
Title: N3 Builtin Functions
Shortname: functions
Level: 1
Status: LD
URL: https://domel.github.io/n3buildins/specification/
TR: https://domel.github.io/n3buildins/specification/
Previous Version: https://domel.github.io/n3buildins/specification/0.1/
Editor: Tim Duval, [UnifyLogic](http://unifylogic.ai), tim.duval@unifylogic.ai
Editor: William Van Woensel, [University of Ottawa](https://www.uottawa.ca/en), williamvanwoensel@gmail.com 
Editor: Patrick Hochstenbach, [Ghent University](https://www.ugent.be/en), patrick.hochstenbach@ugent.be 
Editor: Dominik Tomaszuk, [University of Bialystok](https://uwb.edu.pl/en/), d.tomaszuk@uwb.edu.pl
Abstract: This document lists the recommended core set of builtin functions an N3 Reasoner needs to support. 
Markup Shorthands: markdown yes 
Boilerplate: conformance no, index no
</pre>

<style>
table {
  margin: 25px auto;
  border-collapse: collapse;
  border: 1px solid #eee;
  border-bottom: 2px solid #005A9C;
}
table tr:hover {
  background: #f4f4f4;
}
table tr:hover td {
  color: #555;
}
table th, table td {
  color: #999;
  border: 1px solid #eee;
  padding: 12px 12px;
  border-collapse: collapse;
}
table th {
  background: #005A9C;
  color: #fff;
}
table tbody > tr > th {
  background: #fff;
  color: #005A9C;
}
table th.last {
  border-right: none;
}
</style>


Introduction {#Introduction}
=====================

These are not the builtins you are looking for. Nothing to see here. 

Conformance 
===========

Conformance requirements are expressed with a combination of descriptive assertions and RFC 2119 terminology. 
The key words “MUST”, “MUST NOT”, “REQUIRED”, “SHALL”, “SHALL NOT”, “SHOULD”, “SHOULD NOT”, “RECOMMENDED”, “MAY”, 
and “OPTIONAL” in the normative parts of this document are to be interpreted as described in RFC 2119. However, 
for readability, these words do not appear in all uppercase letters in this specification.

All of the text of this specification is normative except sections explicitly marked as non-normative, examples, 
and notes. [[RFC2119]]

Document Conventions
=====================

Within this document, the following namespace prefix bindings to [[URI]]-s are used: 

<table>
  <thead>
    <tr>
      <th>Prefix
      <th>Namespace
  <tbody>
    <tr>
      <td>dcterms 
      <td>http://purl.org/dc/terms/
    <tr>
      <td>fno 
      <td>https://w3id.org/function/ontology#
    <tr>
      <td>list 
      <td>http://www.w3.org/2000/10/swap/list#
    <tr>
      <td>log 
      <td>http://www.w3.org/2000/10/swap/log#
    <tr>
      <td>math 
      <td>http://www.w3.org/2000/10/swap/math#
    <tr>
      <td>rdf 
      <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#
    <tr>
      <td>rdfs 
      <td>http://www.w3.org/2000/01/rdf-schema#
    <tr>
      <td>string 
      <td>http://www.w3.org/2000/10/swap/string#
    <tr>
      <td>time 
      <td>http://www.w3.org/2000/10/swap/time#
    <tr>
      <td>xsd 
      <td>http://www.w3.org/2001/XMLSchema#
</table>

Tutorial for Semantic Web Reasoning With N3 {#OnlineTutorial}
=====================
[Online Tutorial for Semantic Web Reasoning With N3](https://n3.restdesc.org/n3/)
""" 

sparql_prefixes = """
        prefix crypto: <http://www.w3.org/2000/10/swap/crypto#>
        prefix dcterms: <http://purl.org/dc/terms/>
        prefix fno: <https://w3id.org/function/ontology#>
        prefix list: <http://www.w3.org/2000/10/swap/list#>
        prefix log: <http://www.w3.org/2000/10/swap/log#>
        prefix math: <http://www.w3.org/2000/10/swap/math#>
        prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
        prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>
        prefix string: <http://www.w3.org/2000/10/swap/string#>
        prefix time: <http://www.w3.org/2000/10/swap/time#>
        prefix xsd: <http://www.w3.org/2001/XMLSchema#>
"""

g = Graph()
g.parse('builtins.n3', format='n3')
dic_prefixes = {
    "http://www.w3.org/2000/10/swap/crypto": 'crypto' ,
    "http://www.w3.org/2000/10/swap/list": 'list' ,
    "http://www.w3.org/2000/10/swap/log": 'log' ,
    "http://www.w3.org/2000/10/swap/math": 'math' ,
    "http://www.w3.org/2000/10/swap/string": 'string' ,
    "http://www.w3.org/2000/10/swap/time": "time" ,
}

query = sparql_prefixes + """
    
    select distinct (strbefore(str(?s), '#') as ?namespace) 
    where { ?s a fno:Function . }
    order by ?namespace
"""
prefixes = [dic_prefixes[str(row.namespace)] for row in g.query(query)]

md_string = ""

for p in prefixes:
    md_string += f"## {p} ##" + " {#" + p + "}\n"
    q = sparql_prefixes + """
        select (strafter(str(?s), '#') as ?name) ?s ?comment ?exampleDescription ?example
        where {
            ?s a fno:Function ;
                fno:name ?name ;
                dcterms:comment ?comment ;
            .
            filter(strstarts(str(?s), "$NAMESPACE"))            
        }
    """
    # name and description
    query = string.Template(q).substitute(NAMESPACE=next(key for key, value in dic_prefixes.items() if value == p))
    for func in g.query(query):
        md_string += "### " + p + ":" + func.name + "() ### {#" + str(func.name) + "}\n"
        md_string += func.comment + "\n\n"

        # examples        
        query = sparql_prefixes + """
            select ?description ?seeAlso ?expression
            where {
                <$FUNCTION> a fno:Function ;
                    fno:example ( [ a fno:Test ;
                        dcterms:description ?description ;
                        rdfs:seeAlso ?seeAlso ;
                        fno:expression ?expression ]) .
            }
            """
        query = string.Template(query).substitute(FUNCTION=str(func.s))
        for example in g.query(query):
            e = """
<div class=example>
$DESCRIPTION
```$EXPRESSION```
</div>            
"""
            expression = string.Template(e).substitute(DESCRIPTION=str(example.description), EXPRESSION=str(example.expression))
            md_string += "[Try in Notation3 Editor &#128640;](" + str(example.seeAlso) + ")\n\n"            
            md_string += expression + "\n"

print(md_head)
print(md_string)
            
