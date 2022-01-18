import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        final double ADULT_PRICE = 7.00;
        final double CHILD_PRICE = 4.00;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of adult meals: ");
        int adultMeal = scanner.nextInt();
        System.out.println("Input number of child meals: ");
        int childMeal = scanner.nextInt();

        double adultTotalPrice = adultMeal * ADULT_PRICE;
        double childTotalPrice = childMeal * CHILD_PRICE;

        System.out.println("ADULT:");
        System.out.println(adultMeal + " x $" + ADULT_PRICE + ": $" + adultTotalPrice);
        System.out.println("CHILD:");
        System.out.println(childMeal + " x $" + CHILD_PRICE + ": $" + childTotalPrice);
        System.out.println("TOTAL:");
        System.out.println("$" + (adultTotalPrice + childTotalPrice));

    }
}