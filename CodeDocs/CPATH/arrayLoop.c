#include <stdio.h>

int main() {
    // Initialize an array
    int array[] = {10, 20, 30, 40, 50};

    // Calculate the length of the array
    int length = sizeof(array) / sizeof(array[0]);
            printf("Element at index %d is: %p\n",array[0] );

        printf("Element at index %d is: %p\n",array+1 );

    // Use a for loop to print each element of the array
    for (int i = 0; i < length; i++) {
        printf("Element at index %d is: %d\n", i, array[i]);
    }

    return 0;
}