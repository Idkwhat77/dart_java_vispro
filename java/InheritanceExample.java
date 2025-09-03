// Inheritance implementation in java

// Parent class
class Mommy {
    
    String name;
    int age;
    boolean dead;

    public void doNothing() {
        System.out.println("I do nothing!");
    }
}

// Child inherits methods and attributes from its parent
// Also can add extra methods or attributes

class Child extends Mommy {

    public void doNothing2() {
        System.out.println("I do nothing... again!");
    }

}

public class InheritanceExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.doNothing(); // Shows inheritance
        obj.doNothing2();

        // Show that Child also has attributes of its parents
        obj.name = "Child";
        obj.age = 5;
        obj.dead = false;

        System.out.println(obj.name + " is " + obj.age + " years old.");
    }
}

