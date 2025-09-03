// Declaring a class in Java with attributes and methods

class Ami {

    // Attributes
    String name;
    int age;
    boolean dead;

    // Methods
    public void doNothing() {
        System.out.println(name + " is doing nothing...");
    }

    public static void main(String[] args) {

        // Create object (instance) of the class
        Ami obj = new Ami();
        obj.name = "Ami";
        obj.age = 18;

        System.out.println(obj.name + " is " + obj.age + " years old.");
        obj.doNothing();
    }
}
