public class Initials {
    public static void main(String[] args) {
        char[] initials = {'J', 'M', 'L'};
        for(int i = 0; i < initials.length; ++i)
        {
            String ending = i == initials.length - 1 ? "\n" : ".";
            System.out.print(initials[i] + ending);
        }
    }
}