import sbt.*

object Dependencies {
  object V {
    val zio = "2.1.5"
  }

  val zio = "dev.zio" %% "zio" % V.zio
  val zioTest = "dev.zio" %% "zio-test" % V.zio % Test
}
