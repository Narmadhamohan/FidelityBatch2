/**
 * Sorting Algorithms: Selection Sort, Bubble Sort, Heap Sort, Insertion Sort
 *
 * Time Complexities:
 * Selection Sort: Best - O(n^2), Worst - O(n^2), Space - O(1)
 * Bubble Sort: Best - O(n), Worst - O(n^2), Space - O(1)
 * Heap Sort: Best - O(n log n), Worst - O(n log n), Space - O(1)
 * Insertion Sort: Best - O(n), Worst - O(n^2), Space - O(1)
 */

public class SortingAlgorithms {

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Find the minimum element in unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in inner loop, break
            if (!swapped) break;
        }
    }

    // Heap Sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is an index in arr[]
    static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than the largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the sorting algorithms
    public static void main(String[] args) {
        int[] arr1 = {64, 25, 12, 22, 11};
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();
        int[] arr4 = arr1.clone();

        System.out.println("Original Array:");
        printArray(arr1);

        // Test Selection Sort
        selectionSort(arr1);
        System.out.println("Sorted Array using Selection Sort:");
        printArray(arr1);

        // Test Bubble Sort
        bubbleSort(arr2);
        System.out.println("Sorted Array using Bubble Sort:");
        printArray(arr2);

        // Test Heap Sort
        heapSort(arr3);
        System.out.println("Sorted Array using Heap Sort:");
        printArray(arr3);

        // Test Insertion Sort
        insertionSort(arr4);
        System.out.println("Sorted Array using Insertion Sort:");
        printArray(arr4);
    }
}
