class Rational(x: Int, y: Int) {
  require(y != 0, "denominator cannot be zero")

  private def gcd(a: Int, b: Int): Int =
    if (a == 0) b else gcd(b % a, a)

  private val scale = gcd(x, y)
  val numer = x / scale
  val denom = y / scale

  override def toString = numer + "/" + denom
}

new Rational(1,3)
new Rational(6,3)
