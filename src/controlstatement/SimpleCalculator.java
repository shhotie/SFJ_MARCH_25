package controlstatement;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Enter first no");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();

        System.out.println("Choose Operation +, -, *, /, %");
        char operator = scanner.next().charAt(0);

        switch (operator){
            case '+' :
                System.out.println("Result = " + (num1 + num2));
                break;
            case '-' :
                System.out.println("Result = " + (num1 - num2));
                break;
            case '*' :
                System.out.println("Result = " + (num1 * num2));
                break;
            case '/' :
                System.out.println("Result = " + (num1 / num2));
                break;
            case '%' :
                System.out.println("Result = " + (num1 % num2));
                break;
            default :
                System.out.println("Invalid Operator");
                break;
        }

    }
}
