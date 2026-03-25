package duSolvingProblems.module3;

public class Task5 {

        public static void main(String[] args) {
            String[] words = {"alpha", "beta"};
            int index = 0;
            boolean check = true || words[index + 2].equals("gamma");

            if (check) {
                System.out.println("safe");
            } else {
                System.out.println("error");
            }
        }
    }

