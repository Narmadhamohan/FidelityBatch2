package com.demo.collections;

public class CharWrapperExample {



    public static void main(String[] args) {
        char ch = 'A';
        Character charwrapperObj = ch; //Autoboxing
        //File contains: {age:25, salary:2000.5}
        //Parsed substring(:),
        String parsedText = "25";
        String parsedSalaryText = "2000.5";
        int age  = Integer.parseInt(parsedText);
       double salary = Double.parseDouble(parsedSalaryText);
        System.out.println("AGe added:"+(age+2));
        System.out.println("Salary added:"+salary);


        System.out.println("IS letter: "+Character.isLetter('1'));
        System.out.println("Is digit: "+Character.isDigit('5'));

    }


}
