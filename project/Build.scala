import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "template-shootout"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "eu.delving" %% "groovy-templates-plugin" % "1.1"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      resolvers += "Delving Releases Repository" at "http://development.delving.org:8081/nexus/content/groups/public"
    )

}
