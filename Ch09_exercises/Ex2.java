public class Ex2 {
  public static void main(String[] args) {
    int[] a = letterHist("banana");
    for (int i : a) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static int[] letterHist(String s) {
    int[] a = new int[26];
    s = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {
      a[s.charAt(i) - 'a']++;
    }
    return a;
  }

}
