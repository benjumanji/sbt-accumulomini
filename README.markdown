Getting Started With accumulo / sbt
===================================

This is was originally created to help someone solve [Acummulo-4073](https://issues.apache.org/jira/browse/ACCUMULO-4073), but it turned out the solution requires no code changes, just to make sure that `fork in Test` is true for sbt so that it doesn't have it's own class loader in the mix when accumulo mini tries to do its thing, so this repo is offered in the spirit of documentation and resolution to the ticket. To run the test simple invoke (mac / linux only, tested on linux):

`./sbt test`

Which uses the paulp sbt script to bootstrap. If you have a windows machine you'll need your own sbt installed.
