package parameters.implicitp

/**
  * Created by dnwiebe on 3/8/15.
  */
class Collaborator {
  def add (a: Int, b: Int)(implicit context: Context): Int = {
    context.modify (a + b)
  }
}
