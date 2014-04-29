name := "S99"

version := "1.0.0"

scalaVersion := "2.11.0"

scalacOptions ++= Seq("-deprecation")

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.3" % "test"

libraryDependencies += "org.specs2" %% "specs2" % "2.3.11" % "test"

libraryDependencies += "junit" % "junit" % "4.11" % "test"

//libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.0"

scalacOptions in Test ++= Seq("-Yrangepos")
