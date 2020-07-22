# Notation3 Grammar Tests
Note that all N3 grammar syntax tests are currently found [here](https://w3c.github.io/N3/grammar).

For reasoning or evaluation tests, you should use the files listed [here](https://w3c.github.io/N3/tests).

Tests exist for [N3 grammar](N3Tests/manifest.ttl) and appropriate [Turtle](TurtleTests/manifest.ttl) tests.

# Design

In general, tests are described as Positive or Negative Syntax tests. Syntax tests simply check that the data can be parsed properly; negative syntax tests should generate an error.

Evaluation tests check whether the input (`action`) can be parsed into a dataset which is isomorphic to those described in `results`.

Tests should be run with an assumed base URI of their associated manifest, either `https://w3c.github.io/N3/tests/N3Tests` or `https://w3c.github.io/N3/tests/TurtleTests`.

# Contributing

If you would like to contribute a new test or a fix to an existing test,
please file an [issue](https://github.com/w3c/N3/issues) and/or create a [pull request](https://github.com/w3c/N3/pulls).
