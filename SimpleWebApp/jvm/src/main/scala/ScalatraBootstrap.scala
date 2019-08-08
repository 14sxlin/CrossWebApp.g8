import javax.servlet.ServletContext

import linsixin.app.respServlet
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new respServlet, "/*")
  }
}
