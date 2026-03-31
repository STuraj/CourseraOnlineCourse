package codioAlgorithmsandDatastructures.module1;

public class AuxiliarySpace {
    public static int findSum(int[] array) {
        int sum = 0;    // auxiliary space

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};    // space used by input

        int sum = findSum(array);

        System.out.println("Sum = " + sum);
    }
}
