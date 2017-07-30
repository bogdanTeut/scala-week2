package example

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be non zero")
  private def gcd(a: Int, b: Int): Int =  if (b == 0) a else gcd(b, a%b)

  def numer = x
  def denom = y

  def add(that: Rational): Rational =
    new Rational(
      this.numer * that.denom + this.denom * that.numer,
      this.denom * that.denom
    )

  def - (that: Rational): Rational = this.add(-that)

  def unary_- = new Rational(-this.numer, this.denom)

  def < (that: Rational) = this.numer * that.denom < this.denom * that.numer

  def max(that: Rational) = if (this < that) that else this

  override def toString: String = {
    val g = gcd(x, y)
    this.numer/g + "/" + this.denom/g
  }

  override def equals(that: scala.Any): Boolean =
    that match {
      case that: Rational => this.denom.equals(that.denom)
      case _ => false
    }
}
