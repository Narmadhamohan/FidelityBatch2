public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }
/*

Inner Class: Allows direct access to the instance variables 
and methods of the enclosing class,
providing a way to create complex relationships between classes.
*/
    // Inner class representing a chapter
    public class Chapter {
        private String chapterTitle;

        public Chapter(String chapterTitle) {
            this.chapterTitle = chapterTitle;
        }

        public void printChapter() {
            System.out.println(title + ": " + chapterTitle);  // Accessing outer class variable
        }
    }
}

// Usage
Book book = new Book("Java Programming");
Book.Chapter chapter1 = book.new Chapter("Introduction");  // Creating an inner class instance
chapter1.printChapter();
