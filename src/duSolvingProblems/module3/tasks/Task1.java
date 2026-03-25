package duSolvingProblems.module3;

public class Task1 {

        public static void main(String[] args) {
            int a = 42;
            int b = 17;
            int c = 17;
            int d = 29;

            int smallest = Math.min(a, Math.min(b, Math.min(c, d)));
            System.out.println(smallest);
        }
    }

