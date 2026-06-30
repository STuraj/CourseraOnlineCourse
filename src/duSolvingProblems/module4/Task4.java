package duSolvingProblems.module4;

public class Task4 {

        public static void main(String[] args) {
            Integer largestSoFar = null;
            int[] values = {5, 12, 9, 15, 11};

            for (int i = 0; i < values.length; i++) {
                int current = values[i];
                if (largestSoFar == null) {
                    largestSoFar = current;
                } else if (current > largestSoFar) {
                    largestSoFar = current;
                }
            }

            System.out.println(largestSoFar);
        }
    }


//largestSoFar starts as null, is first set to 5,
// and then updated only when a larger value is found,
// ending with the maximum value 15.
