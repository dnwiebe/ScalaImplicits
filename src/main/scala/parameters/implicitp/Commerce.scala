package parameters.implicitp

/**
  * Created by dnwiebe on 3/8/15.
  */
class Commerce {
  def earn (previousBalance: Int, wage: Int)(implicit taxation: Taxation): Int = {
    previousBalance + taxation.tax (wage)
  }
}
