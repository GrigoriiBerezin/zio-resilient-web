import Dependencies.*

lazy val commonProject: Project = project.settings(
  scalaVersion := "3.6.1",
  version := "0.1.0-SNAPSHOT",
  organization := "ru.tcsbank.resilient",
  organizationName := "web-resilient",
)

lazy val root = (commonProject in file("."))
  .settings(
    name := "zio-resilient-web",
    libraryDependencies ++= Seq(zio, zioTest),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
