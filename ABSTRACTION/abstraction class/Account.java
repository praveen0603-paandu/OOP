abstract class Account { 
    protected String accountNumber; 
    protected String accountHolderName; 
    protected double balance; 
 
    // Constructor 
    public Account(String accountNumber, String accountHolderName) { 
        this.accountNumber = accountNumber; 
        this.accountHolderName = accountHolderName; 
        this.balance = 0.0; // Initial balance is 0 
    } 
 
    // Abstract method to deposit money 
    public abstract void deposit(double amount); 
 
    // Abstract method to withdraw money 
    public abstract void withdraw(double amount); 
 
    // Method to display account details 
    public void displayAccountDetails() { 
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder Name: " + accountHolderName); 
        System.out.println("Current Balance: $" + balance); 
    } 
} 
 
// SavingsAccount class extending Account 
class SavingsAccount extends Account { 
    private double interestRate; 
 
    // Constructor 
    public SavingsAccount(String accountNumber, String accountHolderName, 
double interestRate) { 
        super(accountNumber, accountHolderName); 
        this.interestRate = interestRate; 
    } 
 
    // Implementing deposit method 
    @Override 
    public void deposit(double amount) { 
        balance += amount; 
        System.out.println("Deposited $" + amount + " to Savings Account."); 
    } 
 
    // Implementing withdraw method 
    @Override 
    public void withdraw(double amount) { 
        if (amount <= balance) { 
            balance -= amount; 
            System.out.println("Withdrew $" + amount + " from Savings Account."); 
        } else { 
            System.out.println("Insufficient balance in Savings Account."); 
        } 
    } 
 
    // Method to calculate interest 
    public void calculateInterest() { 
        double interest = balance * (interestRate / 100); 
        balance += interest; 
        System.out.println("Interest of $" + interest + " added to Savings 
Account."); 
    } 
} 
 
// CurrentAccount class extending Account 
class CurrentAccount extends Account { 
    private double overdraftLimit; 
 
    // Constructor 
    public CurrentAccount(String accountNumber, String accountHolderName, 
double overdraftLimit) { 
        super(accountNumber, accountHolderName); 
        this.overdraftLimit = overdraftLimit; 
    } 
 
    // Implementing deposit method 
    @Override 
    public void deposit(double amount) { 
        balance += amount; 
        System.out.println("Deposited $" + amount + " to Current Account."); 
    } 
 
    // Implementing withdraw method 
    @Override 
    public void withdraw(double amount) { 
        if (amount <= balance + overdraftLimit) { 
            balance -= amount; 
            System.out.println("Withdrew $" + amount + " from Current Account."); 
        } else { 
            System.out.println("Withdrawal exceeds overdraft limit in Current 
Account."); 
        } 
    } 
} 
 
// Main class to test the Bank Management system 
public class Main { 
    public static void main(String[] args) { 
        // Create a SavingsAccount object 
        Account savingsAccount = new SavingsAccount("SA12345", "Alice", 5.0); 
        savingsAccount.deposit(1000); 
        savingsAccount.withdraw(200); 
        ((SavingsAccount) savingsAccount).calculateInterest(); 
        savingsAccount.displayAccountDetails(); 
        System.out.println(); 
 
        // Create a CurrentAccount object 
        Account currentAccount = new CurrentAccount("CA12345", "Bob", 500.0); 
        currentAccount.deposit(500); 
        currentAccount.withdraw(700); 
        currentAccount.withdraw(400); // This should exceed the overdraft limit 
        currentAccount.displayAccountDetails(); 
    } 
} 