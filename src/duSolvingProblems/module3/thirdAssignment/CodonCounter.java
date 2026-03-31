package duSolvingProblems.module3.thirdAssignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class CodonCounter {


        public static void main(String[] args) {
            String urlPath = "https://users.cs.duke.edu/~rodger/GRch38dnapart.fa";
            StringBuilder dna = new StringBuilder();

            try (BufferedReader br = new BufferedReader(new InputStreamReader(new URL(urlPath).openStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (!line.startsWith(">")) { // ignore headers
                        dna.append(line.trim());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            String codon = "CTG";
            int count = 0;
            String sequence = dna.toString().toUpperCase();

            for (int i = 0; i <= sequence.length() - codon.length(); i++) {
                if (sequence.substring(i, i + 3).equals(codon)) {
                    count++;
                }
            }

            System.out.println("Number of times CTG appears: " + count);
        }
    }

