package parameters.implicitp

import org.scalatest.path

/**
  * Created by dnwiebe on 3/8/15.
  */
class TaxationTest extends path.FunSpec {
  describe ("A Commerce, with implicit and explicit Taxations") {
    val subject = new Commerce ()
    val explicitTaxation = new Taxation (110)
    implicit val implicitTaxation = new Taxation (90)

    describe ("when alerted that someone in a subsidized interest group with $40 has earned $50") {
      val result = subject.earn (40, 50)(explicitTaxation)

      it ("contributes 10%") {
        assert (result === 99)
      }
    }

    describe ("when alerted that someone with $40 has earned $50") {
      val result = subject.earn (40, 50)

      it ("confiscates 10%") {
        assert (result === 81)
      }
    }

    describe ("when alerted that someone specifically in the productive class with $40 has earned $50") {
      val result = subject.earn (40, 50)(implicitTaxation)

      it ("confiscates 10%") {
        assert (result === 81)
      }
    }
  }
}
