package linsixin.app

class respServletTests extends ScalatraFunSuite {

  addServlet(classOf[respServlet], "/*")

  test("GET / on respServlet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
