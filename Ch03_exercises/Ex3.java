import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        int secInput = in.nextInt();
        int sec = secInput % 60;
        int hour = secInput / 3600;
        int min = (secInput - 3600 * hour) / 60;
        System.out.printf("%d sec = %d hours %d minutes %d seconds\n", secInput, hour, min, sec);
        }
}
