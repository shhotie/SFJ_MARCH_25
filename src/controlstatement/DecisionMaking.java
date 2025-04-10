package controlstatement;

import nonprimitive.StringTester;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        // if => it execute block of code if condition is correct
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        /*
        if(condition){
        // block of code
        }
         */

        /*
        if(condition){
        // block of code
        }else{
        // if condition is not true then this block of code execute
        }
         */

        if(age >= 18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }
}
