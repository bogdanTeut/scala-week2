package example

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import example.Conditionals.and
import example.Conditionals.or

 @RunWith(classOf[JUnitRunner])
  class ConditionalsSuite extends FunSuite {
 
  test("and(true, true) == true") {
    assert(and(true, true) === true)
  }

  test("and(true, false) == false") {
    assert(and(false, true) === false)
  }

  test("and(false, true) == false") {
    assert(and(false, true) === false)
  }

  test("and(false, false) == false") {
    assert(and(false, false) === false)
  }

  test("or(false, true) == false") {
    assert(or(false, true) === true)
  }

  test("or(true, true) == true") {
    assert(or(true, true) === true)
  }

  test("or(false, true) == true") {
    assert(or(true, true)  === true)
  }

  test("or(false, false) == false") {
    assert(or(false, false) === false)
  }
}
