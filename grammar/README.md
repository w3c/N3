# N3 Grammars

This work was greatly aided by [Łukasz' work on an initial N3 grammar](https://github.com/lszeremeta/n3).

Since N3 is supposed to subsume Turtle, we started by creating a grammar for Turtle (`turtle.g4`).
In and of itself this came with its own set of issues - see comments in the grammar file.

The Turtle grammar was subsequently adapted and extended with N3 constructs (`n3.g4`).
Aside from the `keywords` section, all current N3 constructs should be present.

For testing, we are currently using the [Turtle test suite](https://www.w3.org/2013/TurtleTests/) and the [Eye N3 test cases](http://eulersharp.sourceforge.net/).
Details can be found in `TESTS.txt`.

Since running syntax tests is a bit more complex than usual, with a distinction between positive- and negative-tests 
(i.e., tests with and without expected syntax errors) that in some cases must be loaded from a `manifest.ttl` file, 
we opted for creating our own "test harnass" (`Test.java`).


## Running tests

To compile the lexer and parser (i.e., initially or after changes to a `.g4` file), run `mvn clean package`. 
If all goes well this process should result in an `n3Grammar.jar` file under the `target` folder. 

Run `java -jar n3Grammar.jar` for usage info. 
For instance:

* `java -jar n3Grammar.jar turtle ../tests/TurtleTests` runs all tests inside the `TurtleTests` folder. 
To identify positive and negative syntax tests, the program parses `TurtleTests\manifest.ttl`. See section below for expected errors.

* `java -jar n3Grammar.jar n3 ../tests/N3Tests pos` runs all files inside the `N3Tests` folder as positive-tests 
(i.e., no syntax errors expected). Currently, the `N3Tests` folder only contains positive tests. See section below for expected errors.

* `java -jar n3Grammar.jar n3 ../tests/N3Tests/04test/a.n3 pos` runs the individual `a.n3` file as a positive-test
(i.e., no syntax errors expected).



## Test summary

### Turtle grammar

For the **Turtle test suite**, the Turtle grammar fails for two negative-test files due to an issue unrelated to the parser.

### N3 grammar

For the **Turtle test suite**, the N3 grammar additionally fails for many other negative-test files (i.e., with expected syntax errors) due to its increased permissiveness (e.g., allowing literals as s/p/o).

In fact, the Turtle test suite has a number of negative-test files that specifically test for N3 features (e.g., paths). 
In that vein, it was a bit surprising that the N3 grammar didn't pass all those negative Turtle tests.
But, it appears that these tests either refer to the keywords section or are malformed N3.

For the **Eye N3 test cases**, the N3 grammar passes for most of them. The failed ones involve the following:

1. non-labeled (for lack of a better word) bnodes, i.e., `_:`

2. quick-variables annotated with datatypes and language tags, e.g., `?v^^xsd:int`, `?v@en` 

3. '\' chars in strings which does not seem allowed by either Turtle nor N3