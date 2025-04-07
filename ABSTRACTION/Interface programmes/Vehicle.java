interface Vehicle {  
    void startEngine();  
    void stopEngine();  
}  
 
// Car class implementing Vehicle interface 
class Car implements Vehicle {  
    public void startEngine() {  
        System.out.println("Car engine started.");  
    }  
      
    public void stopEngine() {  
        System.out.println("Car engine stopped.");  
    }  
}  
 
// Bicycle class implementing Vehicle interface 
class Bicycle implements Vehicle {  
    public void startEngine() {  
        System.out.println("Bicycles do not have an engine.");  
    }  
      
    public void stopEngine() {  
        System.out.println("Bicycles do not have an engine to stop.");  
    }  
}  
 
// Main class to test the Vehicle interface and its implementations 
public class Main { 
    public static void main(String[] args) { 
        // Create a Car object 
        Vehicle myCar = new Car(); 
        myCar.startEngine(); 
        myCar.stopEngine(); 
 
        // Create a Bicycle object 
        Vehicle myBicycle = new Bicycle(); 
        myBicycle.startEngine(); 
        myBicycle.stopEngine(); 
    } 
} 