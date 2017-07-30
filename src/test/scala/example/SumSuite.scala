package example

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import example.Sum.sumInts
import example.Sum.sumCubes
import example.Sum.sumFactorials
import example.Sum.sum
import example.Sum.identity
import example.Sum.cube
import example.Sum.factorial

 @RunWith(classOf[JUnitRunner])
  class SumSuite extends FunSuite {

  test("sum(1,6)=20") {
    assert(sumInts(1,6) === 21)
    assert(sum(identity)(1,6) === 21)
  }

  test("sumCubes(1,6)=20") {
    assert(sumCubes(1,3) === 36)
    assert(sum(cube)(1,3) === 36)
  }

  test("sumFactorials(1,5)=153") {
    assert(sumFactorials(1,5) === 153)
    assert(sum(factorial)(1,5) === 153)
  }
}
