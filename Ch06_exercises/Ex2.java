public class Ex2 {
  public static void main(String[] args) {
    System.out.println(isDivisible(5, 4));
  }

  public static boolean isDivisible(int n, int m) {
    if (n % m == 0) return true;
    else return false;
  }
}
