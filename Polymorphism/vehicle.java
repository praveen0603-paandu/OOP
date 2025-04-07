public class Car { 
    String brand; 
    int year; 
 
    // Constructor 
    Car(String b, int y) { 
        brand = b; 
        year = y; 
    } 
 
    // Method to display car info 
    void display() { 
        System.out.println("Brand: " + brand); 
        System.out.println("Year: " + year); 
    } 
 
    // Main method to run the program 
    public static void main(String[] args) { 
        // Creating an object of Car using constructor 
        Car myCar = new Car("Toyota", 2022); 
 
        // Displaying car details 
        myCar.display(); 
    } 
} 