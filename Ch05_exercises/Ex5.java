public class Ex5 {
  public static void printSong(int n) {
    if (n == 0) {
      System.out.println("No bottles of beer on the wall,\nno bottles of beer,\nya' can't" +
              " take one down, ya' can't pass it around,\n'cause there are no" +
              " more bottles of beer on the wall!\n");
    }
    else {
      System.out.printf("%d bottles of beer on the wall,\n%d bottles of beer,\nya'" +
              " take one down, ya' pass it around,\n", n, n);
      printSong(n-1);
    }
  }
  public static void main(String[] args) {
    printSong(3);
  }
}
