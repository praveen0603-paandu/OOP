class Vehicle { 
    void start() { 
        System.out.println("Vehicle is starting."); 
    } 
} 
 
// Child class 1 
class Car extends Vehicle { 
    void drive() { 
        System.out.println("Car is driving."); 
    } 
} 
 
// Child class 2 
class Bike extends Vehicle { 
    void ride() { 
        System.out.println("Bike is riding."); 
    } 
} 
 
// Main class 
public class Transport { 
    public static void main(String[] args) { 
        Car car = new Car(); 
        car.start();  // from Vehicle 
        car.drive(); 
 
        Bike bike = new Bike(); 
        bike.start();  // from Vehicle 
        bike.ride(); 
    } 
}