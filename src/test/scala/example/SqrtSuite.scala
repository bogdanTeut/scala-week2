package example

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import example.Sqrt.sqrt

@RunWith(classOf[JUnitRunner])
class SqrtSuite extends FunSuite {

 test("sqrt(2) ~= 1.4142") {
   assert(~=(sqrt(2, 1), 1.4142, 0.0001))
 }

 test("sqrt(0.1e60) ~= 1.0000000031080746E30") {
   assert(~=(sqrt(1e60, 1), 1.0000000031080746E30, 0.0001))
 }

 def ~=(a: Double, b: Double, precision: Double): Boolean =
   (a-b).abs < precision

}
