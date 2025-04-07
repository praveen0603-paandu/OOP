class BankAccount { 
    private String accountNumber; 
    private String accountHolderName; 
    private double balance; 
 
    // Constructor 
    public BankAccount(String accountNumber, String accountHolderName) { 
        this.accountNumber = accountNumber; 
        this.accountHolderName = accountHolderName; 
        this.balance = 0.0; // Initial balance is 0 
    } 
 
    // Getter methods 
    public String getAccountNumber() { 
        return accountNumber; 
    } 
 
    public String getAccountHolderName() { 
        return accountHolderName; 
    } 
 
    public double getBalance() { 
        return balance; 
    } 
 
    // Method to deposit money 
    public void deposit(double amount) { 
        if (amount > 0) { 
            balance += amount; 
            System.out.println("Deposited: $" + amount); 
        } else { 
            System.out.println("Invalid deposit amount."); 
        } 
    } 
 
    // Method to withdraw money 
    public void withdraw(double amount) { 
        if (amount > 0 && amount <= balance) { 
            balance -= amount; 
            System.out.println("Withdrew: $" + amount); 
        } else { 
            System.out.println("Insufficient balance or invalid amount."); 
        } 
    } 
 
    // Method to display account details 
    public void displayAccountDetails() { 
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder Name: " + accountHolderName); 
        System.out.println("Current Balance: $" + balance); 
    } 
} 
 
// Main class to test Bank Account 
public class MainBankAccount { 
    public static void main(String[] args) { 
        // Create a BankAccount object 
        BankAccount account = new BankAccount("BA12345", "Bob"); 
 
        // Display initial account details 
        account.displayAccountDetails(); 
 
        // Deposit money 
        account.deposit(500); 
         
        // Withdraw money 
        account.withdraw(200); 
         
        // Attempt to withdraw more than the balance 
        account.withdraw(400); 
         
        // Display final account details 
        account.displayAccountDetails(); 
    } 
} 