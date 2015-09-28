Build Status
======
[![Build Status](https://travis-ci.org/izmailoff/scala-s-99.png?branch=master)](https://travis-ci.org/izmailoff/scala-s-99)

About
======

Scala-S-99 is an SBT Scala project with solutions for
"S-99: Ninety-Nine Scala Problems".

Original page with problems and solutions is here:
http://aperiodic.net/phil/scala/s-99/

Compare to [Haskell H99](https://github.com/izmailoff/haskell-h99) - same problems solved in Haskell.

Project Structure
======

It contains:

* SBT project files
* Scala source code
* Scala unit tests source code
* No binaries or jar files (install SBT executable on your own)


How to Run
======

SBT
------

If you use SBT simply cd to this directory and type `sbt`.
After this you can issue commands in SBT prompt:

    > ; clean; compile; test

Alternatively you can type in shell:

    > sbt update clean compile test

Eclipse
------

Eclipse project can be generated from SBT using eclipse
plugin. Run `eclipse` command from SBT and then use
'Import New Projects' in eclipse to open it.

IntelliJ IDEA
------
IntelliJ supports direct import SBT projects using Scala plugin.

Project Structure
======

Every problem is placed in a separate package. There might be multiple
solutions to each problem (read objects/classes) and I didn't want to
mix them all together.

There are at least 2 files in each package: my solution, and an answer
from the website.

Tests mirrow package names, but contain 1 or more test classes.
There were no test classes provided by the author of S-99.

For example:

    directory src/main/scala contains
    package s99.p01 which contains
    P01.scala - my solution
    P01Answer.scala - original solution
    P01Option.scala - my second solution

and

    directory src/test/scala contains
    package s99.p01 which contains
    P01OptionSuite.scala - a test for P01Option.scala
    P01Suite.scala - test for P01.scala

and so on for each excercise.

