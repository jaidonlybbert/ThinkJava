public class Ex7 {
  public static void main(String args[]) {
    System.out.println(isAnagram(args[0], args[1]));
  }

  public static boolean isAnagram(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    int[] aCounters = new int[26];
    int[] bCounters = new int[26];
    for (int i = 0; i < a.length(); i++) {
      aCounters[a.charAt(i) - 'a']++;
    }
    for (int i = 0; i < b.length(); i++) {
      bCounters[b.charAt(i) - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
      if (aCounters[i] != bCounters[i]) return false;
    }
    return true;
  }
}
