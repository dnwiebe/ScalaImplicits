package classes.explicitp

import classes.ForImporting.CapitalizableString
import org.scalatest.path

/**
 * Created by dnwiebe on 3/9/15.
 */
class MonkeyPatchTest extends path.FunSpec {
  describe ("A CapitalizableString") {
    val text = new CapitalizableString ("now and then,  an innocent man is  sent to the Legislature.")

    describe ("capitalized") {
      val capitalized = text.asTitle

      it ("comes out capitalized. Amazing, right?") {
        assert (capitalized === "Now And Then,  An Innocent Man Is  Sent To The Legislature.")
      }
    }
  }
}
