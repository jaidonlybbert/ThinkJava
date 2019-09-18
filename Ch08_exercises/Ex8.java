public class Ex8 {
  public static void main(String[] args) {
    int[] a = { 3, 4, 8, 19, 7, 35, 46, 2, 1, 13, 19, 7, 3, 41 };
    System.out.println(maxInRange(a, 0, 13));
    System.out.println(max(a));
  }

  public static int maxInRange(int[] a, int lowIndex, int highIndex) {
    if (lowIndex == highIndex) {
      return a[lowIndex];
    } else {
      int mid1 = ((highIndex - lowIndex) / 2) + lowIndex;
      int mid2 = mid1 + 1;
      int x = maxInRange(a, lowIndex, mid1);
      int y = maxInRange(a, mid2, highIndex);
      if (x > y) {
        return x;
      } else {
        return y;
      }
    }
  }

  public static int max(int[] a) {
    return (maxInRange(a, 0, a.length - 1));
  }
}
