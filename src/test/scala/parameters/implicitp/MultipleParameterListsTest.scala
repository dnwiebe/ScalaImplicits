package parameters.implicitp

import org.scalatest.path

/**
  * Created by dnwiebe on 3/8/15.
  */
class MultipleParameterListsTest extends path.FunSpec {
  class TypeA (percent: Int) extends Context (percent)
  class TypeB (percent: Int) extends Context (percent)

  def add (a: Int)(b: Int)(implicit ca: TypeA, cb: TypeB) = ca.modify (a) + cb.modify (b)

  it ("Two implicit parameters in one list") {
    implicit val ca = new TypeA (70)
    implicit val cb = new TypeB (120)
    val result = add (40)(50)(ca, cb)

    assert (result === 28 + 60)
  }
}
