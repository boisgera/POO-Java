import java.math.BigInteger;

public class Fraction {
  protected int numerator;
  protected int denominator;

  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
    this.simplify();
  }

  public Fraction(int numerator) {
    this(numerator, 1);
  }

  protected void simplify() {
    int gcd;
    gcd = (BigInteger.valueOf(this.numerator)).gcd(BigInteger.valueOf(this.denominator)).intValue();
    this.numerator = this.numerator / gcd;
    this.denominator = this.denominator / gcd;
    if (this.denominator < 0) {
      this.numerator = - this.numerator;
      this.denominator = - this.denominator;
    }
  }

  public Fraction add(Fraction other) {
    int num, den;
    num = this.numerator * other.denominator + this.denominator * other.numerator;
    den = this.denominator * other.denominator;
    return new Fraction(num, den);
  }

  public String toString() {
    if (this.denominator == 1) {
        return (new Integer(this.numerator)).toString();
    } else {
      return (new Integer(this.numerator)).toString() + "/" + (new Integer(this.denominator)).toString();
    }
  }
}