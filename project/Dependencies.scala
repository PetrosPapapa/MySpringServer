import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.11"

  lazy val springBootWeb =  "org.springframework.boot" % "spring-boot-starter-web" % "2.7.1"
  lazy val springBootDevtools =  "org.springframework.boot" % "spring-boot-devtools" % "2.7.1"

  lazy val jacksonScala = "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.13.2"
}
