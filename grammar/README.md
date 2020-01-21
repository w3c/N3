# N3 Grammars

This work was greatly aided by [Łukasz' work on an initial N3 grammar](https://github.com/lszeremeta/n3).

Since N3 is supposed to subsume Turtle, we started by creating a grammar for Turtle (`turtle.g4`).
In and of itself this came with its own set of issues - see comments in the grammar file.

The Turtle grammar was subsequently adapted and extended with N3 constructs (`n3.g4`).

Changes between the new N3 grammar and the original grammars (Turtle, N3) include:
- Dropping the `@keywords` section
- Allowing all "verb" keywords (e.g., `is .. of`, `has`) both with and without `@` prefix
- Supporting comments in files  
(strangely, neither N3 nor Turtle seemed to define these in their syntaxes)
- (*minor*) supporting non-encoded spaces in IRIs  
(not allowed in Turtle) 

# Testing

For testing, we are currently using the [Turtle test suite](https://www.w3.org/2013/TurtleTests/), the [Eye N3 test cases](http://eulersharp.sourceforge.net/), and [cwm N3 test cases](https://www.w3.org/2000/10/swap/doc/cwm.html). 
A number of tests were also contributed by [Gregg Kellogg](https://github.com/gkellogg) as distilled from the [SWAP webpage](http://www.w3.org/2000/10/swap). 

All tests can be found under the `tests/` folder, where each subfolder (`N3Tests`, `TurtleTests`) has its own `manifest.ttl` file that describe the test cases (e.g., positive, negative tests) using the [RDF test manifest](https://www.w3.org/TR/rdf11-testcases/) vocabulary.

Since running syntax tests is a bit more complex than usual, with a distinction between positive- and negative-tests 
(i.e., tests with and without expected syntax errors), we opted to create our own "test harnass" (see [here](https://github.com/w3c/N3/blob/master/grammar/src/main/java/test/) for the code).

See below for instructions on how to run the tests.

## Running tests

Currently, the test harnass supports:
- The new N3 (and Turtle) grammar (see `*.g4` files)
- The [cwm](https://www.w3.org/2000/10/swap/doc/cwm.html) system. 

It should be relatively straightforward to support additional systems, such as [Eye](http://eulersharp.sourceforge.net/).

The tool will utilize a `manifest.ttl` file when found; else, it will treat all given files as positive/negative tests. It will also print all output to file `./test_out.txt`, in addition to showing it on the cmd line.

To compile the test harness, run `mvn clean package`. If all goes well this process should result in separate jar files for each supported system under the `target` folder. Run `java -jar <name>.jar` for usage info. 

Note that you can update the grammar (`.g4` file) and then run `mvn clean package` to compile the new lexer and parser, which are part of the test harness.

There is a distinction between **positive-tests** (i.e., no syntax errors expected) and **negative-tests** (i.e., syntax errors expected).

- In case a **folder** is given, the program will look for a `manifest.ttl` file that describe the test cases using the [RDF test manifest](https://www.w3.org/TR/rdf11-testcases/) vocabulary. 

  When no manifest is found, the program will simply treat all Turtle / N3 files in the folder as tests (recursively). The program will expect a `-pos`/`-neg` flag indicating whether they are positive or negative tests. Note that this flag can also be given to override the `manifest.ttl` file within the folder, if any.

- In case an **individual file** is given, the program will always expect a `-pos`/`-neg` flag to indicate whether it is a  positive or negative test. The `-printAST` flag can be added to print the parsed AST.

For instance:

* `java -jar n3TestGrammar.jar n3 ../tests/N3Tests`  
**N3**: tests files inside the `N3Tests` folder, as listed in its `manifest.ttl`, as N3 test cases.  

* `java -jar n3TestGrammar.jar n3 ../tests/TurtleTests -pos`  
**Turtle**: tests all files inside the `TurtleTests` folder as positive Turtle test cases.

* `java -jar n3TestGrammar.jar n3 ../tests/N3Tests/01etc/food-query.n3 -pos -printAST`  
**N3**: tests the `a.n3` file as a positive N3 test case and prints its AST.

* `java -jar n3TestCwm.jar C:/cwm/cwm-1.2.1/build/scripts-2.7/cwm ../tests/N3Tests`  
**Cwm**: tests files inside the `N3Tests` folder, as listed in its `manifest.ttl`, as cwm test cases.  

### Turtle grammar

For the **Turtle test suite**, the Turtle grammar fails for two negative-test files (marked as `Rejected` in `manifest.ttl`) due to an issue unrelated to the parser.

### N3 grammar

Currently, the new N3 grammar does not support the `@keywords` section. This means that quite a lot of relevant test cases, i.e., which are meant to test something else but happen to have a `@keywords` section, were failing. Hence, we manually removed the `@keywords` section and manually corrected the non-qname terms in those files. You can find the original versions of those test cases in the `N3Tests/original/with_keywords` folder. 

Note that the `N3Tests\turtle` folder contains test cases from the Turtle test suite that specifically target N3 features (so they are expected to fail for a Turtle-only parser, but should succeed for an N3 parser).

We refer to the `manifest.ttl` file for all test cases that failed for our N3 grammar - these will have a `Rejected` or `Proposed` approval together with an `rdfs:comment` describing why they failed.

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
