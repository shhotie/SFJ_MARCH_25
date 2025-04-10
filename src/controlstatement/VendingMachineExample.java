package controlstatement;

import java.util.Scanner;

public class VendingMachineExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMoney = 0;
        int snackCost = 10;
        do {
            System.out.println("The snack cpst Rs. 10");
            System.out.println("You have inserted Rs." + totalMoney);
            if(totalMoney < snackCost){
                System.out.println("Insert more money: ");
                int inserted = scanner.nextInt();
                totalMoney += inserted;
            }
        } while (totalMoney < snackCost);
        System.out.println("Enough Money Inserted. Despensing the snack. Enjoy!!!");
        scanner.close();
    }
}
