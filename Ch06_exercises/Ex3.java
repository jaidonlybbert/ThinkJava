public class Ex3 {
  public static void main(String[] args) {
    System.out.println(isTriangle(Integer.parseInt(args[0]),
                        Integer.parseInt(args[1]), Integer.parseInt(args[2])));
  }
  public static boolean isTriangle(int a, int b, int c) {
    if (a + b > c && b + c > a && c + a > b) return true;
    else return false;
  }
}
