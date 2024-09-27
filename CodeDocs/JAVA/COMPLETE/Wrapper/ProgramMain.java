package com.demo.collections;

public class ProgramMain {

    public static void main(String[] args) {

        UserIntf userIntf = (num1,num2) -> num1+num2;
        System.out.println( userIntf.performCalculation(2,3));
    }
}
