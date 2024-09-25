// Main class to demonstrate the library system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        
        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"); // Duplicate

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3); // Attempt to add a duplicate

        // Display all books in the library
        library.displayBooks();
    }
}
