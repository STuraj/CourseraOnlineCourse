package module3;

public class Task13 {

        public static String findGene(String dna, int startIndex) {
            int atgIndex = dna.indexOf("ATG", startIndex);
            if (atgIndex == -1) {
                return "";
            }
            int taaIndex = dna.indexOf("TAA", atgIndex + 3);
            if (taaIndex == -1) {
                return "";
            }
            return dna.substring(atgIndex, taaIndex + 3);
        }

        public static void main(String[] args) {
            String dna = "CCCATGAAATAACC";
            int startIndex = 0;
            String currentGene = findGene(dna, startIndex);
            System.out.println(currentGene);
        }
    }


