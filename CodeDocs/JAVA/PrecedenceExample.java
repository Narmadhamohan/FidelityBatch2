/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoperators;

/**
 *
 * @author Dell
 */
public class PrecedenceExample {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 5;

        // Relational operators (<, >) have higher precedence than logical (&&)
        boolean result = x < y && y > z;  // (x < y) && (y > z)
        
        System.out.println("x < y && y > z: " + result);  // true
    }
}

