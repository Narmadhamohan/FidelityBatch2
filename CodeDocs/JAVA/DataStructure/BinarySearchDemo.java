package com.datastructure.demo;
//Complexity O(logn)
//works only on the sorted array
public class BinarySearchDemo {

    public static int binarySearch1(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;// return the key
            }
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
         return -1;

        }

    public static void main(String[] args) {
        int[] arr = {9,10,12,25,34,45};
        int key=25;
        int result = BinarySearchDemo.binarySearch1(arr, key);
        if (result == -1) {
            System.out.println("Key not found");
    }
        else {
            System.out.println("Key found: " + result);
        }

}
}
