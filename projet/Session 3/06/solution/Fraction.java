import java.math.BigInteger;

public class Fraction {
  private int numerator;
  private int denominator;

  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    if (denominator == 0) {
      throw new IllegalArgumentException("dénominateur nul.");
    }
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

  public Fraction multiply(Fraction other) {
    int num, den;
    num = this.numerator * other.numerator;
    den = this.denominator * other.denominator;
    return new Fraction(num, den);
  }

  public String toString() {
    if (this.denominator == 1) {
        return Integer.valueOf(this.numerator).toString();
    } else {
      return Integer.valueOf(this.numerator).toString() + "/" + Integer.valueOf(this.denominator).toString();
    }
  }
}