package example

import example.Prod._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
 class ProdSuite extends FunSuite {

 test("prod(1,6)=20") {
   assert(prodInts(1,6) === 720)
   assert(prod(identity)(1,6) === 720)
 }

 test("prodCubes(1,6)=20") {
   assert(prodCubes(1,3) === 216)
   assert(prod(cube)(1,3) === 216)
 }

 test("prodFactorials(1,5)=153") {
   assert(prodFactorials(1,5) === 34560)
   assert(prod(factorial)(1,5) === 34560)
 }
}
