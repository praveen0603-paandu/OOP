interface Payment { 
void processPayment(double amount); 
void refundPayment(double amount); 
} 
// PayPalPayment class implementing Payment interface 
class PayPalPayment implements Payment { 
// CreditCardPayment class implementing Payment interface 
class CreditCardPayment implements Payment { 
@Override 
public void processPayment(double amount) { 
System.out.println("Processing credit card payment of $" + amount); 
} 
@Override 
public void refundPayment(double amount) { 
System.out.println("Refunding credit card payment of $" + amount); 
} 
} 
    @Override 
    public void processPayment(double amount) { 
        System.out.println("Processing PayPal payment of $" + amount); 
    } 
 
    @Override 
    public void refundPayment(double amount) { 
        System.out.println("Refunding PayPal payment of $" + amount); 
    } 
} 
 
// Main class to test the Payment interface and its implementations 
public class Main { 
    public static void main(String[] args) { 
        // Create a CreditCardPayment object 
        Payment creditCardPayment = new CreditCardPayment(); 
        creditCardPayment.processPayment(100.00); 
        creditCardPayment.refundPayment(50.00); 
 
        // Create a PayPalPayment object 
        Payment payPalPayment = new PayPalPayment(); 
        payPalPayment.processPayment(200.00); 
        payPalPayment.refundPayment(75.00); 
    } 
} 