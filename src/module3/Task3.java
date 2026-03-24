package module3;

public class Task3 {

        public static void main(String[] args) {
            String dna = "ATGCCCTTT";
            int taaIndex = dna.length();
            int tagIndex = dna.length();
            int tgaIndex = dna.length();

            int temp = Math.min(taaIndex, tagIndex);
            int minIndex = Math.min(temp, tgaIndex);

            if (minIndex == dna.length()) {
                System.out.println("");
            } else {
                System.out.println(dna.substring(0, minIndex + 3));
            }
        }
    }

