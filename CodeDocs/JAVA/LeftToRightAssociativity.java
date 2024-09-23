/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoperators;

/**
 *
 * @author Dell
 * Step 1: First, a < b (true) is evaluated.
Step 2: Then, b < c (true) is evaluated.
Step 3: Since && has left-to-right associativity, it evaluates the first two expressions: (a < b) && (b < c), which is true && true = true.
Step 4: The result from the previous step (true) is then combined with the final condition a < c (true), so the overall result is true.
This shows how the expression is evaluated from left to right when multiple relational and logical operators are used.
 */
public class LeftToRightAssociativity {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        // Relational and logical operators follow left-to-right associativity
        boolean result = a < b && b < c && a < c;  // ((a < b) && (b < c)) && (a < c)

        System.out.println("a < b && b < c && a < c: " + result);  // true
    }
}

