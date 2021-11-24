import java.util.Scanner;
public class InchesToFeetInteractive {
    public static void main(String[] args) {
        final int INCH_PER_FOOT = 12;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Inches: ");
        int initialInches = scanner.nextInt();
        int foot = initialInches / INCH_PER_FOOT;
        int inch = initialInches % 4;

        String output = initialInches + " inch(es) is equal to " + foot + " foot/feet plus " + inch + " inch(es)";
        System.out.println(output);
    }
}