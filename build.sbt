ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file("."))
  .settings(
    name := "Ejercicio1"
  )
libraryDependencies += "com.nrinaudo" %% "kantan.csv" % "0.6.2"
libraryDependencies += "com.nrinaudo" %% "kantan.csv-generic" % "0.6.2"
