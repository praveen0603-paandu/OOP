class Animal { 
    void eat() { 
        System.out.println("This animal eats food."); 
    } 
} 
 
// Child class 1 
class Dog extends Animal { 
    void bark() { 
        System.out.println("The dog barks."); 
    } 
} 
 
// Child class 2 
class Cat extends Animal { 
    void meow() { 
        System.out.println("The cat meows."); 
    } 
} 
 
// Main class 
public class Main { 
    public static void main(String[] args) { 
        Dog dog = new Dog(); 
        dog.eat();  // from Animal 
        dog.bark(); 
 
        Cat cat = new Cat(); 
        cat.eat();  // from Animal 
        cat.meow(); 
    } 
}