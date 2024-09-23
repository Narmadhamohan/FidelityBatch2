package com.control;
import java.util.Scanner;

public class SimpleCounter {

    public static void  main(String[] args) {

        int counter = 0;
        boolean rewarded = true;
        int bill =0;
        for(int i=0; i<10; i++){

            counter = counter +10;
            System.out.println(counter);
        }

            counter =0;
        while(rewarded){

            if(counter == 5){
                System.out.println("In while loop: "+counter);
                rewarded = false;
            }
            counter++;
        }
counter = 0;
        do {
            System.out.println("DO while Count is: " + counter);
            counter++;
        } while (counter < 11);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        do {
            System.out.println("Enter bill amount to calculate GST ");
            bill = myObj.nextInt();
        } while (bill < 11);





    }

}
