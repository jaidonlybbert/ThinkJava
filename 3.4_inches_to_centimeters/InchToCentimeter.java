import java.util.Scanner;

public class InchToCentimeter {
    public static void main(String[] args) {
        int inch;
        double cm;
        final double CM_PER_INCH = 2.54;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter inch measure: ");
        inch = in.nextInt();
        cm = inch * CM_PER_INCH;

        System.out.print(inch + " in = ");
        System.out.println(cm + " cm.");
    }
}        
