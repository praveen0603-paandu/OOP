import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner; 
// Student class 
class Student { 
private String name; 
private int age; 
private double grade; 
// Getters 
public String getName() { 
// Constructor 
public Student(String name, int age, double grade) { 
this.name = name; 
this.age = age; 
this.grade = grade; 
} 
        return name; 
    } 
 
    public int getAge() { 
        return age; 
    } 
 
    public double getGrade() { 
        return grade; 
    } 
 
    // Method to display student details 
    public void displayStudentInfo() { 
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
        System.out.println("Grade: " + grade); 
    } 
} 
 
// Main class to manage students 
public class StudentManagement { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        List<Student> students = new ArrayList<>(); 
 
        // Loop to add students 
        while (true) { 
            System.out.print("Enter student name (or 'exit' to finish): "); 
            String name = scanner.nextLine(); 
            if (name.equalsIgnoreCase("exit")) { 
                break; // Exit the loop if the user types 'exit' 
            } 
 
            System.out.print("Enter student age: "); 
int age = Integer.parseInt(scanner.nextLine()); 
System.out.print("Enter student grade: "); 
double grade = Double.parseDouble(scanner.nextLine()); 
// Create a new Student object and add it to the list 
Student student = new Student(name, age, grade); 
students.add(student); 
} 
// Display all students 
System.out.println("\nStudent List:"); 
for (Student student : students) { 
student.displayStudentInfo(); 
System.out.println(); // Print a blank line between students 
} 
scanner.close(); // Close the scanner 
} 
}