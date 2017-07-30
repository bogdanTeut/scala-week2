package example

object FixedPoints {
  val tolerance = 0.0001
  def isCloseEnough(x: Double, y: Double): Boolean =
    Math.abs((x - y) / x) / x < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double): Double = {
    def iter(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iter(next)
    }
    iter(firstGuess)
  }

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x))/2

  def sqrt(x: Double): Double = fixedPoint(averageDamp(y => x/y))(1)
}
