import java.math.BigInteger;

public class Ex4 {
  public static void main(String[] args) {
    iFactorial();
  }

  public static void iFactorial() {
    BigInteger factorial;
    for (int i = 0; i < 75; i++) {
      factorial = BigInteger.valueOf(1);
      if (i > 1) {
        for (int j = 2; j <= i; j++) {
          factorial = factorial.multiply(BigInteger.valueOf(j));
        }
      }
      System.out.printf("%3d\t" + factorial.toString() + "\n", i);
    }
  }
}
