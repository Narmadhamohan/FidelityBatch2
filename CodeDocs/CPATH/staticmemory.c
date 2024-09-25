#include <stdio.h>

int main() {
    int arr[10]; // Static memory allocation for an array of 10 integers
    for (int i = 0; i < 10; i++) {
        arr[i] = i + 1; // Assign values to the array
        printf("%d ", arr[i]);
    }
    return 0; // No need to free memory explicitly
}