#include <stdio.h>

// Define the global variable
int globalVar = 42;
void printGlobalVar();
int main() {
    // Call the function from File1.c
    printGlobalVar(); // Outputs: Global Variable: 42
    return 0;
}
//to run
//gcc externfile1.c externfile2.c -o output
//./output