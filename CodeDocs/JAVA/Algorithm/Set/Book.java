package com.set;

public class Book {
    private String title;
    private String author;
    String isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Book)) {
            return false;
        }
        //Downcasting
        Book book = (Book) obj;
        return this.isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
    }
}
