package parameters.explicitp

/**
 * Created by dnwiebe on 3/8/15.
 */
class Context (percent: Int) {
  def modify (value: Int) = (value * percent) / 100
}
