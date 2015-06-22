package classes.implicitp

import org.scalatest.path
import classes.ForImporting.CapitalizableString

class MonkeyPatchTest extends path.FunSpec {

  describe ("An ordinary, standard, everyday String") {
    val text = "now and then,  an innocent man is  sent to the Legislature."

    describe ("capitalized with the help of an IMPLICIT utility class") {
      val capitalized = text.asTitle

      it ("comes out capitalized without any explicit mention of the utility class except in the imports") {
        assert (capitalized === "Now And Then,  An Innocent Man Is  Sent To The Legislature.")
      }
    }
  }
}
