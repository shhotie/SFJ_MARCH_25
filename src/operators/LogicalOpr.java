package operators;

public class LogicalOpr {
    public static void main(String[] args) {
        // && Operators
        System.out.println((5>3) && (8 > 5));
        // True && True // 1 && 1 => true

        System.out.println((5<3) || (8>5));

        System.out.println(!(5 == 3));
    }
}
