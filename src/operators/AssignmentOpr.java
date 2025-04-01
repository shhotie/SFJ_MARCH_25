package operators;

public class AssignmentOpr {
    public static void main(String[] args) {
        int age;
        age = 5;
         //creating variables
        int a = 4; // declaration and initialization
        int var; // Initialize

        // Assign value using =
        var = a; //4
        System.out.println("var using = : "+var);

        //assign using +=
        var += a;
        // var = var + a // var = 4 + 4 = 8
        System.out.println("var using += : " + var);

        // assign using *=
        var *= a;
        System.out.println("Var using *= : "+ var);

        var %=a;  // 32 % 4
        System.out.println(var);
    }
}
