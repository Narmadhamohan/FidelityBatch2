#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr;
    int n, new_size, i;

    // Ask for the number of elements
    printf("Enter the number of elements: ");
    
    // Make sure input is captured properly
    if (scanf("%d", &n) != 1 || n <= 0) {
        printf("Invalid input. Please enter a positive integer.\n");
        return 1;
    }

    // Allocating memory using calloc()
    arr = (int*) calloc(n, sizeof(int));

    // Check if memory allocation was successful
    if (arr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;  // Exit if memory allocation fails
    }

    // Initialize and display the array
    printf("Array elements after calloc:\n");
    for (i = 0; i < n; i++) {
        arr[i] = i + 1;  // Initializing array elements
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Ask for new size for the array
    printf("Enter new size for the array: ");
    
    // Make sure the new size is captured correctly
    if (scanf("%d", &new_size) != 1 || new_size <= 0) {
        printf("Invalid input. Please enter a positive integer.\n");
        free(arr);  // Free the allocated memory
        return 1;
    }

    // Resize the array using realloc()
    arr = (int*) realloc(arr, new_size * sizeof(int));

    // Check if memory reallocation was successful
    if (arr == NULL) {
        printf("Memory reallocation failed!\n");
        return 1;  // Exit if memory reallocation fails
    }

    // Initialize new elements to zero and display the new array
    printf("Array elements after realloc:\n");
    for (i = n; i < new_size; i++) {
        arr[i] = 0;  // Initialize newly allocated elements to 0
    }

    for (i = 0; i < new_size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Free the allocated memory
    free(arr);

    return 0;
}
