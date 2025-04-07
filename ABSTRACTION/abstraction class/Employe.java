abstract class Employee { 
    protected String name; 
    protected String id; 
 
    // Constructor 
    public Employee(String name, String id) { 
        this.name = name; 
        this.id = id; 
    } 
 
    // Abstract method to calculate salary 
    public abstract double calculateSalary(); 
 
    // Method to display employee details 
    public void displayDetails() { 
        System.out.println("Employee ID: " + id); 
        System.out.println("Employee Name: " + name); 
    } 
} 
 
// FullTimeEmployee class extending Employee 
class FullTimeEmployee extends Employee { 
    private double monthlySalary; 
 
    // Constructor 
    public FullTimeEmployee(String name, String id, double monthlySalary) { 
        super(name, id); 
        this.monthlySalary = monthlySalary; 
    } 
 
    // Implementing calculateSalary method 
    @Override 
    public double calculateSalary() { 
        return monthlySalary; 
    } 
} 
 
// PartTimeEmployee class extending Employee 
class PartTimeEmployee extends Employee { 
    private double hourlyRate; 
    private int hoursWorked; 
 
    // Constructor 
    public PartTimeEmployee(String name, String id, double hourlyRate, int 
hoursWorked) { 
        super(name, id); 
        this.hourlyRate = hourlyRate; 
        this.hoursWorked = hoursWorked; 
    } 
 
    // Implementing calculateSalary method 
    @Override 
    public double calculateSalary() { 
        return hourlyRate * hoursWorked; 
    } 
} 
 
// Main class to test the Salary Management system 
public class Main { 
    public static void main(String[] args) { 
        // Create a FullTimeEmployee object 
        Employee fullTimeEmployee = new FullTimeEmployee("Alice", "FT001", 
3000); 
        fullTimeEmployee.displayDetails(); 
        System.out.println("Full-Time Employee Salary: $" + 
fullTimeEmployee.calculateSalary()); 
 
        // Create a PartTimeEmployee object 
        Employee partTimeEmployee = new PartTimeEmployee("Bob", "PT001", 20, 
80); 
        partTimeEmployee.displayDetails(); 
        System.out.println("Part-Time Employee Salary: $" + 
partTimeEmployee.calculateSalary()); 
    } 
}