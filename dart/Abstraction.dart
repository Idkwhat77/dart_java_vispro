// Abstraction implementation in dart

// Parent class
abstract class Abstraction {

    void doNothing();
}

// AbstractionChild inherits methods in its parent
// And does their own version of that method

class AbstractionChild extends Abstraction {

    @override
    void doNothing() {
        print("I do nothing but technically I still did something...???");
    }

}

void main() {
    AbstractionChild obj = AbstractionChild();
    obj.doNothing(); // Shows abstraction
}
