interface Engine { 
    void start(); 
} 
 
interface MusicSystem { 
    void playMusic(); 
} 
 
class Car { 
    void drive() { 
        System.out.println("Driving car"); 
    } 
} 
 
// Hybrid: MyCar extends Car and implements multiple interfaces 
class MyCar extends Car implements Engine, MusicSystem { 
    public void start() { 
        System.out.println("Engine started"); 
    } 
 
    public void playMusic() { 
        System.out.println("Playing music"); 
    } 
} 
 
public class Main2 { 
    public static void main(String[] args) { 
        MyCar car = new MyCar(); 
        car.start(); 
        car.playMusic(); 
        car.drive(); 
    } 
} 