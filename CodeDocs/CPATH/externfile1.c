#include <stdio.h>

extern int globalVar; // Declaration of globalVar

void printGlobalVar() {
    printf("Global Variable: %d\n", globalVar);
}
