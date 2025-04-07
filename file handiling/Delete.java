import java.io.File; 
import java.util.Scanner; 
 
public class DeleteFileExample { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        System.out.print("Enter the file path to delete: "); 
        String filePath = scanner.nextLine(); // Read the file path from user input 
         
        File file = new File(filePath); // Create a File object 
 
        // Attempt to delete the file 
        if (file.exists()) { 
            if (file.delete()) { 
                System.out.println("File deleted successfully: " + 
file.getAbsolutePath()); 
            } else { 
                System.out.println("Failed to delete the file."); 
            } 
        } else { 
            System.out.println("The file does not exist."); 
        } 
 
        scanner.close(); // Close the scanner 
    } 
} 