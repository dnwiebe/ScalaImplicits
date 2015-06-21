package methods.explicitp

import org.scalatest.path

/**
 * Created by dnwiebe on 3/8/15.
 */
class ConversionTest extends path.FunSpec {

  def convert (str: String): Int = Integer.parseInt (str)
  def convert (int: Int): String = Integer.toString (int)
  def add (a: Int, b: Int): Int = a + b

  describe ("Given numbers in string form") {
    val a = "12"
    val b = "24"

    describe ("you can add them together if you convert them") {
      val result = convert (add (convert (a), convert (b)))

      it ("and get what you'd expect") {
        assert (result === "36")
      }
    }
  }
}
