package com.inheritance;

public abstract class Student {

    String name;
    int id;
    double marks;

    // Constructor
    Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    // Abstract method to display student details
    abstract void display();
}
