#include <stdio.h>

int main() {
    int arr[] = {10, 20, 30, 40, 50};
    int *ptr = arr; // Point to the first element of the array

    printf("Element %d: %d :%d\n", 0, *(ptr + 0),(int)ptr);
    printf("Element %d: %d :%d\n", 1, *(ptr + 1),(int)ptr+1);
    printf("Element %d: %d :%d\n", 2, *(ptr + 2),(int)ptr+2);
    printf("Element %d: %d :%d\n", 3, *(ptr + 3),(int)ptr+3);
    printf("Element %d: %d :%d\n", 4, *(ptr + 4),(int)ptr+4);
    printf("\n\n");
    // Using pointer arithmetic to access array elements
    for (int i = 0; i < 5; i++) {
        printf("Element %d: %d\n", i, *(ptr + i));
    }

    return 0;
}