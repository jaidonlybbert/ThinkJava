import java.util.Scanner;
import java.util.Random;

public class Ex7 {
  static Scanner in = new Scanner(System.in);

  public static void playGame(int guess, int answer) {
    if (guess == answer) {
      System.out.println("Correct!");
    } else {
      if (guess < answer) {
        System.out.println("Too low!");
      } else {
        System.out.println("Too high!");
      }
      guess = newGuess();
      playGame(guess, answer);
    }
  }


  public static int newGuess() {
    System.out.print("Enter guess: ");
    int guess = in.nextInt();
    return guess;
  }


  public static void main(String[] args) {
    Random random = new Random();
    int answer = random.nextInt(100) + 1;
    System.out.print("I'm thinking of a number between 1 and 100\n");
    int guess = newGuess();

    playGame(guess, answer);
    }


}
