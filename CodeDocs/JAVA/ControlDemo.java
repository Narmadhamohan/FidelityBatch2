package com.control;

import java.util.Scanner;

public class ControlDemo {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");

        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();

        boolean rewarded = false;

        byte age;

        if(!rewarded) {
            System.out.println("You have entered a rewarded number");
        }


        if(num1 == num2){
            System.out.println("num1 and num2 are the same");
        }
   /*     else if(num1 > num2){
            System.out.println("num1 > num2");
        }*/
        else{
            System.out.println("num1 < num2");
        }


    }
}
