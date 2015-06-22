package methods.implicitp

class CapitalizableString (s: String) {
  def asTitle: String = new classes.ForImporting.CapitalizableString (s).asTitle
}

object ForMonkeyPatch {
  implicit def convert (s: String): CapitalizableString = new CapitalizableString (s)
}
