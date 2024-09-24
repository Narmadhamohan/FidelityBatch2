public class Main { 
    public static void main(String[] args) { 
        MathOperation math = new MathOperation(); 
        System.out.println(math.add(5, 10));       // Calls int add
        System.out.println(math.add(5.5, 10.5));   // Calls double add
    } 
}
