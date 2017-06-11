package example

import example.Factorial.factorial
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FactorialSuite extends FunSuite {

 test("factorial(5) === 120") {
   assert(factorial(5) === 120)
 }

}
