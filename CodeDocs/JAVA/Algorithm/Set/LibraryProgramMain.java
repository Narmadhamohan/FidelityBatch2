package com.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryProgramMain {
    public static void main(String[] args) {
        Library library = new Library();

        Book phonics = new Book("phonics","Dijo","20");
        Book designPrinciple = new Book("designPrinciple","gang","30");
        Book headFirstJava = new Book("headFirstJava","Thomp","30");

        library.addBook(phonics);
        library.addBook(designPrinciple);
        library.addBook(headFirstJava);

        library.displayBooks();








       /*
        // Convert Set to List
        List<Book> list = new ArrayList<>(library.getBooks());
        // Now sort the List
        Collections.sort(list,(emp1,emp2) -> emp1.isbn.compareTo(emp2.isbn));
        // Print sorted list
        list.forEach(System.out::println);


        */
    }
}
