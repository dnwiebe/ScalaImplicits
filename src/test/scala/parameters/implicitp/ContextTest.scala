package parameters.implicitp

import org.scalatest.path

/**
  * Created by dnwiebe on 3/8/15.
  */
class ContextTest extends path.FunSpec {
  describe ("A Collaborator, with implicit and explicit Contexts") {
    val subject = new Collaborator ()
    val explicitContext = new Context (110)
    implicit val implicitContext = new Context (90)

    describe ("when asked for the answer to an addition problem, specifying the explicit context") {
      val result = subject.add (40, 50)(explicitContext)

      it ("returns the answer modified by the explicit context") {
        assert (result === 99)
      }
    }

    describe ("when asked for the answer to an addition problem, without specifying a context") {
      val result = subject.add (40, 50)

      it ("returns the answer modified by the implicit context") {
        assert (result === 81)
      }
    }

    describe ("when asked for the answer to an addition problem, specifying the implicit context") {
      val result = subject.add (40, 50)(implicitContext)

      it ("returns the answer modified by the implicit context") {
        assert (result === 81)
      }
    }
  }
}
