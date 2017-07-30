package example

object MapReduce {

  def mapReduce(f: Int => Int)(g: (Int, Int) => Int, init: Int)(a: Int, b: Int): Int = {
    def mapReduceRec(a: Int, acc: Int): Int =
      if (a > b) acc
      else mapReduceRec(a + 1, g(f(a), acc))

    mapReduceRec(a, init)
  }

  def identity(x: Int): Int = x
  def cube(x: Int): Int = x * x * x
  def factorial(x: Int): Int = if (x == 0) 1 else x * factorial(x-1)

  def mapReduceInts = mapReduce(x => x)_
  def mapReduceIntsSum = mapReduceInts((a, b) => a + b, 0)
  def mapReduceIntsProd = mapReduceInts((a, b) => a * b, 1)

  def mapReduceCubes = mapReduce(x => x * x * x)_
  def mapReduceCubesSum = mapReduceCubes((a, b) => a + b, 0)
  def mapReduceCubesProd = mapReduceCubes((a, b) => a * b, 1)

  def mapReduceFactorials = mapReduce(factorial)_
  def mapReduceFactorialsSum = mapReduceFactorials((a, b) => a + b, 0)
  def mapReduceFactorialsProd = mapReduceFactorials((a, b) => a * b, 1)
}
