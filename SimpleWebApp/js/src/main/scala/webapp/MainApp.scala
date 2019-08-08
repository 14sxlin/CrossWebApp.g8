package webapp

import lib.chart.ChartConfig.{Data, DataSet}
import lib.chart.{Chart, ChartConfig}
import lib.table.Table
import org.scalajs.dom.raw.HTMLPreElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportTopLevel
//只要导入和标准库名称冲突的就无法识别为main

//import scala.scalajs.js._ //导入这个之后就无法被识别为main

object MainApp { //extends App 是一定要的

  @JSExportTopLevel("showTable")
  def showTable(): Unit = {
    import org.scalajs.dom._
    val pre = document.createElement("pre").asInstanceOf[HTMLPreElement]
    pre.style.wordWrap = "pre"
    pre.innerHTML = Table.table(tableData())
    document.body.innerHTML = pre.outerHTML
  }

  @JSExportTopLevel("tableData")
  def tableData(): js.Array[js.Any] = {
    import scala.scalajs.js._
    val data: Array[Any] = Array(
      Array("1,2,3,4".split(",").map("a" + _): _*),
      Array("1,2,3,4".split(",").map("b" + _): _*),
      Array("1,2,3,4".split(",").map("c" + _): _*),
      Array("1,2,3,4".split(",").map("d" + _): _*)
    )
    data
  }

  @JSExportTopLevel("showChart")
  def showChart(): Chart = {
    import scala.scalajs.js.Array
    new Chart(
      "myChart",
      ChartConfig("bar",
        Data(
          Array("a", "b", "c"),
          DataSet("test", Array(1, 2, 3, 4, 5, 6)))))
  }

  def main(args: Array[String]): Unit = {
    import scala.scalajs.js._
    println(Table.table(tableData()))

    Dynamic.global.updateDynamic("showTable")(showTable _)
    Dynamic.global.updateDynamic("tableData")(tableData _)
    Dynamic.global.updateDynamic("showChart")(showChart _)

  }

}
