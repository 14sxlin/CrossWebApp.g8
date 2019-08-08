package $organization$

import org.scalatra._
class RootServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
