import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    // Constructor, getters, and setters
    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + department + " - $" + salary;
    }
}
