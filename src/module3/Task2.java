package module3;

public class Task2 {

        public static void main(String[] args) {
            String dna = "CCCATGAAACCCGGGTAACT";
            int startIndex = dna.indexOf("ATG");
            int minIndex = dna.indexOf("TAA", startIndex + 3);
            String gene = dna.substring(startIndex, minIndex + 3);
            System.out.println(gene);
        }
    }

