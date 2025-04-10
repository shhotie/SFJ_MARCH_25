package operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // take input from user
        Scanner input = new Scanner(System.in);
        System.out.println(input instanceof Scanner);
        System.out.println("Enter your marks: ");
        double marks = input.nextDouble();

        String result = (marks > 40) ? "Pass" : "Fail";

        System.out.println("Result is " + result);


        input.close();

    }
}
