import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args)  {
        final double ADULT_PRICE = 7.00;
        final double ADULT_COST = 4.35;
        final double CHILD_PRICE = 4.00;
        final double CHILD_COST = 3.10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of adult meals: ");
        int adultMeal = scanner.nextInt();
        System.out.println("Input number of child meals: ");
        int childMeal = scanner.nextInt();

        double adultTotalPrice = round(adultMeal * ADULT_PRICE);
        double adultTotalCost = round(adultMeal * ADULT_COST);
        double adultTotalProfit = round(adultTotalPrice - adultTotalCost);
        double childTotalPrice = round(childMeal * CHILD_PRICE);
        double childTotalCost = round(childMeal * CHILD_COST);
        double childTotalProfit = round(childTotalPrice - childTotalCost);

        System.out.println("ADULT :");
        System.out.println("Price : " + adultMeal + " x $" + ADULT_PRICE + ": $" + adultTotalPrice);
        System.out.println("Cost  : " + adultMeal + " x $" + ADULT_COST + ": $" + adultTotalCost);
        System.out.println("Profit: " + "$" + adultTotalPrice + " - $" + adultTotalCost + ": $" + adultTotalProfit);
        System.out.println("CHILD :");
        System.out.println("Price : " + childMeal + " x $" + CHILD_PRICE + ": $" + childTotalPrice);
        System.out.println("Cost  : " + childMeal + " x $" + CHILD_COST + ": $" + childTotalCost);
        System.out.println("Profit: " + "$" + childTotalPrice + " - $" + childTotalCost + ": $" + childTotalProfit);
        System.out.println("TOTAL :");
        System.out.println("Price : $" + (adultTotalPrice + childTotalPrice));
        System.out.println("Cost  : $" + (adultTotalCost + childTotalCost));
        System.out.println("Profit: $" + (adultTotalProfit + childTotalProfit));

    }

    public static double round(double input)
    {
        return (double)Math.round(input * 100) / 100;
    }
}