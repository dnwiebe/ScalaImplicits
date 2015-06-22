package parameters.implicitp

/**
  * Created by dnwiebe on 3/8/15.
  */
class Taxation (percent: Int) {
  def tax (value: Int) = (value * percent) / 100
}
