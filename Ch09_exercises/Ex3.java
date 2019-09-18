public class Ex3 {
  public static void main(String[] args) {
    System.out.println(countParenthesis(args[0]));
  }

  public static int countParenthesis(String s) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == '(') {
            count++;
        } else if (c == ')') {
            count--;
        }
    }

    return count;
  }
}
