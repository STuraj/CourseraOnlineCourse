package module3;

public class Task10 {

        public static void main(String[] args) {
            String dna1 = "ATGAAATAG";
            String dna2 = "CCCCGGGG";

            String gene1 = findGene(dna1);
            String gene2 = findGene(dna2);

            if (gene1.isEmpty()) {
                System.out.println("no gene in first");
            } else {
                System.out.println("found gene in first");
            }

            if (gene2.isEmpty()) {
                System.out.println("no gene in second");
            } else {
                System.out.println("found gene in second");
            }
        }

        public static String findGene(String dna) {
            if (dna.equals("ATGAAATAG")) {
                return "ATGAAATAG";
            }
            return "";
        }
    }


