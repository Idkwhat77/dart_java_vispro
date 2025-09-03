// Inheritance implementation in dart

// Parent class
class Mommy {
    
    String? name;
    int? age;
    bool? dead;

    void doNothing() {
        print("I do nothing!");
    }
}

// Child inherits methods and attributes from its parent
// Also can add extra methods or attributes

class Child extends Mommy {

    void doNothing2() {
        print("I do nothing... again!");
    }

}

void main() {
    Child obj = Child();
    obj.doNothing(); // Shows inheritance
    obj.doNothing2();

    // Show that Child also has attributes of its parents
    obj.name = "Child";
    obj.age = 5;
    obj.dead = false;

    print("${obj.name} is ${obj.age} years old.");
}