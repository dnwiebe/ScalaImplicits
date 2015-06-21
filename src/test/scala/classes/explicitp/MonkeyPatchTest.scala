package classes.explicitp

import org.scalatest.path

/**
 * Created by dnwiebe on 3/9/15.
 */
class MonkeyPatchTest extends path.FunSpec {
  class CapitalizableString (string: String) {
    def asTitle: String = {
      string.foldLeft ((true, List[Char] ()))((soFar, char) => {
        val (wordBegin, capitalized) = soFar
        (wordBegin, char) match {
          case (_, ' ') => (true, ' ' :: capitalized)
          case (false, c) => (false, c :: capitalized)
          case (true, c) => (false, c.toUpper :: capitalized)
        }
      })._2.reverse.mkString
    }
  }

  describe ("A string") {
    val text = "now and then,  an innocent man is  sent to the Legislature."

    describe ("capitalized with the help of a utility class") {
      val capitalized = new CapitalizableString (text).asTitle

      it ("comes out capitalized") {
        assert (capitalized === "Now And Then,  An Innocent Man Is  Sent To The Legislature.")
      }
    }
  }
}
