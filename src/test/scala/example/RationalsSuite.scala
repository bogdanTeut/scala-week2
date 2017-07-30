package example

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class RationalsSuite extends FunSuite {

  test("add") {
    val x = new Rational(1, 3)
    val y = new Rational(5, 7)

    assert(x.add(y) === new Rational(22, 21))
  }

  test("sub") {
    val x = new Rational(1, 3)
    val y = new Rational(5, 7)

    assert((x - y) === new Rational(-8, 21))
  }

  test("neg") {
    val x = new Rational(1, 3)

    assert(new Rational(-1, 3) === -x)
  }

  test("less") {
    val x = new Rational(1, 3)
    val y = new Rational(5, 7)

    assert((x < y) === true)
  }

  test("max") {
    val x = new Rational(1, 3)
    val y = new Rational(5, 7)

    assert((x max y) === y)
  }

  test("require") {
    intercept[IllegalArgumentException] {
      new Rational(1, 0)
    }
  }

  test("simplification") {
    val x = new Rational(49, 14)

    assert(x.equals(new Rational(49, 14)))
    assert(x.toString.equals("7/2"))
  }
}
