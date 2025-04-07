import java.io.BufferedWriter; 
import java.io.BufferedReader; 
import java.io.FileWriter; 
import java.io.FileReader; 
import java.io.IOException; 
public class WriteAndReadFile { 
public static void main(String[] args) { 
String filePath = "example.txt"; // Specify the file path 
// Reading from the file 
try (BufferedReader reader = new BufferedReader(new 
// Writing to the file 
try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) { 
writer.write("This is a write and read example."); 
writer.newLine(); 
writer.write("Learning file handling in Java."); 
System.out.println("Data written to file successfully."); 
} catch (IOException e) { 
System.out.println("An error occurred while writing to the file: " + 
e.getMessage()); 
} 
FileReader(filePath))) { 
            String line; 
            while ((line = reader.readLine()) != null) { 
                System.out.println(line); // Print each line 
            } 
        } catch (IOException e) { 
            System.out.println("An error occurred while reading the file: " + 
e.getMessage()); 
        } 
    } 
} 
 