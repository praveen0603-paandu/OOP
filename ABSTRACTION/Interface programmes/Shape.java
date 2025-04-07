import java.lang.Math;  
 
interface Shape {  
    double area();  
    double perimeter();  
}  
 
// Circle class implementing Shape interface 
class Circle implements Shape {  
    private double radius;  
     
    public Circle(double radius) {  
        this.radius = radius;  
    }  
     
    public double area() {  
        return Math.PI * radius * radius;  
    }  
     
    public double perimeter() {  
        return 2 * Math.PI * radius;  
    }  
}  
 
// Rectangle class implementing Shape interface 
class Rectangle implements Shape {  
    private double width, height;  
     
    public Rectangle(double width, double height) {  
        this.width = width;  
        this.height = height;  
    }  
     
    public double area() {  
        return width * height;  
    }  
     
    public double perimeter() {  
        return 2 * (width + height);  
    }  
}  
 
// Main class to test the Shape interface and its implementations 
public class Main { 
    public static void main(String[] args) { 
        // Create a Circle object 
        Shape circle = new Circle(5.0); 
        System.out.println("Circle Area: " + circle.area()); 
        System.out.println("Circle Perimeter: " + circle.perimeter()); 
 
        // Create a Rectangle object 
        Shape rectangle = new Rectangle(4.0, 6.0); 
        System.out.println("Rectangle Area: " + rectangle.area()); 
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter()); 
    } 
} 