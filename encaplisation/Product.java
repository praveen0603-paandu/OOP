class Product { 
    private String productId; 
    private String productName; 
    private double price; 
 
    // Constructor 
    public Product(String productId, String productName, double price) { 
        this.productId = productId; 
        this.productName = productName; 
        this.price = price; 
    } 
 
    // Getter methods 
    public String getProductId() { 
        return productId; 
    } 
 
    public String getProductName() { 
        return productName; 
    } 
 
    public double getPrice() { 
        return price; 
    } 
 
    // Setter method for price 
    public void setPrice(double price) { 
        if (price >= 0) { 
            this.price = price; 
        } else { 
            System.out.println("Price cannot be negative."); 
        } 
    } 
 
    // Method to display product details 
    public void displayProductDetails() { 
        System.out.println("Product ID: " + productId); 
        System.out.println("Product Name: " + productName); 
        System.out.println("Price: $" + price); 
    } 
} 
 
// Main class to test Product 
public class MainProduct { 
    public static void main(String[] args) { 
        // Create a Product object 
        Product product = new Product("P001", "Laptop", 999.99); 
         
        // Display initial product details 
        product.displayProductDetails(); 
 
        // Update product price 
        product.setPrice(899.99); 
        System.out.println("Updated Product Price:"); 
        product.displayProductDetails(); 
 
        // Attempt to set a negative price 
        product.setPrice(-50.00); 
    } 
} 