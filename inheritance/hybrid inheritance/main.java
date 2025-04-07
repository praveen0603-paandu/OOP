interface A { 
    void showA(); 
} 
 
// Class B implements A 
class B implements A { 
    public void showA() { 
        System.out.println("Showing A from B"); 
    } 
     
    public void showB() { 
        System.out.println("Showing B"); 
    } 
} 
 
// Class C 
class C { 
    public void showC() { 
        System.out.println("Showing C"); 
    } 
} 
 
// Class D extends C and uses B (Hybrid Inheritance) 
class D extends C { 
    B b = new B(); // using composition to access B's methods 
 
    public void showAll() { 
        b.showA(); 
        b.showB(); 
        showC(); 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
        D obj = new D(); 
        obj.showAll(); 
    } 
} 