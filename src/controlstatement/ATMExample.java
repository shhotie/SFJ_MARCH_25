package controlstatement;

import java.util.Scanner;

public class ATMExample {
    public static void main(String[] args) {
        // ATM pin validation
        Scanner sc = new Scanner(System.in);
        int correctPin =1234;
        int userPin;
        System.out.println("Plaase enter the pin");
        userPin = sc.nextInt();

        while (userPin != correctPin){
            System.out.println("Incorrect pin please try again");
            System.out.println("Plaase enter the pin");
            userPin = sc.nextInt();
        }

        System.out.println("Access Granted, Welcome!!!");
        sc.close();
    }
}
