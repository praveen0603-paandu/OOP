import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException; 
 
public class AppendTextToFile { 
    public static void main(String[] args) { 
        String filePath = "example.txt"; // Specify the file path 
 
        // Initial write to the file 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) { 
            writer.write("This is the initial content of the file."); 
            writer.newLine(); 
            System.out.println("Initial content written to file successfully."); 
        } catch (IOException e) { 
            System.out.println("An error occurred while writing to the file: " + 
e.getMessage()); 
        } 
 
        // Appending text to the file 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, 
true))) { 
            writer.newLine(); // Start on a new line 
            writer.write("This text is appended to the existing content."); 
            System.out.println("Text appended to file successfully."); 
        } catch (IOException e) { 
            System.out.println("An error occurred while appending to the file: " + 
e.getMessage()); 
        } 
    } 
} 
 
Output: 
 
 
17c. Checking the presence of a file 
 
import java.io.File; 
import java.util.Scanner; 
 
public class CheckFilePresence { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        System.out.print("Enter the file path to check: "); 
        String filePath = scanner.nextLine(); // Read the file path from user input 
         
        File file = new File(filePath); // Create a File object 
 
        // Check if the file exists 
        if (file.exists()) { 
            System.out.println("The file exists: " + file.getAbsolutePath()); 
        } else { 
            System.out.println("The file does not exist."); 
        } 
 
        scanner.close(); // Close the scanner 
    } 
} 