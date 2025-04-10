package controlstatement;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no in between 1-7");
        int day = scanner.nextInt();

        switch (day){
            case 1 :
                System.out.println("Mon");
                break;

                case 2 :
                    System.out.println("Tue");
                    break;

            default:
                System.out.println("Invalid");
        }
    }
}
