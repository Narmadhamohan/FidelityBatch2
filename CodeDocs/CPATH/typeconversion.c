#include <stdio.h>

int main() {
    int a = 10, b = 3;

    // Without typecasting: integer division
    float result1 = a / b;  // result is still an int and assigned to float
    printf("Without typecasting: %f\n", result1);  // prints 3.000000

    // With typecasting: float division
    float result2 = (float) a / b;  // 'a' is cast to float before division
    printf("With typecasting: %f\n", result2);  // prints 3.333333

    return 0;
}
