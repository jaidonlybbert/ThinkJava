import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        double cel = in.nextDouble();
        double fahr = cel *  9 / 5  + 32;
        System.out.printf("%.3f cel = %.2f fahr\n", cel, fahr);
        }
}
