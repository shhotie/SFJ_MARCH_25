package operators;

public class UnaryOpr {
    public static void main(String[] args) {
        int a = 12, b=12;
        int result1, result2, result3, result4;
        System.out.println("Original val of a = "+ a +  "and b = " +b );
        // pre increament
        result1 = ++a;
        System.out.println("After increament = " + result1);
        // post increament
        result2 = a++;
        System.out.println("After post increwament = " + result2);
        System.out.println(result2);

        // pre decreament
        result3 = --a;
        System.out.println("After decreament = " + result3);
        // post decreament
        result4 = a--;
        System.out.println("After post decreament = " + result4);
    }
}
