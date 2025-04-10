package controlstatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Menu driven
        //Infinite loop unless and until user choose to exit
        // switch, break, continue
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Simple Calculator");
            System.out.println("Enter first no");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number");
            double num2 = scanner.nextDouble();

            System.out.println("Choose Operation");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Result = " + (num1 + num2));
                    break;
                case 2 :
                    System.out.println("Result = " + (num1 - num2));
                    break;
                case 3 :
                    System.out.println("Result = " + (num1 * num2));
                    break;
                case 4 :
                    if (num2 == 0) {
                        System.out.println("Divide by zero is not allowed");
                        continue;
                        // skip the remaining code
                    }

                    System.out.println("Result = " + (num1 / num2));
                    break;
                default :
                    System.out.println("Invalid choice");
                    continue;

        }
            System.out.println("Do you want to perform any other operation ? (Y / N)");
             char again = scanner.next().charAt(0);
             if (again == 'n' || again == 'N'){
                 System.out.println("Thank you for using the calculator");
                 break;
             }
        }
        scanner.close();
    }
}
