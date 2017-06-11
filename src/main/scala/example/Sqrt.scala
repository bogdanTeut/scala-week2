package example

object Sqrt {

  def sqrt(number: Double, initialGuess: Double): Double = {

    def isGoodEnough(guess: Double): Boolean = (guess*guess - number).abs/number < 0.0001

    def improve(guess: Double): Double = (guess + number/guess)/2

    def sqrtIt(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIt(improve(guess))

    sqrtIt(initialGuess);
  }


}
