class Animal { 
    void sound() { 
        System.out.println("Animal makes a sound"); 
    } 
} 
 
class Dog extends Animal { 
    // Overriding the sound method 
    @Override 
    void sound() { 
        System.out.println("Dog barks"); 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
        Animal myAnimal = new Animal(); // Animal reference and object 
        myAnimal.sound(); // Calls Animal's method 
 
        Animal myDog = new Dog(); // Animal reference but Dog object 
        myDog.sound(); // Calls Dog's overridden method 
    } 
} 