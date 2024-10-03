package com.datastructure.demo;

public class LinearSearch {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,34,10,9,25,45};
        int key=25;
        int result = linearSearch(arr, key);
        if(result == -1){
            System.out.println("key not found");
        }else{
            System.out.println("key found"+result);
        }
    }
}
