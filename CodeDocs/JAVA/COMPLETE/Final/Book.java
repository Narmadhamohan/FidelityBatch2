// Subclass Book that extends LibraryItem
// The 'final' keyword is used to prevent further inheritance from the Book class
final class Book extends LibraryItem {
    private String isbn;

    // Constructor of Book class that calls the base class constructor using 'super'
    public Book(String title, String author, String isbn) {
        // Calling the base class constructor using 'super'
        super(title, author);
        this.isbn = isbn;
    }

    // Method to display the details of the book
    public void displayDetails() {
        // Calling the base class's displayDetails method
        super.displayDetails();
        System.out.println("ISBN: " + isbn);
    }
}
