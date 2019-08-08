package linsixin.app

import org.scalatra._
class respServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
