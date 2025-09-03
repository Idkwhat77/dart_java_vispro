// Declaring a class in Dart with attributes and methods

class Ami {

    // Attributes
    // Without type declaration (automatically sets type as the assigned value's type when ran)
    var name = "Ami";
    var age = 18;
    var dead = false;

    // With type declaration (? in front means can be null, otherwise can't)
    String hairColor = "Brown";
    String? eyeColor;

    // Methods
    void doNothing() {
        print("$name is doing nothing...");
    }
}

void main() {

    // Create object (instance) of the class
    Ami obj = Ami();

    // Direct print instead of System.out (like python)
    // Supports interpolation by using ${}
    print("${obj.name} is ${obj.age} years old.");
    obj.doNothing();
}
