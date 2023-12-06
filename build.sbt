ThisBuild / version := "VERSION-0.1.26"

ThisBuild / scalaVersion := "2.12.18"

lazy val root = (project in file("."))
  .settings(
    name := "DeExample",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-sql" % "3.5.0" % "provided",
      "org.apache.spark" %% "spark-core" % "3.5.0" % "provided",
      "com.databricks" %% "dbutils-api" % "0.0.6" % "provided"
    )
  )