List of N3 implementations
==========================

* [cwm](https://www.w3.org/2000/10/swap/doc/cwm.html) written in Python
  as part of the [Semantic Web Application Platform](https://www.w3.org/2000/10/swap/) 
* [eye](https://github.com/eyereasoner/eye) Euler Yet another proof Engine
* [eye-js](https://github.com/eyereasoner/eye-js) JavaScript/WASM version of eye

## In Progress
* [jen3](https://github.com/william-vw/jen3) extending Jena system with full N3 support (william.van.woensel@gmail.com)  
* [Ruby RDF::N3](https://github.com/ruby-rdf/rdf-n3) a Reader and Writer for the [RDF.rb](https://github.com/ruby-rdf/rdf) ecosystem which includes limited provisional capabilities.

## Incomplete
* [N3.js](https://github.com/rdfjs/N3.js/blob/master/README.md) Lightning fast, asynchronous, streaming RDF for JavaScript  
(_note: does not support reasoning_)
* [swish](http://hackage.haskell.org/package/swish) implementation in Haskell of N3 (also Turtle,
  formal semantics, graph isomorphism, etc)  
  (_homepage mentions incompleteness_)
* [AutoNomic](https://github.com/koo5/AutoNomic-pyco) backchaining reasoner with AE rules  
(_seems incomplete according to [this](https://github.com/koo5/n3-dev-testcases/tree/509f6bc84fea55422ed3c93f26cd1b097d602a3d)?_)
* [Linked Data-Fu](http://linked-data-fu.github.io/) implementation in Java of a subset of N3's features (RDF assertions, deductions) with special semantics regarding HTTP requests in rule heads  
(_reasoning aspect unclear - cannot access system_)
* [RDFLib](https://github.com/RDFLib/rdflib) Python package for working with RDF. (_note: does not support reasoning_)
* [RoXi](https://pbonte.github.io/roxi/index.html) a Rust based streaming reasoner (command line + web version)

## Archived

* [FuXi](https://github.com/RDFLib/FuXi) in Python using [RDFLib](https://github.com/RDFLib/rdflib)
  see also [gjhiggins's branch](https://github.com/gjhiggins/FuXi) which works with current RDFLib.
* [Henry](https://github.com/moustaki/henry) an [SWI-Prolog](http://swi-prolog.org/)
