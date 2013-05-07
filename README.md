RankLib
=======

A Learning to Rank Library. Copied from: http://people.cs.umass.edu/~vdang/ranklib.html

Why Fork it
===========

This fork (ranklib is not publicly versioned) aim at offering the following improvements :
- Use of maven
- Create some unit tests (The lib contains some "//FIXME: not sure if this implementation is correct!" or "//FIXME: THIS IS VERY *INEFFICIENT*")
- Add a new metric for binary testing when ranking follows a "winner-takes-all" strategy (percentage of first ranked item is found). I thought P@1 should do it but it doesn't, maybe becasue I misundestood or because of a bug, in any case it is faster to re-implement a metric for learning and testing models).

Licence follows original BSD.

Christophe Gravier <christophe.gravier@telecom-st-etienne.fr>
