public class Ex6 {
  public static void main(String[] args) {
    System.out.println(gauss(4, 100));
  }

  public static double gauss(double x, int n) {
    double sum = 1;
    double lastTerm = 1;
    double newTerm;
    for (int i = 1; i < n; i++) {
      newTerm = (-lastTerm * x * x) / (i);
      sum += newTerm;
      lastTerm = newTerm;
      System.out.println(sum);
    }
    return sum;
  }
}
