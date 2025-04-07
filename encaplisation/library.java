import java.util.ArrayList; 
import java.util.List; 
 
// Book class demonstrating encapsulation 
class Book { 
    private String title; 
    private String author; 
    private String isbn; 
 
    // Constructor 
    public Book(String title, String author, String isbn) { 
        this.title = title; 
        this.author = author; 
        this.isbn = isbn; 
    } 
 
    // Getter methods 
    public String getTitle() { 
        return title; 
    } 
 
    public String getAuthor() { 
        return author; 
    } 
 
    public String getIsbn() { 
        return isbn; 
    } 
 
    // Method to display book details 
    public void displayBookDetails() { 
        System.out.println("Title: " + title); 
        System.out.println("Author: " + author); 
        System.out.println("ISBN: " + isbn); 
    } 
} 
 
// Library class to manage books 
class Library { 
    private List<Book> books; 
 
    // Constructor 
    public Library() { 
        books = new ArrayList<>(); 
    } 
 
    // Method to add a book 
    public void addBook(Book book) { 
        books.add(book); 
        System.out.println("Book added: " + book.getTitle()); 
    } 
 
    // Method to display all books 
    public void displayBooks() { 
        System.out.println("Library Books:"); 
        for (Book book : books) { 
            book.displayBookDetails(); 
            System.out.println(); 
        } 
    } 
} 
 
// Main class to test Library Management 
public class MainLibrary { 
    public static void main(String[] args) { 
        Library library = new Library(); 
         
        // Creating books 
        Book book1 = new Book("1984", "George Orwell", "123456789"); 
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 
"987654321"); 
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 
"111222333"); 
         
        // Adding books to the library 
        library.addBook(book1); 
        library.addBook(book2); 
        library.addBook(book3); 
         
        // Displaying all books in the library 
        library.displayBooks(); 
    } 
} 