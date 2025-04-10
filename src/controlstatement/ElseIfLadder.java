package controlstatement;

import java.util.Scanner;

public class ElseIfLadder {
    public static void main(String[] args) {
        // WAP to check whether the no is +ve -ve or zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("+ve no");
        } else if (num < 0) {
            System.out.println("-ve no");
        } else {
            System.out.println("Zero");
        }
    }
}
