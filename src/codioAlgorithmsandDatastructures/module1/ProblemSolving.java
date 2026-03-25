package codioAlgorithmsandDatastructures.module1;

public class ProblemSolving {
    public static int search(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] array = {"ape", "bat", "cat", "dog", "eagle"};
        String target = "dog";

        int result = search(array, target);

        if (result == -1)
            System.out.println("Element not found in the array");
        else
            System.out.println("Element found at index: " + result);
    }
}
