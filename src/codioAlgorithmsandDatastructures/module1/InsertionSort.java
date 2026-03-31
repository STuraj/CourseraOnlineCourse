package codioAlgorithmsandDatastructures.module1;

import java.util.Arrays;

public class InsertionSort {
    // Method to perform insertion sort on the given array
    public static void sort(int[] arr) {
        int n = arr.length;

        // Traverse through the array from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Store the current element to be inserted into the sorted part
            int j = i - 1; // Initialize the pointer to the last element of the sorted part

            // Shift elements greater than the key to the right
            // to create space for inserting the key in the correct position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key into the correct position in the sorted part
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};

        sort(array);

        System.out.println("Sorted array = " + Arrays.toString(array));
    }
}
