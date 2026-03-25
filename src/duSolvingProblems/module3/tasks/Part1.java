package duSolvingProblems.module3.tasks;

public class Part1 {
    // public static void findSimpleGene(String[] args) {
    public String findGeneSimple(String dna) {
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        if (stopIndex == -1) {
            return "";
        }
        result = dna.substring(startIndex, stopIndex + 3);

        return result;
    }

    public void testFindGeneSimple() {
        String dna = "AATATGTGTCCGTAATGT";
        System.out.println("DNA strand is " + dna);
       String gene = findGeneSimple(dna);
       System.out.println("Gene is " + gene);
        dna = "AATGCTAGGTTCGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
       System.out.println("Gene is " + gene);
        dna = "ATCCTATGCTTCGGCTCTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
       System.out.println("Gene is " + gene);
    }

    public static void main(String[] args) {
        Part1 p = new Part1();

        p.testFindGeneSimple();
    }
}
