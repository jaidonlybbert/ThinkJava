public class Ex4 {
  public static void main(String[] args) {
    int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(indexOfMax(a));
  }

  public static int indexOfMax(int[] numbers) {
    int max = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > numbers[max]) {
        max = i;
      }
    }
    return max;
  }

}
