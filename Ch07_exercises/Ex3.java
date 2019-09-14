public class Ex3 {
  public static void main(String[] args) {
    System.out.println(power(5.0, 2));
  }

  public static double power(double x, int n) {
    double answer = x;
    for (int i = n; i > 1; i--) {
      answer *= x;
    }
    return answer;
  }
}
