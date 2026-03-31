package codioAlgorithmsandDatastructures.module1;

import java.util.Arrays;

public class SpaceComplexity {
    public static void main(String[] args) {
        int n = 100;    // fixed space
        int[] array = new int[n];    // variable space

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        System.out.println(Arrays.toString(array));
    }
}
