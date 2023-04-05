public class Prog_2 {
    public static void main(String[] args) {
        String name = "\u0416\u0430\u0432\u0430\uD83D\uDC4B";
        System.out.println(name.length());
        System.out.println(name);
    }
}
//The length property returns the number of UTF-16 code units in the string
// In this case is 6 because the "waving hand" emoji takes up 2 code units.
