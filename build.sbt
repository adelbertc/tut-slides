lazy val buildSettings = List(
  organization := "com.adelbertc",
  licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
  scalaVersion := "2.11.7",
  crossScalaVersions := List("2.10.6", scalaVersion.value),
  version := "0.1.0-SNAPSHOT"
)

val scalazVersion = "7.2.0"

lazy val commonSettings = List(
  scalacOptions ++= List(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-language:existentials",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-unchecked",
    "-Xfatal-warnings",
    "-Xlint",
    "-Yno-adapted-args",
    "-Ywarn-dead-code",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard"
  ),
  libraryDependencies ++= List(
    compilerPlugin("org.spire-math" %% "kind-projector" % "0.7.1"),

    "org.typelevel" %% "cats" % "0.4.1"
  )
) ++ tutSettings

lazy val tutSlideSettings = buildSettings ++ commonSettings

lazy val tutSlide =
  project.in(file(".")).
  settings(name := "tut-slide").
  settings(description := "").
  settings(tutSlideSettings)
