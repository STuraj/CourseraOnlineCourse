package codioAlgorithmsandDatastructures.module1;

import java.util.Arrays;

public class MergeSort {

        // Merges two subarrays of arr[].
        // First subarray is arr[left..mid].
        // Second subarray is arr[mid+1..right].
        private static void merge(int arr[], int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            // Create temporary arrays to store the two subarrays
            int leftArray[] = new int[n1];
            int rightArray[] = new int[n2];

            // Copy data to temporary arrays
            for (int i = 0; i < n1; ++i)
                leftArray[i] = arr[left + i];
            for (int j = 0; j < n2; ++j)
                rightArray[j] = arr[mid + 1 + j];

            // Merge the two temporary arrays back into arr[left..right]

            int i = 0, j = 0; // Initialize pointers for the two temporary arrays
            int k = left; // Initialize pointer for the merged array

            // Compare elements from leftArray and rightArray and put the smaller one into arr
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k] = leftArray[i];
                    i++;
                } else {
                    arr[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            // Copy remaining elements from leftArray, if any
            while (i < n1) {
                arr[k] = leftArray[i];
                i++;
                k++;
            }

            // Copy remaining elements from rightArray, if any
            while (j < n2) {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }

        // Main method that sorts arr[left..right] using merge()
        public static void sort(int arr[], int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;

                // Sort the first half and the second half separately
                sort(arr, left, mid);
                sort(arr, mid + 1, right);

                // Merge the sorted halves
                merge(arr, left, mid, right);
            }
        }


        public static void main(String[] args) {
            int[] array = {6, 5, 3, 1, 8, 7, 2, 4};

            sort(array, 0, array.length - 1);

            System.out.println("Sorted array = " + Arrays.toString(array));
        }
    }



