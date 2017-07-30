package example

object Prod {

  def prod(f: Int => Int)(a: Int, b: Int): Int = {
    def sumRec(a: Int, acc: Int): Int =
      if (a > b) acc
      else sumRec(a + 1, f(a) * acc)

    sumRec(a, 1)
  }

  def identity(x: Int): Int = x
  def cube(x: Int): Int = x * x * x
  def factorial(x: Int): Int = if (x == 0) 1 else x * factorial(x-1)

  def prodInts = prod(x => x)_
  def prodCubes = prod(x => x * x * x)_
  def prodFactorials = prod(factorial)_
}
