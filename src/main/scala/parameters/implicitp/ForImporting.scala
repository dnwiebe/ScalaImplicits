package parameters.implicitp

/**
 * Created by dnwiebe on 3/8/15.
 */
object ForImporting {
  implicit def context: Context = new Context (50)
}
