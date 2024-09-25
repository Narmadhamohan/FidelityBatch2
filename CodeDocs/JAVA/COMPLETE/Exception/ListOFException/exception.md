1. Checked Exceptions
Example: IOException

try { BufferedReader reader = new BufferedReader(new FileReader("file.txt")); } catch (IOException e) { e.printStackTrace(); }  // Handling checked exception
Example: SQLException

try { Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password"); } catch (SQLException e) { e.printStackTrace(); }  // Handling SQL exception
Example: ClassNotFoundException


try { Class.forName("com.example.MyClass"); } catch (ClassNotFoundException e) { e.printStackTrace(); }  // Handling ClassNotFound exception
2. Unchecked Exceptions
Example: NullPointerException


String str = null; try { System.out.println(str.length()); } catch (NullPointerException e) { e.printStackTrace(); }  // Handling NullPointer exception
Example: ArrayIndexOutOfBoundsException

int[] arr = new int[5]; try { System.out.println(arr[10]); } catch (ArrayIndexOutOfBoundsException e) { e.printStackTrace(); }  // Handling ArrayIndexOutOfBounds exception
Example: IllegalArgumentException


int age = -1; try { if (age < 0) throw new IllegalArgumentException("Age cannot be negative"); } catch (IllegalArgumentException e) { e.printStackTrace(); }  // Handling IllegalArgument exception
3. Custom Exceptions
Example: UserDefinedException


public class UserDefinedException extends Exception { public UserDefinedException(String message) { super(message); } }  // Custom checked exception
Example: CustomUncheckedException


public class CustomUncheckedException extends RuntimeException { public CustomUncheckedException(String message) { super(message); } }  // Custom unchecked exception
Example: Throwing Custom Exception


try { throw new UserDefinedException("This is a custom checked exception!"); } ca
