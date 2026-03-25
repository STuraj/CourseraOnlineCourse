package duSolvingProblems.module3.tasks;




public class Part2 {
    public <stopCodon, startCodon> String findGeneSimple(String dna, String startCodon, String stopCodon) {
        String result = "";
        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf(stopCodon, startIndex +  stopCodon.length());
        if (stopIndex == -1) {
            return "";
        }
        result = dna.substring(startIndex, stopIndex + 3);

        dna = dna.toLowerCase();
        return result;
    }

    public void testFindGeneSimple() {
        String dna = "AATATGTGTCCGTAATGT";
        dna = dna.toLowerCase();
        System.out.println("DNA strand is " + dna);
        String gene = findGeneSimple(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);
        dna = "AATGCTAGGTTCGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);
        dna = "ATCCTATGCTTCGGCTCTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna,  "ATG", "TAA");
        System.out.println("Gene is " + gene);
    }
    public static void main(String[] args) {
        Part1 p = new Part1();

        p.testFindGeneSimple();
    }

}
