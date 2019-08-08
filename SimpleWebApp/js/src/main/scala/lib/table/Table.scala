package lib.table

import com.definitelyscala.table.{JoinStruct, TableUserConfig}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
@JSImport("table",JSImport.Namespace)
@js.native
object Table extends js.Object {
  type borderType = String | String | String | String
  def table(data: js.Array[js.Any], userConfig: TableUserConfig = js.native): String = js.native
  def createStream(userConfig: TableUserConfig): js.Any = js.native
  def getBorderCharacters(templateName: borderType): JoinStruct = js.native
}