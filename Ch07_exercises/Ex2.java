import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double a = in.nextDouble();
    System.out.println(squareRoot(a));
  }

  public static double squareRoot(double a) {
    double guess = a / 2;
    double newGuess;
    while (true) {
      System.out.println("yee");
      newGuess = (guess + a / guess) / 2;
      if (Math.abs(newGuess - guess) < .0001) {
        break;
      }
      guess = newGuess;
    }
    return newGuess;
  }
}
