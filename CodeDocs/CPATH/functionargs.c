#include <stdio.h>

void incrementValue(int * arr);
int main(){

    int arr[] = {1,5,6};

    incrementValue(arr);
    printf("Value: %d \n",arr[0]);
    return 0;
}

void incrementValue(int *arr){

    arr[0]=*(arr)+1;
} 