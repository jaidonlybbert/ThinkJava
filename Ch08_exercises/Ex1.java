public class Ex1 {
  public static void main(String[] args) {
    double[] a = {5, 5, 4, 6, 8, 9};
    a = powArray(a, 2);
    printArray(a);
  }

  public static double[] powArray(double[] a, int power) {
    for (int i = 0; i < a.length; i++) {
        a[i] = Math.pow(a[i], power);
    }
    return a;
  }

  public static void printArray(double[] array) {
      System.out.print("{" + array[0]);
      for (int i = 1; i < array.length; i++) {
          System.out.print(", " + array[i]);
      }
      System.out.println("}");
  }

  public static int[] histogram(int[] scores) {
    int[] counts = new int[scores.length];
    for (int score : scores) {
      counts[score]++;
    }
    return counts;
  }
}
