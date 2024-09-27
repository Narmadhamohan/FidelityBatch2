package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Library {

    private Set<Book> books;
    public Library() {
        books = new HashSet<>();
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {

        books.add(book);
    }

    public void displayBooks() {
        Iterator iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book);
        }


    }
}
