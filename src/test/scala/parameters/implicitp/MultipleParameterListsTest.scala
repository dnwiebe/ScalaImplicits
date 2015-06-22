package parameters.implicitp

import org.scalatest.path

/**
  * Created by dnwiebe on 3/8/15.
  */
class BalanceTaxation (percent: Int) extends Taxation (percent)
class IncomeTaxation (percent: Int) extends Taxation (percent)

class ExplicitMultipleParameterListsTest extends path.FunSpec {

  def earn (balance: Int)(wage: Int)(bt: BalanceTaxation, ic: IncomeTaxation) = bt.tax (balance) + ic.tax (wage)

  it ("Two implicit parameters in one list") {
    val bt = new BalanceTaxation (70)
    val it = new IncomeTaxation (120)
    val result = earn (40)(50)(bt, it)

    assert (result === (40 - 12) + (50 + 10))
  }
}

class ImplicitMultipleParameterListsTest extends path.FunSpec {

  def earn (balance: Int)(wage: Int)(implicit bt: BalanceTaxation, ic: IncomeTaxation) = bt.tax (balance) + ic.tax (wage)

  it ("Two implicit parameters in one list") {
    implicit val bt = new BalanceTaxation (70)
    implicit val it = new IncomeTaxation (120)
    val result = earn (40)(50)

    assert (result === (40 - 12) + (50 + 10))
  }
}

class ThingsThatDontWork {
  // Implicit parameter list that's not last
//  def earn (balance: Int, wage: Int)(implicit bt: BalanceTaxation)(ic: IncomeTaxation) =
//    bt.tax (balance) + ic.tax (wage)

  // Multiple implicit parameter lists
//  def earn (balance: Int, wage: Int)(implicit bt: BalanceTaxation)(implicit ic: IncomeTaxation) =
//    bt.tax (balance) + ic.tax (wage)
}
