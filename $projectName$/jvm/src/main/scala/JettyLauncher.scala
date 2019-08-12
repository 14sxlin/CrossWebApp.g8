import org.eclipse.jetty.server.Server
import org.eclipse.jetty.webapp.WebAppContext
import org.scalatra.servlet.ScalatraListener
import total.objk.RootServlet

object JettyLauncher { // this is my entry object as specified in sbt project definition
  def main(args: Array[String]) {
    val port =
      if(System.getenv("PORT") != null) System.getenv("PORT").toInt
      else 8123

    val server = new Server(port)
    val context = new WebAppContext()
    context setContextPath "/"
    val resourceBase =
      Option(getClass.getClassLoader.getResource("webapp")).map(_.toExternalForm).getOrElse(
        Option(getClass.getClassLoader.getResource(".")).map(_.toExternalForm).getOrElse("")
      )
    context.setResourceBase(resourceBase)
    context.addEventListener(new ScalatraListener)
    context.addServlet(classOf[RootServlet], "/")

    server.setHandler(context)

    server.start()
    server.join()
  }
}