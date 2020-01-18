# N3 Grammars

This work was greatly aided by [Łukasz' work on an initial N3 grammar](https://github.com/lszeremeta/n3).

Since N3 is supposed to subsume Turtle, we started by creating a grammar for Turtle (`turtle.g4`).
In and of itself this came with its own set of issues - see comments in the grammar file.

The Turtle grammar was subsequently adapted and extended with N3 constructs (`n3.g4`).
Aside from the `keywords` section, all current N3 constructs should be present.

For testing, we are currently using the [Turtle test suite](https://www.w3.org/2013/TurtleTests/), the [Eye N3 test cases](http://eulersharp.sourceforge.net/), and [cwm N3 test cases](https://www.w3.org/2000/10/swap/doc/cwm.html). 
A number of tests were also contributed by [Gregg Kellogg](https://github.com/gkellogg) as distilled from the [SWAP webpage](http://www.w3.org/2000/10/swap). 

All tests can be found under the `tests/` folder, which has a `manifest.ttl` file that describe the test cases (e.g., positive, negative tests) using the [RDF test manifest](https://www.w3.org/TR/rdf11-testcases/) vocabulary.

Since running syntax tests is a bit more complex than usual, with a distinction between positive- and negative-tests 
(i.e., tests with and without expected syntax errors), we opted to create our own "test harnass" (see [Test.java](https://github.com/w3c/N3/blob/master/grammar/src/main/java/test/Test.java)).

See below for instructions on how to run the tests using this test harnass.

## Running tests

To compile the lexer and parser (i.e., initially or after changes to a `.g4` file), run `mvn clean package`. 
If all goes well this process should result in an `n3Grammar.jar` file under the `target` folder. This program can be used for running tests with the updated grammar.

There is a distinction between **positive-tests** (i.e., no syntax errors expected) and **negative-tests** (i.e., syntax errors expected).

Run `java -jar n3Grammar.jar` for usage info. 

- In case a **folder** is given, the program will look for a `manifest.ttl` file that describe the test cases using the [RDF test manifest](https://www.w3.org/TR/rdf11-testcases/) vocabulary. 

  When no manifest is found, the program will simply treat all Turtle / N3 files in the folder as tests (recursively). The program will expect a `-pos`/`-neg` flag indicating whether they are positive or negative tests. This flag can always be given to override the `manifest.ttl` file within the folder, if any.


- In case an **individual file** is given, the program will always expect a `-pos`/`-neg` flag to indicate whether it is a  positive or negative test. The `-printAST` flag can be added to print the parsed AST.

For instance:

* `java -jar n3Grammar.jar n3 ../tests/N3Tests`
runs all files inside the `N3Tests` folder as listed in its `manifest.ttl`.  

* `java -jar n3Grammar.jar n3 ../tests/N3Tests/01etc -pos`
runs all files inside the `N3Tests/01etc` folder as positive tests.

* `java -jar n3Grammar.jar n3 ../tests/N3Tests/01etc/food-query.n3 -pos -printAST`  
runs the individual `a.n3` file as a positive-test and prints its AST.

### Turtle grammar

For the **Turtle test suite**, the Turtle grammar fails for two negative-test files (marked as `Rejected` in `manifest.ttl`) due to an issue unrelated to the parser.

### N3 grammar

Currently, the new N3 grammar does not support the `@keywords` section. This means that quite a lot of relevant test cases, i.e., which are meant to test something else but happen to have a `@keywords` section, were failing. Hence, we manually removed the `@keywords` section and manually corrected the non-qname terms in those files. You can find the original versions of those test cases in the `N3Tests/original/with_keywords` folder. 

We refer to the `manifest.ttl` file for all test cases that failed for our N3 grammar - these will have a `Rejected` or `Proposed` approval together with an `rdfs:comment` describing why they failed.

You can find an (likely incomplete) summary below:

For the **Eye N3 test cases**, the N3 grammar passes for most of them. The failed ones involve the following:

1. non-labeled (for lack of a better word) bnodes, i.e., `_:`

2. quick-variables annotated with datatypes and language tags, e.g., `?v^^xsd:int`, `?v@en` 

3. '\\' chars in strings which does not seem allowed by either Turtle nor N3

For the **cwm N3 test cases**, the N3 grammar passes for most of them. The failed ones involve the following:

1. instances of `is .. of` instead of `@is .. @of`, and `has` instead of `@has` (without a `@keywords` section). These cases were manually corrected (see `*_correction.txt` files).

2. escaped characters that are not supported by Turtle (i.e., aside from `tbnrf`) (see `cwm_other/strqout.n3`). Would it make sense to support escaping arbitrary characters? .. 

3. non-encoded spaces in IRIs (see `cwm_syntax/space-in-uri.n3`)

4. the `this` keyword (deprecated according to [here](https://www.w3.org/2000/10/swap/grammar/n3.n3)) (see `cwm_syntax/this-quantifiers-ref2.n3`)

## Contributing

If you would like to contribute a new test or a fix to an existing test, please file an [issue](https://github.com/w3c/N3/issues) and/or create a [pull request](https://github.com/w3c/N3/pulls).

## TODOs

The following are grammar updates that are not yet decided (it's just to try them out) so they may turn out not to be needed:

-	Update the N3 grammar with “single inverse property” notation (extension of path sytax – see issue on GitHub)

-	Update the N3 path syntax to be fully in line with SPARQL property paths ; including changing the ‘!’ symbol to ‘/’

Also:

-	Create an N3 visitor class that issues errors when:

    - Non-prefixed qnames are listed and no base directive is given (turtle-syntax-bad-prefix-01.ttl)

    - Prefixed qnames are listed without corresponding prefix declaration (turtle-syntax-bad-prefix-02.ttl)
