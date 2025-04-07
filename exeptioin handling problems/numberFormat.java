import java.util.Scanner; 
 
public class NumberFormatExample { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        System.out.print("Enter a number: "); 
        String userInput = scanner.nextLine(); // Read user input 
 
        try { 
            // Attempt to parse the input as a double 
            double number = Double.parseDouble(userInput); 
            System.out.println("You entered: " + number); 
        } catch (NumberFormatException e) { 
// Handle the case where the input is not a valid number 
System.out.println("Error: Invalid number format. Please enter a valid 
number."); 
} finally { 
scanner.close(); // Close the scanner 
System.out.println("Scanner closed."); 
} 
} 
}