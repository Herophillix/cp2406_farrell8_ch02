public class NauticalMiles {
    public static void main(String[] args) {
        final double KM_PER_NMI = 1.852;
        final double MI_PER_NMI = 1.150779;

        double distance_nmi = 20;
        double distance_km = distance_nmi * KM_PER_NMI;
        double distance_mi = distance_nmi * MI_PER_NMI;

        System.out.println(distance_nmi + " nmi is equal to " + distance_km + " km");
        System.out.println(distance_nmi + " nmi is equal to " + distance_mi + " mi");
    }
}