public class Ex8 {
  public static void main(String[] args) {
    System.out.println(ack(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
  }

  public static int ack(int m, int n) {
    if (m == 0) {
      return (n + 1);
    } else if (m > 0 && n == 0) {
      return ack(m - 1, 1);
    } else if (m > 0 && n > 0) {
      return ack(m - 1, ack(m, n - 1));
    } else {
      System.out.println("Error no condition met.");
      return 0;
    }
  }
}
