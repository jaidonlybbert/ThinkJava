public class Rational {
  int numerator, denominator;

  public Rational() {
    numerator = 0;
    denominator = 0;
  }

  public Rational(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public void printRational() {
    System.out.printf("%d/%d\n", numerator, denominator);
  }

  public String toString() {
    return String.format("%d/%d\n", numerator, denominator);
  }

  public void negate() {
    this.numerator *= -1;
  }

  public void invert() {
    int temp = Math.abs(numerator);
    numerator = numerator / temp * denominator;
    denominator = temp;
  }

  public double toDouble() {
    return ((double) numerator / (double) denominator);
  }

  public Rational reduce() {
    int num = numerator;
    int den = denominator;
    while (num > 0 && den > 0) {
      if (num == den) {
        return new Rational(numerator / num, denominator / den);
      } else if (num > den) {
        num = num - den;
      } else if (den > num) {
        den = den - num;
      } else {
        System.out.println("error");
      }
    }
    return new Rational(numerator, denominator);
  }

  public Rational add(Rational that) {
    int sumNum = (this.numerator * that.denominator) + (that.numerator * this.denominator);
    int sumDen = (this.denominator * that.denominator);
    Rational sum = new Rational(sumNum, sumDen);
    sum = sum.reduce();
    return sum;
  }

  public static void main(String[] args) {
    Rational r = new Rational();
    r.numerator = 9;
    r.denominator = 3;
    r = r.reduce();
    r.printRational();
    r.negate();
    r.printRational();
    r.invert();
    r.printRational();
    System.out.println(r.toDouble() + "\n\n");

    Rational a = new Rational(5, 16);
    Rational b = new Rational(4, 8);
    Rational c = a.add(b);
    c.printRational();
  }
}
