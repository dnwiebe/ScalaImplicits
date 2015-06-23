package classes.implicitp

import java.util.Arrays

import org.scalatest.path
import scala.collection.JavaConverters._

/**
 * Created by dnwiebe on 6/22/15.
 */
class JavaConvertersTest extends path.FunSpec {
  describe ("A scrawny, wimpy little Java list") {
    val javaList = Arrays.asList (3, 2, 1)

    it ("cannot be mapped") {
      // javaList.map {_ * 2}
    }

    describe ("when converted to a beefy, strapping Scala list") {
      val scalaList = javaList.asScala

      it ("can be mapped") {
        assert (scalaList.map {_ * 2} === List (6, 4, 2))
      }
    }

    it ("can easily be mapped all in one statement") {
      assert (javaList.asScala.map {_ * 2} === List (6, 4, 2))
    }
  }
}
