class Rational(x: Int, y: Int) {
  require(y != 0, "denominator cannot be zero")

  private def gcd(a: Int, b: Int): Int =
    if (a == 0) b else gcd(b % a, a)

  private val scale = gcd(x, y)
  val numer = x / scale
  val denom = y / scale

  override def toString = numer + "/" + denom

  def + (that: Rational): Rational = {
    new Rational(
      this.numer * that.denom + that.numer * this.denom,
      this.denom * that.denom
    )
  }

  def unary_- = new Rational(-numer, denom)

  def - (that: Rational) = this + -that
}

val x = new Rational(1,3)
val y = new Rational(6,3)
-y
x + y
x - y