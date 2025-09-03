// Parent class
class Animal {
  void makeSound() {
    print("idk okay?");
  }
}

// Child classes override parent method
class Dog extends Animal {
  @override
  void makeSound() {
    print("Woof!");
  }
}

class Cat extends Animal {
  @override
  void makeSound() {
    print("Meow!");
  }
}

void main() {
  // Parent reference, different child objects
  Animal a1 = Dog();
  Animal a2 = Cat();

  // Both use the same method name, but act differently
  a1.makeSound(); // Woof!
  a2.makeSound(); // Meow!
}
