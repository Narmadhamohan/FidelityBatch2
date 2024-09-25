import java.io.*;
import java.sql.*;

public class ExceptionHandlingExample {
    
    // Placeholder for Checked Exception 1: IOException
    public static void handleIOException() {
        try {
            // One-liner IOException example here
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        } catch (IOException e) {
            e.printStackTrace();  // Handle the exception
        }
    }

    // Placeholder for Checked Exception 2: SQLException
    public static void handleSQLException() {
        try {
            // One-liner SQLException example here
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        } catch (SQLException e) {
            e.printStackTrace();  // Handle the exception
        }
    }

    // Placeholder for Unchecked Exception 1: NullPointerException
    public static void handleNullPointerException() {
        try {
            // One-liner NullPointerException example here
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            e.printStackTrace();  // Handle the exception
        }
    }

    // Placeholder for Unchecked Exception 2: ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException() {
        try {
            // One-liner ArrayIndexOutOfBoundsException example here
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();  // Handle the exception
        }
    }

    // Placeholder for Custom Exception Handling
    public static void handleCustomException() {
        try {
            // One-liner Custom Exception example here
            throw new UserDefinedException("This is a custom checked exception!");
        } catch (UserDefinedException e) {
            e.printStackTrace();  // Handle the exception
        }
    }

    public static void main(String[] args) {
        System.out.println("Handling different types of exceptions:");
        
        handleIOException();          // Placeholder for IOException handling
        handleSQLException();         // Placeholder for SQLException handling
        handleNullPointerException(); // Placeholder for NullPointerException handling
        handleArrayIndexOutOfBoundsException(); // Placeholder for ArrayIndexOutOfBoundsException handling
        handleCustomException();      // Placeholder for Custom Exception handling
    }

    // Custom Checked Exception
    public static class UserDefinedException extends Exception {
        public UserDefinedException(String message) {
            super(message);
        }
    }
}
