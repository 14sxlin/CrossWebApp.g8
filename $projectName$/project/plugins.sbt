//crossProjectPlugins
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "$crossProjectVersion$")
//addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "$crossProjectVersion$")
addSbtPlugin("org.scala-js" % "sbt-scalajs"% "$scalajsVersion$")
//addSbtPlugin("org.scala-native" % "sbt-scala-native" % "$sbtScalaNativeVersion$")

//jvm plugins
addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "$sbtTwirlVersion$")
addSbtPlugin("org.scalatra.sbt" % "sbt-scalatra" % "$sbtScalatraVersion$")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "$sbtAssemblyVersion$")

//js plugins
$if(scalajsIs06Version.truthy)$
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "$scalajsBundleVersion$-0.6")
$else$
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "$scalajsBundleVersion$")
$endif$
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "$sbtDependencyGraphVersion$")