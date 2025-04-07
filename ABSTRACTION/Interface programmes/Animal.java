interface Animal { 
    void makeSound(); 
    void eat(); 
} 
 
// Dog class implementing Animal interface 
class Dog implements Animal { 
    @Override 
    public void makeSound() { 
        System.out.println("Woof!"); 
    } 
 
    @Override 
    public void eat() { 
        System.out.println("Dog is eating."); 
    } 
} 
 
// Cat class implementing Animal interface 
class Cat implements Animal { 
    @Override 
    public void makeSound() { 
        System.out.println("Meow!"); 
    } 
 
    @Override 
    public void eat() { 
        System.out.println("Cat is eating."); 
    } 
} 
 
// Main class to test the Animal interface and its implementations 
public class Main { 
    public static void main(String[] args) { 
        // Create a Dog object 
        Animal myDog = new Dog(); 
        myDog.makeSound(); 
        myDog.eat(); 
 
        // Create a Cat object 
        Animal myCat = new Cat(); 
        myCat.makeSound(); 
        myCat.eat(); 
    } 
} 