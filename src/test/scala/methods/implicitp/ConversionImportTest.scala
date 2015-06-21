package methods.implicitp

import org.scalatest.path
import methods.implicitp.ForImporting.convert

/**
  * Created by dnwiebe on 3/8/15.
  */
class ConversionImportTest extends path.FunSpec {

   def add (a: Int, b: Int): Int = a + b

   describe ("Given numbers in string form under the proper import") {
     val a = "12"
     val b = "24"

     describe ("you can add them together with implicit conversions") {
       val result: String = add (a, b)

       it ("and get what you'd expect") {
         assert (result === "36")
       }
     }
   }
 }
