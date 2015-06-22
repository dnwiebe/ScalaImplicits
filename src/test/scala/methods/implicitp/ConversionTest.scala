package methods.implicitp

import org.scalatest.path

/**
  * Created by dnwiebe on 3/8/15.
  */
class ConversionTest extends path.FunSpec {

   implicit def convert (str: String): Int = Integer.parseInt (str)
   implicit def convert (int: Int): String = Integer.toString (int)
   def add (a: Int, b: Int): Int = a + b

   describe ("Given numbers in string form") {
     val a = "12"
     val b = "24"

     describe ("you can add them together with implicit conversions") {
       val result: String = add (a, b)

       it ("and get what you'd expect") {
         assert (result === "36")
       }
     }

     describe ("if you allow type inference on the result") {
       val result = add (a, b)

       it ("the compiler will take the easy way out") {
         assert (result === 36)
       }
     }
   }
 }
