package codioAlgorithmsandDatastructures.module1.module1;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
// create a new array of size array1.length + array2.length
        int[] mergedArray = new int[array1.length +
                array2.length];
// copy elements from array1 to the new array
        for (int i = 0; i < array1.length; i++)
            mergedArray[i] = array1[i];
// copy elements from array2 to the new array
        for (int i = 0; i < array2.length; i++)
            mergedArray[i + array1.length] = array2[i];
// print merged array
        System.out.println("Merged Array:");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }
}
