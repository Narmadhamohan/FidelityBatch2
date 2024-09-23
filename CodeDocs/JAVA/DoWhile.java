package com.control;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
      int   counter = 0;
      int bill =0;
        do {
            System.out.println("DO while Count is: " + counter);
            counter++;
        } while (counter < 11);



        // Next example starts

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        do {
            System.out.println("Enter bill amount to calculate GST ");
            bill = myObj.nextInt();
        } while (bill < 11);

    }
}
