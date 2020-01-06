# Notation3 Tests
Repository for the N3 Community Group

See the [gh-pages](https://w3c.github.io/n3) branch for the main contents.

## Introduction

The Notation3 Test Suite is a set of tests that can
be used to verify Notation3.

More information and an RDFS definition of the test vocabulary can be found at [vocab](https://w3c.github.io/n3/tests/test.n3).

# Design

Tests are described as Positive or Negative Syntax tests, Evaluation Test, and Reason tests. Syntax tests simply check that the data can be parsed properly; negative syntax tests should generate an error.

Evaluation tests test that the input (`action`) can be parsed into a dataset which is isomorphic to those described in `results`.

Reason tests invoke the Notation3 reasoner, with various options, and check that the results are isomorphic to those described in `results`.

Tests should be run with an assumed base URI of `https://w3c.github.io/n3/tests/`

# Contributing

If you would like to contribute a new test or a fix to an existing test,
please file an [issue](https://w3c.github.io/n3/issues) and/or create a [pull request](https://w3c.github.io/n3/pulls).
