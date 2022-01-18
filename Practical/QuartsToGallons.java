public class QuartsToGallons {
    public static void main(String[] args) {
        final int QUART_PER_GALLON = 4;
        int quartNeeded = 18;
        int gallon = quartNeeded / QUART_PER_GALLON;
        int quart = quartNeeded % 4;

        String output = "A job that needs " + quartNeeded + " quarts " +
                "requires " + gallon + " gallon(s) plus " + quart + " quart(s)";
        System.out.println(output);
    }
}