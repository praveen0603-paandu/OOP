import java.util.HashMap; 
import java.util.Map; 
import java.util.Scanner; 
    private String accountNumber; 
    private String accountHolderName; 
    private double balance; 
 
    // Constructor 
    public BankAccount(String accountNumber, String accountHolderName) { 
        this.accountNumber = accountNumber; 
        this.accountHolderName = accountHolderName; 
        this.balance = 0.0; // Initial balance is 0 
    } 
 
    // Method to deposit money 
    public void deposit(double amount) { 
        if (amount > 0) { 
            balance += amount; 
            System.out.println("Deposited: " + amount); 
        } else { 
            System.out.println("Deposit amount must be positive."); 
        } 
    } 
 
    // Method to withdraw money 
    public void withdraw(double amount) { 
        if (amount > 0 && amount <= balance) { 
            balance -= amount; 
            System.out.println("Withdrew: " + amount); 
        } else if (amount > balance) { 
            System.out.println("Insufficient funds."); 
        } else { 
            System.out.println("Withdrawal amount must be positive."); 
        } 
    } 
 
    // Method to check balance 
    public double getBalance() { 
        return balance; 
    } 
 
    // Method to display account details 
    public void displayAccountInfo() { 
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder: " + accountHolderName); 
        System.out.println("Balance: " + balance); 
    } 
} 
 
// BankApp class 
public class BankApp { 
    private static Map<String, BankAccount> accounts = new HashMap<>(); 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int choice; 
 
        do { 
            System.out.println("\n--- Bank Application ---"); 
            System.out.println("1. Create Account"); 
            System.out.println("2. Deposit Money"); 
            System.out.println("3. Withdraw Money"); 
            System.out.println("4. Check Balance"); 
            System.out.println("5. Exit"); 
            System.out.print("Enter your choice: "); 
            choice = scanner.nextInt(); 
            scanner.nextLine(); // Consume newline 
 
            switch (choice) { 
                case 1: 
                    // Create Account 
                    System.out.print("Enter account number: "); 
                    String accountNumber = scanner.nextLine(); 
                    System.out.print("Enter account holder name: "); 
                    String accountHolderName = scanner.nextLine(); 
                    accounts.put(accountNumber, new BankAccount(accountNumber, 
accountHolderName)); 
                    System.out.println("Account created successfully."); 
                    break; 
 
                case 2: 
                    // Deposit Money 
                    System.out.print("Enter account number: "); 
                    accountNumber = scanner.nextLine(); 
                    BankAccount depositAccount = accounts.get(accountNumber); 
                    if (depositAccount != null) { 
                        System.out.print("Enter amount to deposit: "); 
                        double depositAmount = scanner.nextDouble(); 
                        depositAccount.deposit(depositAmount); 
                    } else { 
                        System.out.println("Account not found."); 
                    } 
                    break; 
 
                case 3: 
                    // Withdraw Money 
                    System.out.print("Enter account number: "); 
                    accountNumber = scanner.nextLine(); 
                    BankAccount withdrawAccount = accounts.get(accountNumber); 
                    if (withdrawAccount != null) { 
                        System.out.print("Enter amount to withdraw: "); 
                        double withdrawAmount = scanner.nextDouble(); 
                        withdrawAccount.withdraw(withdrawAmount); 
                    } else { 
                        System.out.println("Account not found."); 
                    } 
                    break; 
 
                case 4: 
                    // Check Balance 
                    System.out.print("Enter account number: "); 
                    accountNumber = scanner.nextLine(); 
                    BankAccount balanceAccount = accounts.get(accountNumber); 
                    if (balanceAccount != null) { 
                        System.out.println("Current Balance: " + 
balanceAccount.getBalance()); 
                    } else { 
                        System.out.println("Account not found."); 
                    } 
                    break; 
 
                case 5: 
                    System.out.println("Exiting the application."); 
                    break; 
 
                default: 
                    System.out.println("Invalid choice. Please try again."); 
            } 
        } while (choice != 5); 
 
        scanner.close(); // Close the scanner 
    } 
} 