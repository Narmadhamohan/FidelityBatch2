// Base class LibraryItem
class LibraryItem {
    private String title;
    private String author;

    // Constructor of LibraryItem class
    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display the details of the library item
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
