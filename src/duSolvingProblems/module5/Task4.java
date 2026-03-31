package duSolvingProblems.module5;

public class Task4 {

        public static void main(String[] args) {
            int width = 4;
            int height = 3;
            int count = 0;

            for (int pixel = 0; pixel < width * height; pixel++) {
                count = count + 1;
            }

            System.out.println(count);
        }
    }

