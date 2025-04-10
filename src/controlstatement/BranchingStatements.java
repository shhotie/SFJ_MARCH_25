package controlstatement;

public class BranchingStatements {
    // return = exit from the current method
    public static int add(int a, int b){
    return a+b;
    }
    public static void main(String[] args) {
        System.out.println(BranchingStatements.add(10,20));

        // break = when we want to exit the loop
        for (int i =1; i <=5; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }

        // continue = skip the itration
        System.out.println("Continue statement example = ");
        for (int i =1; i <=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }



    }
}
