public class Ex4 {
  public static void main(String[] args) {
    System.out.println(factorial(Integer.parseInt(args[0])));
  }

  public static int factorial(int n) {
    int result = 1;
    while(n > 0) {
        result *= n;
        n--;
    }
    return result;
  }

}
