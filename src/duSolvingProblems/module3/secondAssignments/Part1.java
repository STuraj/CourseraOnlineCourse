package duSolvingProblems.module3.secondAssignments;

public class Part1 {
    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int currentIndex = dna.indexOf(stopCodon, startIndex + 3);
        while (currentIndex != -1) {
            int temp = currentIndex - startIndex;
            if (temp % 3 == 0) {
                return currentIndex;
            } else {
                currentIndex = dna.indexOf(stopCodon, currentIndex + 1);
            }
        }
        return dna.length();

    }

    public void testFindStopCodon() {
        // Test case 1: DNA string with TAA at index 9
        String dna1 = "ATGCGATAGCTAA";
        int result = findStopCodon(dna1, 0, "TAA");
        System.out.println("Test 1 (should be 6); " + result);
        result = findStopCodon("TAG", 0, "ATGCGATAGCTA");
        System.out.println("Test 2 (should be 6); " + result);
        result = findStopCodon("TGA", 0, "ATGCGATAGCTAGTGA");
        System.out.println("Test 3 (should be 6); " + result);
        result = findStopCodon("ATGAAATAG", 0, "TAA");
        System.out.println("Test 4 (should be length): " + result);

    }

    public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }
        int taaIndex = dna.indexOf("TAA", startIndex);
        int tagIndex = dna.indexOf("TAG", startIndex);
        int tgaIndex = dna.indexOf("TGA", startIndex);
        int minIndex = Math.min(Math.min(taaIndex, tagIndex), tgaIndex);
        if (minIndex == dna.length()) {
            return "";
        }
        return dna.substring(startIndex, minIndex + 3);
    }

    public void testFindGene() {
        String dna1 = "ATGCGATAGCTA";
        System.out.println("DNA:" + dna1);
        System.out.println("Gene: " + findGene(dna1));
        String dna2 = "AATGCTAACTAGCTGACTAAT";
        System.out.println("DNA:" + dna2);
        System.out.println("Gene: " + findGene(dna2));
        String dna3 = "AATGCCCCCCCC";
        System.out.println("DNA:" + dna3);
        System.out.println("Gene: " + findGene(dna3));
        String dna4 = "ATGAAATAGG";
        System.out.println("DNA:" + dna4);
        System.out.println("Gene: " + findGene(dna4));
        String dna5 = "AATGCTAACTAGCTGACTA";
        System.out.println("DNA:" + dna5);
        System.out.println("Gene: " + findGene(dna5));


    }

    public void printAllGenes(String dna) {
        int startIndex = 0;
        while (true) {
            int atgIndex = dna.indexOf("ATG", startIndex);
            if (atgIndex == -1) {
                break;
            }
            String gene = findGene(dna.substring(atgIndex));
            if (gene.isEmpty()) {
                startIndex = atgIndex + 3;
            } else {
                System.out.println(gene);
                startIndex = atgIndex + gene.length();
            }

        }
    }

    public static void main(String[] args) {
        Part1 obj = new Part1();

        obj.testFindStopCodon();
        obj.testFindGene();

        System.out.println("All genes:");

        obj.printAllGenes("AATGCTAACTAGATGTTTTGA");
    }
}
