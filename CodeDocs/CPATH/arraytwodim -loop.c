#include <stdio.h>

int main() {
    // Initialize a 2D array
    int array[3][3] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    // Calculate the number of rows and columns
    int rows = sizeof(array) / sizeof(array[0]);              // Total size / Size of first row
    int cols = sizeof(array[0]) / sizeof(array[0][0]);        // Size of first row / Size of first element

    // Use nested for loops to access each element
    for (int i = 0; i < rows; i++) {                          // Loop over rows
        for (int j = 0; j < cols; j++) {                      // Loop over columns
            printf("Element at [%d][%d] is: %d\n", i, j, array[i][j]);
        }
    }

    return 0;
}
