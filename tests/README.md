# Notation3 Tests
Repository for the N3 Community Group

See the [gh-pages](https://w3c.github.io/n3) branch for the main contents.

## Introduction

The Notation3 Test Suite is a set of tests that can
be used to verify Notation3.

More information and an RDFS definition of the test vocabulary can be found at [vocab](https://w3c.github.io/n3/tests/test.n3).

# Design

Tests are described as Positive or Negative Syntax tests, Evaluation Test, and Reason tests. Syntax tests simply check that the data can be parsed properly; negative syntax tests should generate an error.

Evaluation tests test that the input (`action``) can be parsed into a dataset which is isomorphic to those described in `results`.`

Reason tests invoke the Notation3 reasoner, with various options, and check that the results are isomorphic to those described in `results`.`

Tests should be run with an assumed base URI of `https://w3c.github.io/n3/tests/`

# Contributing

If you would like to contribute a new test or a fix to an existing test,
please file an [issue](https://w3c.github.io/n3/issues) and/or create a [pull request](https://w3c.github.io/n3/pulls).

1. File an issue ,
   that you will be creating a new test or fix and the purpose of the
   change.
2. Clone the git repository: git://github.com/w3c/json-ld-wg.git
3. Make your changes and submit them via github, or via a 'git format-patch'
   to the [JSON-LD Working Group mailing list](mailto:json-ld-wg@w3.org).
