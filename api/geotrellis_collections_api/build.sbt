enablePlugins(JavaAppPackaging)

name := "geotrellis_collections_api"
organization := ""
version := "1.0"
scalaVersion := "2.11.8"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV       = "2.4.16"
  val akkaHttpV   = "10.0.1"
  val scalaTestV  = "3.0.1"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-stream" % akkaV,
    "com.typesafe.akka" %% "akka-testkit" % akkaV,
    "com.typesafe.akka" %% "akka-http" % akkaHttpV,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpV,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpV,
    "org.scalatest"     %% "scalatest" % scalaTestV % "test",
    "org.locationtech.geotrellis" %% "geotrellis-raster" % "1.1.0-RC2",
    "org.locationtech.geotrellis" %% "geotrellis-vector" % "1.1.0-RC2",
    "org.locationtech.geotrellis" %% "geotrellis-spark" % "1.1.0-RC2",
    "org.apache.spark" %% "spark-core" % "2.1.1",
    "ch.megard" %% "akka-http-cors" % "0.2.1"
  )
}

Revolver.settings
