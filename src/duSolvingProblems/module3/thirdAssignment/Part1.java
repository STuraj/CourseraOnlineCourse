package duSolvingProblems.module3.thirdAssignment;

import edu.duke.*;

public class Part1 {

    // Tapılan stop codon indexini qaytarır
    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int currentIndex = dna.indexOf(stopCodon, startIndex);
        while (currentIndex != -1) {
            int diff = currentIndex - startIndex;
            if (diff % 3 == 0) {
                return currentIndex;
            } else {
                currentIndex = dna.indexOf(stopCodon, currentIndex + 1);
            }
        }
        return dna.length();
    }

    // Test üçün metod
    public void testFindStopCodon() {
        String dna1 = "ATGCGATAGCTAA";
        int result = findStopCodon(dna1, 0, "TAA");
        System.out.println("Test 1 (should be 9): " + result);
        result = findStopCodon(dna1, 0, "TAG");
        System.out.println("Test 2 (should be 6): " + result);
        result = findStopCodon(dna1, 0, "TGA");
        System.out.println("Test 3 (should be length): " + result);
    }

    // DNA-dan gene tapır
    public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }

        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");

        int minIndex = Math.min(taaIndex, Math.min(tagIndex, tgaIndex));

        if (minIndex == dna.length()) {
            return "";
        }
        return dna.substring(startIndex, minIndex + 3);
    }

    public void testFindGene() {
        String dna1 = "ATGCGATAGCTA";
        System.out.println("DNA:" + dna1 + " Gene: " + findGene(dna1));
        String dna2 = "AATGCTAACTAGATGTTTTGA";
        System.out.println("DNA:" + dna2 + " Gene: " + findGene(dna2));
        String dna3 = "AATGCCCCCCCC";
        System.out.println("DNA:" + dna3 + " Gene: " + findGene(dna3));
        String dna4 = "ATGAAATAGG";
        System.out.println("DNA:" + dna4 + " Gene: " + findGene(dna4));
    }

    // Bütün genləri tapır
    public StorageResource printAllGenes(String dna) {
        StorageResource geneList = new StorageResource();
        int startIndex = 0;

        while (true) {
            int atgIndex = dna.indexOf("ATG", startIndex);
            if (atgIndex == -1) {
                break;
            }

            int taaIndex = findStopCodon(dna, atgIndex, "TAA");
            int tagIndex = findStopCodon(dna, atgIndex, "TAG");
            int tgaIndex = findStopCodon(dna, atgIndex, "TGA");

            int minIndex = Math.min(taaIndex, Math.min(tagIndex, tgaIndex));

            if (minIndex != dna.length()) {
                String gene = dna.substring(atgIndex, minIndex + 3);
                geneList.add(gene);
                startIndex = minIndex + 3;
            } else {
                startIndex = atgIndex + 3;
            }
        }

        return geneList;
    }

    public static void main(String[] args) {
        Part1 obj = new Part1();  // obyekt yaradılır

        obj.testFindStopCodon();
        obj.testFindGene();

        System.out.println("All genes:");
        StorageResource genes = obj.printAllGenes("AATGCTAACTAGATGTTTTGA");
        for (String g : genes.data()) {
            System.out.println(g);
        }
    }
}