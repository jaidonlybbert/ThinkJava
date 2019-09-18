public class Ex5 {
  public static void main(String[] args) {
    System.out.println(isAbecedarian(args[0]));
  }

  public static boolean isAbecedarian(String s) {
    s = s.toLowerCase();
    if (s.length() == 1 || s.length() == 0) {
      return true;
    } else if (s.charAt(1) >= s.charAt(0) && isAbecedarian(s.substring(1))) {
      return true;
    } else {
      return false;
    }
  }
}
