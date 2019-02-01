# Logic

## `log:equalTo` 
(source: [Cmw Builtin](https://www.w3.org/2000/10/swap/doc/CwmBuiltins))

True if the subject and object are the same RDF node (symbol or literal). Do not confuse with owl:sameAs. 

## `log:implies` 
(source: [Cmw Builtin](https://www.w3.org/2000/10/swap/doc/CwmBuiltins))

Logical implication. This is the relation between the antecedent (subject) and conclusion (object) of a rule. The application of a rule to a knowledge-base is as follows. For every substitution which, applied to the antecedent, gives a formula which is a subset of the knowledge-base, then the result of applying that same substitution to the conclusion may be added to the knowledge-base. related: See `log:conclusion`.

## `log:conclusion` 
(source: [Cmw Builtin](https://www.w3.org/2000/10/swap/doc/CwmBuiltins))

All possible conclusions which can be drawn from a formula. The object of this function, a formula, is the set of conclusions which can be drawn from the subject formula, by successively applying any rules it contains to the data it contains.

## `log:includes` 
(source: [Cmw Builtin](https://www.w3.org/2000/10/swap/doc/CwmBuiltins))

The subject formula includes the object formula. Formula A includes formula B if there exists some substitution which when applied to B creates a formula B' such that for every statement in B' is also in A, every variable universally (or existentially) quantified in B' is quantified in the same way in A. Variable substitution is applied recursively to nested compound terms such as formulae, lists and sets.

## `log:not[X]` / @not
Cmw has a set of "not" variants for certain predicates (e.g., `log:notIncludes`, `log:notEqualTo`), not only for `log` but also for `math`, `list` and `string` as well. Although this makes it clear which predicates may be negated and which ones not, I feel that it doesn't lead to an elegant language syntax. An `@not` construct would require the formula in question to be cited / embedded, e.g., `@not { :x list:in :list }, which is still [an open issue](https://github.com/w3c/N3/issues/8). Depending on the outcome of our closing the world discussion, other expressions could possibly be negated as well (see below). 

## `log:semantics` 
(source: [Cmw Builtin](https://www.w3.org/2000/10/swap/doc/CwmBuiltins))

The log:semantics of a document is the formula, achieved by parsing representation of the document. For a document in Notation3, log:semantics is the log:parsedAsN3 of the log:contents of the document. For a document in RDF/XML, it is parsed according to the RDF/XML specification to yield an RDF formula (a subclass of N3 log:Formula). [Aside: Philosophers will be distracted here into worrying about the meaning of meaning. At least we didn't call this function "meaning"! In as much as N3 is used as an interlingua for interoperability for different systems, this for an N3 based system is the meaning expressed by a document.] 

## Combination of `log:semantics` and `log:includes`
When discussing two example cases in a closed world (see [here](https://github.com/w3c/N3/issues/9#issuecomment-458874667) and [here](https://github.com/w3c/N3/issues/9#issuecomment-458884008)) @doerthe discussed the following solutions that rely on aforementioned built-ins (i.e., built-ins since those are only supported by Cwm I think) but are quite extensive syntactically - and the first one is likely not supported by any reasoner either. 

E.g., to infer the type `AllTasksCompleted` for all composite tasks that only comprise completed tasks (thanks to @doerte):

```
{ ?t a :CompositeTask. 
@forAll :atomic .
   { <owa.n3> log:semantics ?x. ?x log:includes { ?t :contains :atomic}}
    =>
   {<owa.n3> log:semantics ?x. ?x log:includes {:atomic a :CompletedTask} } 
=> { ?t a :AllTasksCompleted . }.
```

E.g., to infer the type `NotDiscardedTask` for all tasks that are not annotated with the `DiscardedTask` class (thanks to @doerthe):

```
{?t a :Task. 
<owa.n3> log:semantics ?x. ?x log:notIncludes {?t a :DiscardedTask }}=>{ ?t a :NotDiscardedTask.}.
```

More elegant expressions could introduce an explicit scope (`@source`), possibly combined with an operator (e.g., `@not`) such as:

```
@source(<owa.n3>) { 
	?t a :CompositeTask. 
	@forAll :atomic .
		{ ?t :contains :atomic } => {:atomic a :CompletedTask} 
} => { 
	?t a :AllTasksCompleted . 
}.
```

And

```
@not(<owa.n3>) { 
	@forAll ?t . ?t a :Task . ?t a :DiscardedTask }
} => { 
	?t a :NotDiscardedTask.
}.
```


# List

## `list:append`
(source: [Cmw Builtin](https://www.w3.org/2000/10/swap/doc/CwmBuiltins))

Iff the subject is a list of lists and the concatenation of all those lists is the object, then this is true. eg ( (1 2) (3 4) ) list:append (1 2 3 4). The object can be calculated as a function of the subject.

## `list:in`
(source: [Cmw Builtin](https://www.w3.org/2000/10/swap/doc/CwmBuiltins))

Iff the object is a list and the subject is in that list, then this is true.

## `list:last`
(source: [Cmw Builtin](https://www.w3.org/2000/10/swap/doc/CwmBuiltins))

Iff the suject is a list and the obbject is the last thing that list, then this is true. The object can be calculated as a function of the list.

## `list:first` 
(by analogy with `list:last`)

## `list:member`

Iff the subject is a list and the obbject is in that list, then this is true. 


# Math

## `math:absoluteValue`
(source: [Cmw Builtins](https://www.w3.org/2000/10/swap/doc/CwmBuiltins))

The object is calulated as the absolute value of the subject.

## `math:negativeValue` 
(based on `math:negation` from [Cmw Builtin](https://www.w3.org/2000/10/swap/doc/CwmBuiltins)

The object is calculated as the negative value of the subject. (Assuming that '`math:negation` means what I think it means)

## Other predicates
`absoluteValue`, `sum`, `difference`, `exponentiation`, `equalTo`, `greaterThan`, `lessThan`, `product`, `quotient`, `remainder`, `atan2`, `cos`, `degrees`, `sin`, `sinh`, `tan`, tanh` as defined in [Cmw Builtin](https://www.w3.org/2000/10/swap/doc/CwmBuiltins). 

To avoid confusion I'd rename `math:negation` as follows (assuming that '`math:negation` means what @william-vw thinks it means):

## `math:negativeValue` 
(based on `math:negation` from [Cmw Builtin](https://www.w3.org/2000/10/swap/doc/CwmBuiltins)

The object is calculated as the negative value of the subject.

A `math:notEqualTo` could be useful from a usability standpoint but the proposed `@not` could be utilized for that as well.


# String

## Other predicates
`concatention`, `contains`, `startsWith`, `endsWith`, `greaterThan`, `lessThan`, `matches`, `replace`, `scrape`, `format`

As before the proposed `@not` could be utilized to represent `notContains`, `notGreaterThan`, `notLessThan`, etc.

A similar `string:ignoreCase` predicate could be created that would lead to predicates embedded in cited formulas to ignore case. (That way, we don't need variants for each boolean string operator.)


# Time

## Other predicates

`day(OfMonth)`, `dayOfWeek`, `month`, `year`, `timeZone`, `gmTime` (?), `localTime (?)` `hour`, `minute`, `second`, `epochTime` (instead of `inSeconds`) from [Cmw Builtin](https://www.w3.org/2000/10/swap/doc/CwmBuiltins).
