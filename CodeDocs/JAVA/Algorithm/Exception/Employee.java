package com.demo.exception;
/*

Applying for leave for more than 5 days,
stop the normal flow and handle with custom exception
and track with logger file.
 */
public class Employee {

    private String name;
    private int age;
    private int no_of_leaves;

    public Employee(String name, int age, int no_of_leaves) {
        this.name = name;
        this.age = age;
        this.no_of_leaves = no_of_leaves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNo_of_leaves() {
        return no_of_leaves;
    }

    public void setNo_of_leaves(int no_of_leaves) {
        this.no_of_leaves = no_of_leaves;
    }
}
