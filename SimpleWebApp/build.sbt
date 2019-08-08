import sbtcrossproject.CrossPlugin.autoImport.{CrossType, crossProject}
val ScalatraVersion = "$scalatraVersion$"
lazy val $projectName$ = crossProject(JSPlatform, JVMPlatform).crossType(CrossType.Dummy).in(file(".")).
  settings(
    name := "$projectName$",
    version := "$appVersion$",
    scalaVersion := "$scalaVersion$"
  ).
  jvmSettings(
    name := "jvm",
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
      "ch.qos.logback" % "logback-classic" % "1.2.3" /* % "runtime"*/ ,
      //加上runtime的话, 在sbt中运行就会提示没有日志实现类
      "org.eclipse.jetty" % "jetty-webapp" % "9.4.9.v20180320" % "container; compile",
      "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
    )
  ).
  jsSettings(
    name := "js"
  )
  .enablePlugins(ScalaJSBundlerPlugin)
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(SbtTwirl)
  .enablePlugins(ScalatraPlugin)
//lazy val js = project
//lazy val jvm = project

lazy val _jvm = $projectName$.jvm
lazy val _js = $projectName$.js
