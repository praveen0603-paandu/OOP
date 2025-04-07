class Shape { 
    void area() { 
        System.out.println("Calculating area of a shape"); 
    } 
} 
 
class Circle extends Shape { 
    @Override 
    void area() { 
        System.out.println("Area of circle = π * r * r"); 
    } 
} 
 
public class TestOverride { 
    public static void main(String[] args) { 
        Shape s1 = new Shape(); 
        s1.area();  // Calls Shape's method 
 
        Shape s2 = new Circle(); 
        s2.area();  // Calls Circle's overridden method 
    } 
} 