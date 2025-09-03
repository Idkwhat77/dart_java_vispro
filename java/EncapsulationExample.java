// Encapsulation implementation in java

// Parent class
class RandomGuyIdk {

    private String name;
    private int age;
    private boolean dead;

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be positive.");
        }
    }

    // Getter and Setter for Dead
    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        RandomGuyIdk obj = new RandomGuyIdk();

        // This will not work
        /*
         * obj.name = "MewMew";
         * obj.age = 18;
         * obj.dead = false;
         */

        // Must be directly accessed through getters and setters
        obj.setName("MewMew");
        obj.setAge(18);
        obj.setDead(false);

        System.out.println(obj.getName() + " is " + obj.getAge() + " years old.");
        System.out.println("Is " + obj.getName() + " dead? " + obj.isDead());
    }
}