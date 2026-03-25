package codioAlgorithmsandDatastructures.module1;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int deleteIndex = 2;
// print original array
        System.out.println("Original Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
// create a new array of size array.length - 1
        int[] newArray = new int[array.length - 1];
// copy elements from old array to new array excluding
  //      the element to be deleted
        for (int i = 0, k = 0; i < array.length; i++) {
// this condition will skip the element to be deleted
            if (i == deleteIndex) {
                continue;
            }
// if the index is not the deletion index, add the
//            element to the new array
            newArray[k++] = array[i];
        }
// print new array
        System.out.println("Array after deletion:");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}
