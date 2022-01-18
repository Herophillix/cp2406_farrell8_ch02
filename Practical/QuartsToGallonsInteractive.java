import java.util.Scanner;
public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int QUART_PER_GALLON = 4;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many quarts do you need for the job? ");
        int quartNeeded = scanner.nextInt();
        int gallon = quartNeeded / QUART_PER_GALLON;
        int quart = quartNeeded % 4;

        String output = "A job that needs " + quartNeeded + " quarts " +
                "requires " + gallon + " gallon(s) plus " + quart + " quart(s)";
        System.out.println(output);
    }
}