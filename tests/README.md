# Notation3 Tests
Note that all N3 grammar syntax tests are currently found [here](https://github.com/w3c/N3/tree/master/grammar).

For reasoning or evaluation tests, you should use the files listed here (see `manifest-reasoner.ttl` file).

# Design

In general, tests are described as Positive or Negative Syntax tests, Evaluation Test, and Reason tests. Syntax tests simply check that the data can be parsed properly; negative syntax tests should generate an error.

Evaluation tests check whether the input (`action`) can be parsed into a dataset which is isomorphic to those described in `results`.

Reason tests invoke the Notation3 reasoner, with various options, and check that the results are isomorphic to those described in `results`.

Tests should be run with an assumed base URI of `https://github.com/w3c/N3/tests/`

# Contributing

If you would like to contribute a new test or a fix to an existing test,
please file an [issue](https://github.com/w3c/N3/issues) and/or create a [pull request](https://github.com/w3c/N3/pulls).
