fork in Test := true

libraryDependencies ++= Seq(
  "org.apache.accumulo" % "accumulo" % "1.7.0",
  "org.slf4j" % "slf4j-api" % "1.7.13",
  "org.slf4j" % "slf4j-log4j12" % "1.7.13",

  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
