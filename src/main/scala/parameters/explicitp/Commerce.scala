package parameters.explicitp

/**
 * Created by dnwiebe on 3/8/15.
 */
class Commerce {
  def earn (previousBalance: Int, wage: Int, taxation: Taxation): Int = {
    taxation.tax (previousBalance + wage)
  }
}
