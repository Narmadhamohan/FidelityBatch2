#include <stdio.h>

void modifyArray(int *arr, int size);

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int length = sizeof(arr) / sizeof(arr[0]);
    printf("size %d ", sizeof(arr));//total size in bytes
    printf("size %d ", sizeof(arr[0])); //size of 1 in bytes
    printf("\n");
    modifyArray(arr, length); // Pass the array to the function

    for (int i = 0; i < length; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}

void modifyArray(int *arr, int length) {
    for (int i = 0; i < length; i++) {
        arr[i] += 10; // Modify each element
    }
}
