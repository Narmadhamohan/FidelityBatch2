/*

MathOperation class has two add methods—one for int and one for double types.
Method overloading occurs because both methods have the same name but different parameter types.
In Main, based on the argument types passed, the appropriate method is called, demonstrating compile-time polymorphism.


*/

class MathOperation { 
    int add(int a, int b) { 
      return 
        a + b; 
    } 
    double add(double a, double b) { 
      return a + b; 
    } 
}
