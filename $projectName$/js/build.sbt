import sbt.Keys.resolvers
lazy val $projectName$JS = (project in file("."))
  .settings(
    name := "$projectName$JS",
    version := "$appVersion$",
    scalaVersion := "$scalaVersion$",
    resolvers += "aliyun-js" at "http://maven.aliyun.com/repository/central",
    resolvers += "bintray" at "https://dl.bintray.com/definitelyscala/maven/",
    resolvers += Classpaths.typesafeReleases,
    resolvers += Resolver.jcenterRepo,
    resolvers += Resolver.sonatypeRepo("releases"),
    scalaJSUseMainModuleInitializer := true,
		
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7",

    //npmDependencies in Compile += "table" -> "5.4.5"
  )
  .enablePlugins(ScalaJSBundlerPlugin)
  .enablePlugins(ScalaJSPlugin)

// Automatically generate index-dev.html which uses *-fastopt.js
//  resourceGenerators in Compile += Def.task {
//    val source = (resourceDirectory in Compile).value / "index.html"
//    val target = (resourceManaged in Compile).value / "index-dev.html"
//
//    val fullFileName = (artifactPath in(Compile, fullOptJS)).value.getName
//    val fastFileName = (artifactPath in(Compile, fastOptJS)).value.getName
//
//    IO.writeLines(target,
//      IO.readLines(source).map {
//        line => line.replace(fullFileName, fastFileName)
//      }
//    )
//
//    Seq(target)
//  }.taskValue, 


