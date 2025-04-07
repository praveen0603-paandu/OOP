abstract class Shape { 
    // Abstract method to calculate area 
    public abstract double calculateArea(); 
     
    // Method to display the area 
    public void displayArea() { 
        System.out.println("The area is: " + calculateArea()); 
    } 
} 
 
// Circle class extending Shape 
class Circle extends Shape { 
    private double radius; 
 
    // Constructor 
    public Circle(double radius) { 
        this.radius = radius; 
    } 
 
    // Implementing calculateArea method 
    @Override 
    public double calculateArea() { 
        return Math.PI * radius * radius; // Area = πr² 
    } 
} 
 
// Rectangle class extending Shape 
class Rectangle extends Shape { 
    private double width; 
    private double height; 
 
    // Constructor 
    public Rectangle(double width, double height) { 
        this.width = width; 
        this.height = height; 
    } 
 
    // Implementing calculateArea method 
    @Override 
    public double calculateArea() { 
        return width * height; // Area = width * height 
    } 
} 
 
// Main class to test the Area Calculator 
public class Main { 
    public static void main(String[] args) { 
        // Create a Circle object 
        Shape circle = new Circle(5.0); 
        System.out.print("Circle "); 
        circle.displayArea(); 
 
        // Create a Rectangle object 
        Shape rectangle = new Rectangle(4.0, 6.0); 
        System.out.print("Rectangle "); 
        rectangle.displayArea(); 
    } 
} 