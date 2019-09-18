public class Ex6 {
  public static void main(String[] args) {
    System.out.println(isDoubloon(args[0]));
  }

  public static boolean isDoubloon(String s) {
    s = s.toLowerCase();
    int[] counters = new int[26];
    for (int i = 0; i < s.length(); i++) {
      counters[s.charAt(i) - 'a']++;
    }
    for (int counter : counters) {
      if (counter % 2 != 0 || counter > 2) {
        return false;
      }
    }
    return true;
  }
}
