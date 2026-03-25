package codioAlgorithmsandDatastructures.module1.module1;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at the mid
            if (array[mid] == target)
                return mid;

            // If target is greater, ignore left half
            if (array[mid] < target)
                left = mid + 1;

                // If target is smaller, ignore right half
            else
                right = mid - 1;
        }

        // if we reach here, then element is not present
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;

        int result = binarySearch(array, target);

        if (result == -1)
            System.out.println("Element not found in the array");
        else
            System.out.println("Element found at index: " + result);
    }
}
