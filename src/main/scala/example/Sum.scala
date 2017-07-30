package example

object Sum {

  //def sumInts(a: Int, b: Int): Int =
    //if(a > b) 0
    //else a + sumInts(a+1, b)

  //def sumCubes(a: Int, b: Int): Int =
  //  if(a > b) 0
    //else a*a*a + sumCubes(a+1, b)

  //def sumFactorials(a: Int, b: Int): Int =
  //  if(a > b) 0
    //else factorial(a) + sumFactorials(a+1, b)

//  def sumInts(a: Int, b: Int) = sum(identity, a, b)
//  def sumCubes(a: Int, b: Int) = sum(cube, a, b)
//  def sumFactorials(a: Int, b: Int) = sum(factorial, a, b)

//  def sum(f: Int => Int, a: Int, b: Int): Int =
//    if(a > b) 0
//    else f(a) + sum(f, a+1, b)

//  def sum(f: Int => Int, a: Int, b: Int): Int = {
//    def sumRec(a: Int, acc: Int): Int =
//      if (a > b) acc
//      else sumRec(a+1, f(a) + acc)
//
//    sumRec(a, 0)
//  }

//  def sumInts(a: Int, b: Int) = sum(x => x, a, b)
//  def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)
//  def sumFactorials(a: Int, b: Int) = sum(factorial, a, b)

//  def sum(f: Int => Int):(Int, Int) => Int = {
//    def sumF(a: Int, b: Int): Int = {
//      def sumRec(a: Int, acc: Int): Int =
//        if (a > b) acc
//        else sumRec(a + 1, f(a) + acc)
//
//      sumRec(a, 0)
//    }
//
//    sumF
//  }

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def sumRec(a: Int, acc: Int): Int =
      if (a > b) acc
      else sumRec(a + 1, f(a) + acc)

    sumRec(a, 0)
  }

  def identity(x: Int): Int = x
  def cube(x: Int): Int = x * x * x
  def factorial(x: Int): Int = if (x == 0) 1 else x * factorial(x-1)

  def sumInts = sum(x => x)_
  def sumCubes = sum(x => x * x * x)_
  def sumFactorials = sum(factorial)_
}
