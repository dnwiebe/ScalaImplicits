package parameters.implicitp

import org.scalatest.path

/**
  * Created by dnwiebe on 3/8/15.
  */
class MultipleParameterListsTest extends path.FunSpec {
  class BalanceTaxation (percent: Int) extends Taxation (percent)
  class IncomeTaxation (percent: Int) extends Taxation (percent)

  def add (balance: Int)(wage: Int)(implicit bt: BalanceTaxation, ic: IncomeTaxation) = bt.tax (balance) + ic.tax (wage)

  it ("Two implicit parameters in one list") {
    implicit val bt = new BalanceTaxation (70)
    implicit val it = new IncomeTaxation (120)
    val result = add (40)(50)(bt, it)

    assert (result === 28 + 60)
  }
}
