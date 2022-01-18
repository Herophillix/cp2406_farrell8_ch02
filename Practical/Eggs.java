import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        final int EGG_PER_DOZEN = 12;
        final double PRICE_PER_DOZEN = 3.25;
        final double PRICE_PER_EGG = 0.45;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many eggs do you want to buy? ");
        int egg = scanner.nextInt();
        int dozen = egg / EGG_PER_DOZEN;
        int looseEgg = egg % EGG_PER_DOZEN;

        double totalPrice = dozen * PRICE_PER_DOZEN + looseEgg * PRICE_PER_EGG;

        String dozenOutput = dozen > 0 ? dozen + " dozen at $" + PRICE_PER_DOZEN + " per dozen" : "";
        String looseEggOutput = looseEgg > 0 ? (dozen > 0 ? " and " : "" ) +
                looseEgg + " loose eggs at $" + PRICE_PER_EGG + " per egg" : "";

        String output = "You've ordered " + egg + " eggs. That's " + dozenOutput + looseEggOutput +
                " for a total of $" + totalPrice;
        System.out.println(output);
    }
}