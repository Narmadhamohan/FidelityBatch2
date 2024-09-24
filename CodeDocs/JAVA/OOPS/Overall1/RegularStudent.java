package com.inheritance;

public class RegularStudent extends Student{

    int practicalMarks;

    // Constructor
    RegularStudent(String name, int id, double marks, int practicalMarks) {
        super(name, id, marks);
        this.practicalMarks = practicalMarks;
    }

    // Method to calculate final marks based on practical marks condition
    void calculateMarks() {
        if (practicalMarks > 2 && practicalMarks < 5) {
            marks += (marks * 0.50); // Adding 50% of the marks as practical marks
        }
    }

    @Override
    void display() {
        System.out.println("Regular Student:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Final Marks: " + marks);
    }
}
