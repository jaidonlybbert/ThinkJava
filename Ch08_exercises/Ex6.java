public class Ex6 {

  public static void main(String[] args) {
    int[] a = {1, 2, 5, 10};
    System.out.println(areFactors(10, a));
    int[] b = {2, 23, 4};
    System.out.println(arePrimeFactors(46, b));
  }

  public static boolean areFactors(int n, int[] a) {
    for (int i : a) {
      if (n % i == 0) continue;
      else return false;
    }
    return true;
  }

  public static boolean arePrimeFactors(int n, int[] a) {
    int prod = 1;
    for (int i : a) {
      if (isPrime(i)) prod *= i;
      else return false;
    }
    if (prod == n) return true;
    else return false;
  }

  public static boolean isPrime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
      else continue;
    }
    return true;
  }

}
