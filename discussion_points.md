### Lists as first-class citizens

N3/Turtle lists (datatype) are different from RDF lists (first/rest ladders) but these can be converted in both directions (e.g., using  rules that infer “list:member” properties for all RDF ladder members). This may cope with cases where rules/software directly refers to list (datatype) elements but are faced with RDF first/rest ladders. 

*Do we want to keep the difference between N3/Turtle list datatypes vs. RDF first/rest ladders?*

### Built-ins
There's a balance needed between N3 expressiveness and N3 implementation difficulty. 

*What should be core N3 operators/built-ins/constructs, and what features could be left to separate standardization efforts?*

We made an initial "whish-list" of N3 operators [here](https://github.com/w3c/N3/blob/master/predicates_constructs.md), based on the Cwm builtins. This document should be further extended with use-cases to illustrate their real-world need.

### Closing the world
Scoped negation as failure should be supported, as in the original N3 spec. 

We discuss two concrete cases here, [one](https://github.com/w3c/N3/issues/9#issuecomment-458874667) that would be supported by (S)NAF and [one](https://github.com/w3c/N3/issues/9#issuecomment-458884008) that would require more effort (a type of scoped universal quantification). 

*We could introduce built-ins/constructs to elegantly close the world in these cases* (as suggested in the [built-ins document](https://github.com/w3c/N3/blob/master/predicates_constructs.md))

*Further, does " { :a :b :c } => false." stand for negation or not*? [Two interpretations](https://github.com/w3c/N3/issues/9#issuecomment-478081449) seem to be possible here.

### Semantics of cited formulas
###  Aligning with semantics of RDF Datasets
*How should cited graphs such as ":x :says {:s :p :o}." be interpreted?*

Many [different approaches](https://github.com/w3c/N3/issues/1#issue-391761687) are possible, and consensus for RDF datasets was [never reached](https://www.w3.org/TR/rdf11-datasets/). Retaining the [lack of referential transparency](https://github.com/w3c/N3/issues/8#issuecomment-503002904) is another issue that should be discussed.

One could argue that the problem is easier for N3 since we do not have to contend with many different interpretations of existing implementations (?)

###  No distinction between variables and constants
*Do we want to have a designated namespace or convention to represent variables?*

(separate from the syntax for implicitly quantified variables, e.g., “?x”)

### Explicit quantification
A major issue discussed here is that the [N3 spec stipulates](https://www.w3.org/TeamSubmission/n3/#Quantifica) that "If both universal and existential quantification are specified for the same formula, then the scope of the universal quantification is outside the scope of the existentials".

Nevertheless, systematically inverting the quantifier positions could [drastically change](https://github.com/w3c/N3/issues/6#issuecomment-457588731) the meaning of the expression. 

*Do we ignore this systematic re-ordering of universal and existential quantification?*

Side-discussions involved differences between @forSome and @forAll (see [here](https://github.com/w3c/N3/issues/6#issuecomment-458919402)), the scoping of quantification in an implication (starting from [here](https://github.com/w3c/N3/issues/6#issuecomment-458321402)) and how an implication will only allow for inferences when its variables are universally quantified (see [here](https://github.com/w3c/N3/issues/6#issuecomment-459303452)).

### Implicit quantification
The shorthand syntax “?x” implies that x is universally quantified not in the formula but in its parent formula. 

*Do we want to keep implicit quantification (i.e., “?x”)?* It could be very useful to have a "simpler" syntax is available for dealing with universal quantification for (beginning) N3 developers. It should be straightforward to encode many practical use cases using this notation; this allows developers to start coding with this simpler syntax and later move on to explicit quantifiers (when or if needed) and all the complexity that brings.

*What is the "parent" formula?* Iit seems that scoping at the outermost level was deemed most appropriate.

*Do we quantify in the "parent" formula or simply in the same formula?* This has distinct consequences for the semantics of the formula. Quantifying on the parent formula seems to make sense since it adheres to what most people expect rules to do in practice, i.e., infer the consequent if the condition holds. 

This could easily go wrong however; you can change the meaning of a formula by simply adding another one somewhere else in you N3 document that quantifies on the same universal variable.

*How to cope with variable name clashes?* E.g., a variable being introduced at a higher level in a formula, and then that variable being differently quantified "lower down" in that formula. Would these simply be different variables with the same name in different scopes?

There were other discussions as well, e.g., on differences between operational and semantic views (scoping of variable bindings) (starting from [here](https://github.com/w3c/N3/issues/5?_pjax=%23js-repo-pjax-container#issuecomment-458261966)) and the application of quantifiers (see [here](https://github.com/w3c/N3/issues/5?_pjax=%23js-repo-pjax-container#issuecomment-457203118)).

### How to represent logic expressions in RDF
*Should N3 be able to fit within RDF?* It’s not required but it seems like a nice feature. 

This however may have repercussions on N3 design decisions. It is especially problematic due to the [(lack of) reification semantics](https://github.com/w3c/N3/issues/2#issuecomment-456737504) in RDF (although having [custom interpretations](https://github.com/w3c/N3/issues/2#issuecomment-467832115) could side-step that issue.) Moreover, blank nodes would be scoped differently in N3 as opposed to the RDF representation.

### How to represent N3 in JSON-LD or a possible extension of that format? 
This is closely related to the above. Should we use a TriG-like notation for that?
