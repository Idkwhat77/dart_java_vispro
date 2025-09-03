// Encapsulation implementation in dart

// Parent class
class RandomGuyIdk {

    String _name = "Guy";
    int _age = 19;
    bool _dead = false;

    // Getter and Setter for Name
    String get name => _name;

    set name(String newName) {
        this._name = newName;
    }

    // Getter and Setter for Age
    int get age => _age;

    set age(int newAge) {
        this._age = newAge;
    }

    // Getter and Setter for Dead
    bool get dead => _dead;

    set dead(bool newDead) {
        this._dead = newDead;
    }
}

void main() {
    RandomGuyIdk obj = RandomGuyIdk();

    // This will not work (if main is in different file)
    /*
      * obj._name = "MewMew";
      * obj._age = 18;
      * obj._dead = false;
      */

    // Must be directly accessed through getters and setters
    obj.name = "MewMew";
    obj.age = 18;
    obj.dead = false;

    print("${obj.name} is ${obj.age} years old.");
    print("Is ${obj.name} dead? ${obj.dead}");
}
