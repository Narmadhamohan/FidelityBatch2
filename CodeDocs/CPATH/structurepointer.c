#include <stdio.h>
#include <string.h>

// Define a structure called Person
struct Person {
    char name[50];  // Array to store the name
};

int main() {
    // Declare a structure variable and a pointer to the structure
    struct Person person;
    struct Person *ptr;

    // Pointer points to the address of person
    ptr = &person;

    // Set the name using the pointer
    strcpy(ptr->name, "Dijo Jose");

    // Display the name using the pointer
    printf("Name: %s\n", ptr->name);

    return 0;
}
