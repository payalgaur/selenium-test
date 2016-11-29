name := """selenium-test-freebird"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.53.0" % "test", 
  "org.seleniumhq.selenium" % "selenium-firefox-driver" % "2.53.0",
  "org.seleniumhq.selenium" % "selenium-htmlunit-driver" % "2.52.0"
)

