package parameters.implicitp

import org.scalatest.path
import parameters.implicitp.ForImporting.taxation

/**
  * Created by dnwiebe on 3/8/15.
  */
class TaxationImportTest extends path.FunSpec {
  describe ("A Commerce, with a Taxation available through import") {
    val subject = new Commerce ()

    describe ("when alerted that someone with $40 has earned $50") {
      val result = subject.earn (40, 50)

      it ("confiscates half") {
        assert (result === 40 + 50 - 25)
      }
    }
  }
}
