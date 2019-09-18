public class Ex8 {
  public static void main(String[] args) {
    System.out.println(canSpell(args[0], args[1]));
  }

  public static boolean canSpell(String tiles, String word) {
    tiles = tiles.toLowerCase();
    word = word.toLowerCase();
    int[] tCounters = new int[26];
    int[] wCounters = new int[26];
    for (int i = 0; i < tiles.length(); i++) {
      tCounters[tiles.charAt(i) - 'a']++;
    }
    for (int i = 0; i < word.length(); i++) {
      wCounters[word.charAt(i) - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
      if (tCounters[i] < wCounters[i]) return false;
    }
    return true;
  }
}
