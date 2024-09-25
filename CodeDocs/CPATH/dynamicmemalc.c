#include <stdio.h>
#include <stdlib.h>
//malloc: Allocates memory without initialization.
//calloc: Allocates and initializes memory to zero.
//free: Deallocates memory allocated by malloc, calloc, or realloc.
int main() {
    int *arr;
    int n = 10;

    // Dynamic memory allocation for an array of 10 integers
    arr = (int*)malloc(n * sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed!");
        return 1;
    }

    // Assign values to the dynamically allocated memory
    for (int i = 0; i < n; i++) {
        arr[i] = i + 1;
        printf("%d ", arr[i]);
    }

    // Free the dynamically allocated memory
    free(arr);

    return 0;
}
