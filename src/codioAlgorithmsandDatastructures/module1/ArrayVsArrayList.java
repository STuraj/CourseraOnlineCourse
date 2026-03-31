package codioAlgorithmsandDatastructures.module1;
import java.util.ArrayList;
import java.util.Random;

public class ArrayVsArrayList {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);

        for (int i = 0; i < 5; i++) {
            numbers.add(rand.nextInt(100));
        }

        numbers.add(0);
    }
}
