public class InchesToFeet {
    public static void main(String[] args) {
        final int INCH_PER_FOOT = 12;
        int initialInches = 86;
        int foot = initialInches / INCH_PER_FOOT;
        int inch = initialInches % 4;

        String output = initialInches + " inch(es) is equal to " + foot + " foot/feet plus " + inch + " inch(es)";
        System.out.println(output);
    }
}