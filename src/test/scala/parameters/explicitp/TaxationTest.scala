package parameters.explicitp

import org.scalatest.path

/**
 * Created by dnwiebe on 3/8/15.
 */
class TaxationTest extends path.FunSpec {
  describe ("A Commerce, with an available Taxation") {
    val subject = new Commerce ()
    val taxation = new Taxation (90)

    describe ("when alerted that someone with $40 has earned $50") {
      val result = subject.earn (40, 50, taxation)

      it ("confiscates 10%") {
        assert (result === 81)
      }
    }
  }
}
