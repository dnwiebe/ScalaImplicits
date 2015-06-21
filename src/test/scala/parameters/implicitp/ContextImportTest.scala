package parameters.implicitp

import org.scalatest.path
import parameters.implicitp.ForImporting.context

/**
  * Created by dnwiebe on 3/8/15.
  */
class ContextImportTest extends path.FunSpec {
  describe ("A Collaborator, with a Context available through import") {
    val subject = new Collaborator ()

    describe ("when asked for the answer to an addition problem") {
      val result = subject.add (40, 50)

      it ("returns the answer modified by the imported context") {
        assert (result === 45)
      }
    }
  }
}
