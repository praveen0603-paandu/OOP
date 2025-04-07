// Base class
class Grandfather {
    void skills() {
        System.out.println("Grandfather: Woodworking, Farming");
    }
}

// Intermediate class
class Father extends Grandfather {
    void skills() {
        super.skills(); // Call Grandfather's skills
        System.out.println("Father: Gardening, Carpentry");
    }
}

// Derived class
class Child extends Father {
    void skills() {
        super.skills(); // Call Father's skills
        System.out.println("Child: Programming, Painting");
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Child myChild = new Child();
        myChild.skills(); // Call the skills method
    }
}