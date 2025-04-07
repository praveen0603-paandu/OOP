// Interface A
interface A { 
    void methodA(); 
} 

// Interface B
interface B { 
    void methodB(); 
} 

// Class C implements both interfaces A and B
class C implements A, B { 
    // Implementing methodA from interface A
    public void methodA() { 
        System.out.println("This is method A"); 
    } 

    // Implementing methodB from interface B
    public void methodB() { 
        System.out.println("This is method B"); 
    } 
} 

// Main class to test the program
public class Main { 
    public static void main(String[] args) { 
        C obj = new C(); // Create an instance of class C
        obj.methodA();   // Call methodA
        obj.methodB();   // Call methodB
    } 
}