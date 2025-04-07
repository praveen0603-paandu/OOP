class Student { 
    String name; 
    int age; 
 
    // Constructor 1: No arguments 
    Student() { 
        name = "Unknown"; 
        age = 0; 
    } 
 
    // Constructor 2: One argument 
    Student(String n) { 
        name = n; 
        age = 18; // default age 
    } 
 
    // Constructor 3: Two arguments 
    Student(String n, int a) { 
        name = n; 
        age = a; 
    } 
 
    void display() { 
        System.out.println("Name: " + name + ", Age: " + age); 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
        Student s1 = new Student();                 // calls Constructor 1 
        Student s2 = new Student("Alice");          // calls Constructor 
2 
        Student s3 = new Student("Bob", 21);        // calls 
Constructor 3 
 
        s1.display(); 
        s2.display(); 
        s3.display(); 
    } 
} 