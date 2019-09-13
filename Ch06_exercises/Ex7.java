public class Ex7 {
  public static void main(String[] args) {
    System.out.println(oddSum(9));
  }

  public static int oddSum(int n) {
    int result;
    if (n == 1) {
      return n;
    } else if (n % 2 != 0) {
      result = n + oddSum(n - 1);
      return result;
    } else if (n % 2 == 0) {
      return oddSum(n - 1);
    } else {
      System.out.println("Error");
      return 0;
    }
  }
}
