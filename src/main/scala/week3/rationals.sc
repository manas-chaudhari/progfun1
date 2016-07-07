class Rational(x: Int, y: Int) {
  require(y != 0, "denominator cannot be zero")

  def numer = x
  def denom = y

  override def toString = x + "/" + y
}

new Rational(1,3)