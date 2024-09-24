public class Main { 
    public static void main(String[] args) { 
        Employee E1 = new Employee(100);        // Object E1 with id 100 using new keyword
        Employee E2 = new Employee();           // Object E2 with no id using default constructor
        Employee E3 = E1;                       // E3 points to the same object as E1 (no new object created)
        
        System.out.println(E1.id);              // Output: 100
        System.out.println(E2.id);              // Output: 0 (default value)
        System.out.println(E3.id);              // Output: 100 (same as E1)
    } 
}
