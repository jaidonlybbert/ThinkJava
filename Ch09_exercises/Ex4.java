public class Ex4 {
  public static void main(String[] args) {
    printString("banana\n");
    printBackward("\nbanana");
    System.out.println(reverseString("banana"));
    System.out.println(isPalindrome("racecarb"));

  }

  public static char first(String s) {
      return s.charAt(0);
  }

  public static String rest(String s) {
      return s.substring(1);
  }

  public static String middle(String s) {
      return s.substring(1, s.length() - 1);
  }

  public static int length(String s) {
      return s.length();
  }

  public static void printString(String s) {
    int length = length(s);
    for (int i = 0; i < length; i++) {
      System.out.println(first(s));
      s = rest(s);
    }
  }

  public static void printBackward(String s) {
    if (length(s) != 0) {
      printBackward(rest(s));
      System.out.println(first(s));
    }
  }

  public static String reverseString(String s) {
    String newString = "";
    if (length(s) == 1) {
      return s;
    } else {
      newString += reverseString(rest(s));
      return newString + first(s);
    }
  }

  public static boolean isPalindrome(String s) {
    if (length(s) == 1) {
      return true;
    } else if (length(s) == 2 && first(s) == first(rest(s))) {
      return true;
    } else if (length(s) == 2 && first(s) != first(rest(s))) {
      return false;
    } else {
      return isPalindrome(middle(s)) && first(s) == first(reverseString(s));
    }
  }


}
