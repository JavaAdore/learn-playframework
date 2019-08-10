name := """learn-playframework"""
organization := "com.eltaieb"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.0"



libraryDependencies ++= Seq(guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test,
  "joda-time" % "joda-time" % "2.10.3",
  "com.google.code.gson" % "gson" % "2.8.5",
  "com.typesafe.play" %% "play-json" % "2.7.4"



)
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.eltaieb.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.eltaieb.binders._"
