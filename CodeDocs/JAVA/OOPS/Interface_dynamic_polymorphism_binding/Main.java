public class Main { 
    public static void main(String[] args) { 
        Animal myAnimal = new Dog();  // Polymorphic behavior
        myAnimal.sound();              // Output: Dog barks
        myAnimal = new Cat();          // Changing reference to another implementation
        myAnimal.sound();              // Output: Cat meows
    } 
}
