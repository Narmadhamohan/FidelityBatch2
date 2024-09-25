#include <stdio.h>
#include <string.h>

struct Person {
    char name[50];
    int age;
    float height;
};







int main() {
    struct Person person1;
    struct Person person2 = {"Alice", 30, 5.5};
    
    // Initializing person1
    person1.age = 25;
    strcpy(person1.name, "Bob");
    person1.height = 5.8;
    
    // Printing details
    printf("Person 1: %s, %d years old, %.1f feet\n", person1.name, person1.age, person1.height);
    printf("Person 2: %s, %d years old, %.1f feet\n", person2.name, person2.age, person2.height);
    
    return 0;
}
