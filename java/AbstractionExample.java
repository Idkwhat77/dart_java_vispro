// Abstraction implementation in java

// Parent class
abstract class Abstraction {
    
    public abstract void doNothing();
}

// AbstractionChild inherits methods in its parent
// And does their own version of that method

class AbstractionChild extends Abstraction {

    @Override
    public void doNothing() {
        System.out.println("I do nothing but technically I still did something...???");
    }

}

public class AbstractionExample {
    public static void main(String[] args) {
        AbstractionChild obj = new AbstractionChild();
        obj.doNothing(); // Shows abstraction/polymorphism
    }
}
