import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        final double[] DENOMINATIONS = {0.20, 0.10, 0.05, 0.01};
        final String[] DENOMINATIONS_OUTPUT = {"Twenties", "Tens", "Fives", "Ones"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Dollar: ");
        double dollar = scanner.nextDouble();
        int[] counts = {0, 0, 0, 0};
        double remainder = dollar;
        for(int i = 0; i < DENOMINATIONS.length; ++i)
        {
            counts[i] = (int)(remainder / DENOMINATIONS[i]);
            remainder -= counts[i] * DENOMINATIONS[i];
        }

        System.out.println("Denominations: ");
        for(int i = 0; i < DENOMINATIONS.length; ++i)
        {
            System.out.println(DENOMINATIONS_OUTPUT[i] + ": " + counts[i]);
        }
    }
}