package classes.implicitp

import org.scalatest.path
import classes.implicitp.ForImporting.CapitalizableString

class MonkeyPatchTest extends path.FunSpec {

  describe ("A string") {
    val text = "now and then,  an innocent man is  sent to the Legislature."

    describe ("capitalized with the help of an IMPLICIT utility class") {
      val capitalized = text.asTitle

      it ("comes out capitalized without any mention of CapitalizableString") {
        assert (capitalized === "Now And Then,  An Innocent Man Is  Sent To The Legislature.")
      }
    }
  }
}
