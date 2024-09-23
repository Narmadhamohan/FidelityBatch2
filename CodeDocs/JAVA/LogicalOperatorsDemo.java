/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoperators;

/**
 *
 * @author Dell
 */
public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("Logical Operators Demo:");

        // Logical AND
        System.out.println("a && b: " + (a && b));  // false
        // Logical OR
        System.out.println("a || b: " + (a || b));  // true
        // Logical NOT
        System.out.println("!a: " + (!a));  // false
        System.out.println("!b: " + (!b));  // true

        // Logical AND with both true
        boolean c = true;
        System.out.println("a && c: " + (a && c));  // true
    }
}
