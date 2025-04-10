package controlstatement;

public class LoopingStatements {
//    for(initialization; condition; update)
public static void main(String[] args) {
    // WAP where no starts from 1
    // increament by 1 untill it reaches 5
    // printing the count of each tine

    for (int i=1; i<= 5; i++){
        System.out.println("Count = " + i);
    }

    // Syntax of while loo[p
/*    while(condition){

        // block of code
    }*/

    int j =1;
    // WAP where j increamented untill it exceeds 5
    // printing the count
    while(j <= 5){
        System.out.println("Count :" +j);
        j++;
    }

    // do while
    int k =1;
    do{
        // WAP where j increamented untill it exceeds 5
        // printing the count
            System.out.println("Count :" +k);
            k++;
    }while ( k<= 5);
}
}
