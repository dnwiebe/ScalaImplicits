package methods.implicitp

import java.util

import org.scalatest.path
import scala.collection.JavaConversions._

/**
 * Created by dnwiebe on 6/22/15.
 */
class JavaConversionsTest extends path.FunSpec {
  describe ("A scrawny, wimpy little Java list") {
    val javaList = util.Arrays.asList (3, 2, 1)

    it ("can apparently be directly mapped with JavaConversions") {
      assert (javaList.map {_ * 2} === List (6, 4, 2))
    }
  }
}
