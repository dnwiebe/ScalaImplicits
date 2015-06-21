package parameters.explicitp

import org.scalatest.path

/**
 * Created by dnwiebe on 3/8/15.
 */
class ContextTest extends path.FunSpec {
  describe ("A Collaborator, with an available Context") {
    val subject = new Collaborator ()
    val context = new Context (90)

    describe ("when asked for the answer to an addition problem, modified by the context") {
      val result = subject.add (40, 50, context)

      it ("returns the answer modified by the context") {
        assert (result === 81)
      }
    }
  }
}
