// Library class to manage the collection of books
class Library {
    private Set<Book> books;

    public Library() {
        this.books = new HashSet<>();
    }

    // Method to add a new book to the collection
    public void addBook(Book book) {
        // Check for duplicates using an iterator
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book existingBook = iterator.next();
            if (existingBook.equals(book)) {
                System.out.println("Book already exists: " + existingBook);
                return; // Book already exists, so return
            }
        }
        
        // If the book does not exist, add it to the collection
        books.add(book);
        System.out.println("Book added: " + book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
