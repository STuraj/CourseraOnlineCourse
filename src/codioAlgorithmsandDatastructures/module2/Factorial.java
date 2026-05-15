package codioAlgorithmsandDatastructures.module2;

public class Factorial {
    public static int factorial(int n) {
        if (n == 1) { //base case
            return 1;
        } else { //recursive step
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
