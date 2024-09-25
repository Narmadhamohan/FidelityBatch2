#include <stdio.h>

void exampleauto() {
    auto int x=10; // 'auto' is optional here// default memory allocated in Stack
    printf("%d\n", x);
}

void exampleregister() {
    register int counter; //memport allocated in cpu register for faster access
    for (counter = 0; counter < 10; counter++) {
        printf("%d ", counter);
    }
}

void staticalloc() {
    static int counter = 0; // Static variable retains its value between calls
    counter++;
    printf("%d\n", counter);
}

int main() {
    int globalVar=10;; // Definition of globalVar
    printf("\n****Auto****\n");
    exampleauto();
    printf("\n****Register****\n");
    exampleregister();
    printf("\n****Static****\n");
    staticalloc();
    staticalloc();
    return 0;
}
