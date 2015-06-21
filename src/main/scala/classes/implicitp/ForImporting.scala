package classes.implicitp

/**
  * Created by dnwiebe on 3/9/15.
  */

object ForImporting {
  implicit class CapitalizableString (string: String) {
    def asTitle: String = {
      string.foldLeft ((true, List[Char] ()))((soFar, char) => {
        val (wordBegin, capitalized) = soFar
        (wordBegin, char) match {
          case (_, ' ') => (true, ' ' :: capitalized)
          case (false, c) => (false, c :: capitalized)
          case (true, c) => (false, c.toUpper :: capitalized)
        }
      })._2.reverse.mkString
    }
  }
}
