import java.util.Arrays;

public class Ex5 {
  public static void main(String[] args) {
    boolean[] primes = sieve(30);
    for (int i = 0; i < primes.length; i++) {
      System.out.println(primes[i]);
    }
  }

  public static boolean[] sieve(int n) {
    int[] numbers = new int[n];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i;
    }

    boolean[] primes = new boolean[n];
    Arrays.fill(primes, true);
    primes[0] = false;
    primes[1] = false;

    int p = 1;
    int currentNumber;
    while(true) {
      p = findP(primes, p);
      if (p == -1) break;

      currentNumber = p * p;
      while(currentNumber < primes.length) {
        primes[currentNumber] = false;
        currentNumber += p;
      }
    }

    return primes;
  }

  public static int findP(boolean[] primes, int p) {
    for (int i = p + 1; i < primes.length; i++) {
      if (primes[i]) {
        return i;
      }
    }
    return -1;
  }

}
