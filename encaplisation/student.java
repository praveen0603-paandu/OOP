class Student { 
    private String name; 
    private int age; 
    private String studentId; 
 
    // Constructor 
    public Student(String name, int age, String studentId) { 
        this.name = name; 
        this.age = age; 
        this.studentId = studentId; 
    } 
 
    // Getter and Setter methods 
    public String getName() { 
        return name; 
    } 
 
    public void setName(String name) { 
        this.name = name; 
    } 
 
    public int getAge() { 
        return age; 
    } 
 
    public void setAge(int age) { 
        if (age > 0) { 
            this.age = age; 
        } 
    } 
 
    public String getStudentId() { 
        return studentId; 
    } 
 
    // Method to display student details 
    public void displayDetails() { 
        System.out.println("Student ID: " + studentId); 
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
    } 
} 
 
// Main class to test Student details 
public class MainStudent { 
    public static void main(String[] args) { 
        Student student = new Student("Alice", 20, "S12345"); 
        student.displayDetails(); 
 
        // Update student details 
        student.setName("Alice Johnson"); 
        student.setAge(21); 
        student.displayDetails(); 
    } 
} 