name := "S99"

version := "1.0.0"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-deprecation")

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "org.specs2" %% "specs2-core" % "3.6.4" % "test"

libraryDependencies += "junit" % "junit" % "4.12" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")
