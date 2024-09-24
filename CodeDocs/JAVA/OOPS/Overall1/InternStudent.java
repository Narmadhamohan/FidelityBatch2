package com.inheritance;

public class InternStudent extends Student{
    int numberOfProjects;
    int projectMarks;

    // Constructor
    InternStudent(String name, int id, double marks, int numberOfProjects, int projectMarks) {
        super(name, id, marks);
        this.numberOfProjects = numberOfProjects;
        this.projectMarks = projectMarks;
    }

    // Method to calculate marks based on number of projects and project marks
    void calculateMarks() {
        marks += (numberOfProjects * projectMarks);
    }

    @Override
    void display() {
        System.out.println("Intern Student:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Final Marks: " + marks);
    }

}
