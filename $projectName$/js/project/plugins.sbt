addSbtPlugin("org.scala-js" % "sbt-scalajs"% $scalajsVersion$)
$if(scalajsIs06Version.truthy)$
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % $scalajsBundleVersion$-0.6)
$else$
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % $scalajsBundleVersion$)
$endif$
//The plugin requires Scala.js 0.6.26+ or 1.0.0-M7 and either sbt 0.13.17+ or 1.0.2+.