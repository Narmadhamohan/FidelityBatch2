package com.control;

public class WhileDemo {

    public static void main(String[] args) {

      int  counter =0;
      boolean rewarded = true;

      while(counter <3){

          System.out.println("Counting");
          counter++;
      }

        while(rewarded){

            if(counter == 5){
                System.out.println("In while loop: "+counter);
                rewarded = false;
            }
            counter++;
        }
    }
}
