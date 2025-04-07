public class Greeter { 
 
    // Method with no parameters 
    public void greet() { 
        System.out.println("Hello!"); 
    } 
 
    // Overloaded method with one parameter 
    public void greet(String name) { 
        System.out.println("Hello, " + name + "!"); 
    } 
 
    // Overloaded method with two parameters 
    public void greet(String name, int age) { 
        System.out.println("Hello, " + name + "! You are " + age + " years old."); 
    } 
 
    public static void main(String[] args) { 
        Greeter greeter = new Greeter(); 
        greeter.greet(); 
        greeter.greet("Alice"); 
        greeter.greet("Bob", 25); 
    } 
}