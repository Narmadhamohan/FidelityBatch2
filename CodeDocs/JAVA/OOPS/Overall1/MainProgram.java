package com.inheritance;
/*

1. There is a student class with name, id, marks.
2. Create abstract method to display the total marks.
3. Create sub class RegularStudent with practical marks
4. InternStudent with numberofProjects and projectmarks
5. Include calculatemarks in Regularstudent and add condition, if practicals >2 and <5, add 50% of marks as practicalmarks.
6. For the Internstudent, marks  = eachprojectmark * no_of_projects
7. Display both the students marks in main method.
8. Initialize one sample value for each.


 */
public class MainProgram {
    public static void main(String[] args) {
        // Creating an instance of RegularStudent
        RegularStudent regularStudent = new RegularStudent("Dijo", 101, 80, 4);
        regularStudent.calculateMarks();
        regularStudent.display();

        // Creating an instance of InternStudent
        InternStudent internStudent = new InternStudent("Jose", 102, 70, 3, 20);
        internStudent.calculateMarks();
        internStudent.display();
    }
}
