package codioAlgorithmsandDatastructures.module1.module1;

public class ArrayInsertion {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int insertValue = 10;
        int insertIndex = 2;
// print original array
        System.out.println("Original Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
            System.out.println();
            // create a new array of size array.length + 1
            int [] newArray = new int[array.length + 1];
            // copy elements from old array to new array, leaving space for new element
            for  (int i=0; i<insertIndex; i++) {
                newArray[i] = array[i];

                // add new element
                newArray[insertIndex] = insertValue;
// copy the rest of elements from old array to new array
                for (int k = insertIndex + 1; k < newArray.length; k++)
                    newArray[k] = array[k - 1];
            }
                // print new array
                System.out.println("Array after insertion:");
                for (int i : newArray) {
                    System.out.print(i + " ");
            }
        }
    }

