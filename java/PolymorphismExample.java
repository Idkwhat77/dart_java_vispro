// Parent class
class Animal {
    public void makeSound() {
        System.out.println("idk okay?");
    }
}

// Child classes override parent method
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Parent reference, different child objects
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // Both use the same method name, but act differently
        a1.makeSound(); // Woof!
        a2.makeSound(); // Meow!
    }
}
