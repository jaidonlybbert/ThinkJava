

public class Ex5 {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      check(0.1 * Math.pow(10, i));
    }
  }

  public static double myexp(double x, int n) {
    double result = 0;
    for (int i = 0; i <= n; i++) {
      System.out.println(factorial(i));
      result += (Math.pow(x, i) / factorial(i));
    }
    return result;
  }

  public static double factorial(int n) {
    double result = 1;
    while(n > 0) {
        result *= n;
        n--;
    }
    return result;
  }

  public static void check(double x) {
    System.out.println(x + "\t" + myexp(x, 20) + "\t" + Math.exp(x));
  }
}
