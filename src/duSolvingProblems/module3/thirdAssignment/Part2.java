package duSolvingProblems.module3.thirdAssignment;

public class Part2 {

        public static float cgRatio(String dna) {
            int countC = 0;
            int countG = 0;

            // Count C's and G's
            for (int i = 0; i < dna.length(); i++) {
                char ch = dna.charAt(i);
                if (ch == 'C' || ch == 'G') {
                    countC++;
               
                }
            }

            // Calculate total length
            int totalLength = dna.length();

            // Calculate the ratio
            float ratio = (float) (countC + countG) / totalLength;

            return ratio;
        }

        public static void main(String[] args) {
            Part2 p = new Part2();

            String dna = "ATGCCATAG";
            System.out.println("C-G Ratio: " + cgRatio(dna)); // Output: C-G Ratio: 0.4444444
        }
    }
