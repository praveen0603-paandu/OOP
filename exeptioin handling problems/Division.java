import java.util.Scanner; 
 
public class Division { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        try { 
            System.out.print("Enter the numerator: "); 
            double numerator = scanner.nextDouble(); // Read numerator 
             
            System.out.print("Enter the denominator: "); 
            double denominator = scanner.nextDouble(); // Read denominator 
             
            // Perform division 
            double result = divide(numerator, denominator); 
            System.out.println("Result: " + result); 
        } catch (ArithmeticException e) { 
            System.out.println("Error: Division by zero is not allowed."); 
        } catch (java.util.InputMismatchException e) { 
            System.out.println("Error: Please enter valid numbers."); 
        } finally { 
            scanner.close(); // Close the scanner 
            System.out.println("Scanner closed."); 
        } 
    } 
 
    // Method to perform division 
    public static double divide(double numerator, double denominator) { 
        if (denominator == 0) { 
            throw new ArithmeticException("Division by zero"); 
        } 
        return numerator / denominator; 
    } 
}