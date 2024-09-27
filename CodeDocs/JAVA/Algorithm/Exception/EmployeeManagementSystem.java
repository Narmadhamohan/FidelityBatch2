package com.demo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeManagementSystem {
    public static void main(String[] args) throws EmployeeLeavesException{

try{

    Employee dijo = new Employee("Dijo", 25, 10);
    if (dijo.getNo_of_leaves() > 5) {

        throw new EmployeeLeavesException("Sorry, Leaves Exceeded!");
        //throw
    }
}catch(EmployeeLeavesException e) {
    //pirintg
    System.out.println("Program exception"+ e.getMessage());

    throw e;
        }


//Employee dijo =  new Employee("Dijo",25,10);




           /* String name = null;
            name.equals("Dijo");
*/

    // Integer age = Integer.valueOf("5");
    // int result  = 5/0;
            //    BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            //  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");





    }
}
