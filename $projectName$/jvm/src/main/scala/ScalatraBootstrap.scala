import javax.servlet.ServletContext

import $organization$.RootServlet
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new RootServlet, "/*")
  }
}
