import java.util.Scanner;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randInt = random.nextInt(100) + 1;
        System.out.print("I'm thinking of a number between 1 and 100--take a guess: ");
        int guess = in.nextInt(); 
        
        System.out.printf("Your guess: %d\nMy number: %d\nYou were off by: %d\n", guess, randInt, randInt - guess);
        }
}
