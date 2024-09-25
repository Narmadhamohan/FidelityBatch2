#include <stdio.h>

int main() {
    int num = 10;  // Declare an integer variable
    int *p = &num; // p is a pointer to num
    int add;
    int val;









   // add = (int)p; // Cast pointer to int for printing purposes
    val = *p;     // Dereference the pointer to get the value it points to

    printf("Pointer: %d\n", p);
    printf("val: %d\n", val);
    printf("num: %d\n", num);
    *p=20;
    printf("add: %d\n", add);
    printf("val: %d\n", val);
    printf("num: %d\n", num);
    return 0;
}
