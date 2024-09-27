package com.stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManagement {


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, "Sales", 60000));
        employees.add(new Employee("Bob", 40, "HR", 45000));
        employees.add(new Employee("Charlie", 35, "Sales", 70000));
        employees.add(new Employee("David", 28, "IT", 48000));

        // Part A: Using Streams and filters
        List<Employee> salesEmployees = employees.stream()
                .filter(emp -> emp.getName().startsWith("Ch"))
                .toList();

        salesEmployees.forEach(System.out::println);


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.stream()
                .map(num -> num*2)
                .filter(num -> num >8)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        numbers.stream()
                .map(num -> num*2)
                .filter(num -> num >8)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toSet());


        List<List<Integer>> nestedList = Arrays.asList(

                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6)
        );

        nestedList.stream().flatMap(List::stream).forEach(System.out::println);
        //Short circuit  operations
        List<Integer> numbersShort = Arrays.asList(1,2,300,4,5,6,100,200);
        numbersShort.stream().filter(num -> num >100).findFirst().ifPresent(System.out::println);

        numbers.stream().reduce(Integer::sum);


        Optional<Integer> firstNum  = numbersShort.stream().filter(num -> num >100).findFirst();
        firstNum.get();
        numbersShort.stream().filter(num -> num >100).limit(2).forEach(System.out::println);


    }

}


