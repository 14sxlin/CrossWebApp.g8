package webapp

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportTopLevel

//tips1 import scala.scalajs.js._ //导入这个之后就无法被识别为main
//tips2 只要导入和标准库名称冲突的就无法识别为main

object MainApp {

  def main(args: Array[String]): Unit = {
    import scala.scalajs.js._
    println("hello scalajs")
  }

}
