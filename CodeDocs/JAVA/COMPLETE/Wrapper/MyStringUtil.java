package com.demo.collections;

public final class MyStringUtil {

 public String  toLowerCase(String inputString) {

     return inputString.toLowerCase();
 }


 public static void main(String[] args){

     //assigning literals takes string pool memory for optimization and it's immutable
     //single copy of hi.
     String s1 = "hi";
     String s2 = "hi";
     // new regular object creation takes memory in heap. new copy is created every time
     String s3 = new String("hi");

     System.out.println(s1 == s2);
     System.out.println(s1 == s3);

     s1.equals("hi");
     s2.equals("hi");
     s2.equalsIgnoreCase("Hello");

     s1.compareTo(s2);




 }


}
