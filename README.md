
RankLib
-------

A Learning to Rank Library. Copied from: http://people.cs.umass.edu/~vdang/ranklib.html
as version of 2.1

To build it from source, simply run :
<code>
mvn assembly:single
</code>


Why Fork it ?
-------------

This fork (ranklib is not publicly versioned) aim at offering the following improvements :
- Use of maven for build the JAR file.
- Create some unit tests (The lib contains some "//FIXME: not sure if this implementation is correct!" or "//FIXME: THIS IS VERY *INEFFICIENT*" comments) when in doubt on some functionalities we needed (few actually, mostly metrics).
- Add a new metric for binary testing when ranking follows a "winner-takes-all" strategy (percentage of first ranked item is found). (P@1 is bogus for the special case of an item ranked 2 and all other ranked 1).

*This fork adresses the aforementioned shortcomings but does not aim at providing a clean room implementation of RankLib, which could be best adressed by recoding from scratch.*

Licence
-------
Licence follows original BSD.

They didi it :
==============
Julien Subercaze <julien.subercaze@telecom-st-etienne.fr>
Christophe Gravier <christophe.gravier@telecom-st-etienne.fr>
