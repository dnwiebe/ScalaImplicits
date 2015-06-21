package methods.implicitp

/**
 * Created by dnwiebe on 3/8/15.
 */
object ForImporting {
  implicit def convert (str: String): Int = Integer.parseInt (str)
  implicit def convert (int: Int): String = Integer.toString (int)
}
