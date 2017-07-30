package example

import example.MapReduce._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
 class MapReduceSuite extends FunSuite {

 test("mapReduce identity") {
   assert(mapReduceIntsSum(1,6) === 21)
   assert(mapReduce(identity)((a, b) => a + b, 0)(1,6) === 21)
   assert(mapReduceIntsProd(1,6) === 720)
   assert(mapReduce(identity)((a, b) => a * b, 1)(1,6) === 720)
 }

 test("mapReduce cubes") {
   assert(mapReduceCubesSum(1,3) === 36)
   assert(mapReduce(cube)((a, b) => a + b, 0)(1,3) === 36)
   assert(mapReduceCubesProd(1,3) === 216)
   assert(mapReduce(cube)((a, b) => a * b, 1)(1,3) === 216)
 }

 test("mapReduce factorials") {
   assert(mapReduceFactorialsSum(1,5) === 153)
   assert(mapReduce(factorial)((a, b) => a + b, 0)(1,5) === 153)
   assert(mapReduceFactorialsProd(1,5) === 34560)
   assert(mapReduce(factorial)((a, b) => a * b, 1)(1,5) === 34560)
 }
}
