abstract class Vehicle { 
    protected String brand; 
    protected String model; 
 
    // Constructor 
    public Vehicle(String brand, String model) { 
        this.brand = brand; 
        this.model = model; 
    } 
 
    // Abstract method to start the vehicle 
    public abstract void start(); 
 
    // Abstract method to stop the vehicle 
    public abstract void stop(); 
 
    // Method to display vehicle details 
    public void displayDetails() { 
        System.out.println("Brand: " + brand); 
        System.out.println("Model: " + model); 
    } 
} 
 
// Car class extending Vehicle 
class Car extends Vehicle { 
    private int numberOfDoors; 
 
    // Constructor 
    public Car(String brand, String model, int numberOfDoors) { 
        super(brand, model); 
        this.numberOfDoors = numberOfDoors; 
    } 
 
    // Implementing start method 
    @Override 
    public void start() { 
        System.out.println("Car " + brand + " " + model + " is starting."); 
    } 
 
    // Implementing stop method 
    @Override 
    public void stop() { 
        System.out.println("Car " + brand + " " + model + " is stopping."); 
    } 
 
    // Method to display additional details 
    public void displayDetails() { 
        super.displayDetails(); 
        System.out.println("Number of Doors: " + numberOfDoors); 
    } 
} 
 
// Bicycle class extending Vehicle 
class Bicycle extends Vehicle { 
    private boolean hasBell; 
 
    // Constructor 
    public Bicycle(String brand, String model, boolean hasBell) { 
        super(brand, model); 
        this.hasBell = hasBell; 
    } 
 
    // Implementing start method 
    @Override 
    public void start() { 
        System.out.println("Bicycle " + brand + " " + model + " is starting."); 
    } 
 
    // Implementing stop method 
    @Override 
    public void stop() { 
        System.out.println("Bicycle " + brand + " " + model + " is stopping."); 
    } 
 
    // Method to display additional details 
    public void displayDetails() { 
        super.displayDetails(); 
        System.out.println("Has Bell: " + (hasBell ? "Yes" : "No")); 
    } 
} 
 
// Main class to test the Vehicle Management system 
public class Main { 
    public static void main(String[] args) { 
        // Create a Car object 
        Vehicle myCar = new Car("Toyota", "Camry", 4); 
        myCar.displayDetails(); 
        myCar.start(); 
        myCar.stop(); 
        System.out.println(); 
 
        // Create a Bicycle object 
        Vehicle myBicycle = new Bicycle("Giant", "Escape 3", true); 
        myBicycle.displayDetails(); 
        myBicycle.start(); 
        myBicycle.stop(); 
    } 
} 