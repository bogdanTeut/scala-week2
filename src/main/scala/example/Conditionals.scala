package example

object Conditionals {
  //CBV
  //def and(x: Boolean, y: Boolean) = if (x) y else false

  //def or(x: Boolean, y: Boolean) = if (x) x else y

  //CBN
  def and(x: Boolean, y: => Boolean) = if (x) y else false

  def or(x: Boolean, y: => Boolean) = if (x) x else y
}
