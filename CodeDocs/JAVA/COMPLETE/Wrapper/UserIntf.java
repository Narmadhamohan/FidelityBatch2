package com.demo.collections;

@FunctionalInterface
public interface UserIntf {
    int performCalculation(int num1, int num2);
     static int performCalculation1(int num1, int num2){
        return num1 + num2;
    }

}
