package example

import example.FixedPoints._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
 class FixedPointsSuite extends FunSuite {

 test("fixedPoint(x => 1+x/2)") {
   assert(fixedPoint(x => 1+x/2)(1) === 1.999755859375)
 }

  test("sqrt(2) ~= 1.4142") {
    assert(sqrt(2) === 1.4142135623746899)
  }

}
