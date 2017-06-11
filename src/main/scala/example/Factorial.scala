package example

object Factorial {
  def factorial(number: Int): Int = {
    def factorialIter(counter: Int, accumulator: Int): Int =
      if (counter == 0) accumulator
      else factorialIter(counter-1, accumulator * counter)

    factorialIter(number, 1)
  }
}
