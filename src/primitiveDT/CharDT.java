package primitiveDT;

public class CharDT {
    public static void main(String[] args) {
        /*
        size = 2B bcz of unicode char
        default = \u0000;
         */
        char letter = '\u0051';
        char l1 = '9';
        char l2 = 65;
        char l3 = 'A';
        System.out.println(l3);
        System.out.println(l1);
        System.out.println(l2); // A
        // Java treats character as an integer
        System.out.println(letter);
    }
}
