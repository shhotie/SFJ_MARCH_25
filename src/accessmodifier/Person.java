package accessmodifier;

public class Person {
    // private variable
    private int age;

    // private method
    private void displayAge(){
        System.out.println("Age = " + age);
    }

    public void setAge(int age){
        this.age = age;
        displayAge();
    }
    public static void main(String[] args) {
    Person person = new Person();
    person.setAge(18);
    }
}
