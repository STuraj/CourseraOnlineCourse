package duSolvingProblems.module3.thirdAssignment;

import java.io.*;
import java.net.URL;

public class CgRatioCounter {





        public static void main(String[] args) {
            String urlPath = "http://www.cs.duke.edu/~rodger/GRch38dnapart.fa";
            int countHighCG = 0;
            StringBuilder seq = new StringBuilder();

            try (BufferedReader br = new BufferedReader(new InputStreamReader(new URL(urlPath).openStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.startsWith(">")) {
                        // process previous gene
                        if (seq.length() > 0 && getCGRatio(seq.toString()) > 0.35) {
                            countHighCG++;
                        }
                        seq.setLength(0); // reset for next gene
                    } else {
                        seq.append(line.trim());
                    }
                }
                // process last gene
                if (seq.length() > 0 && getCGRatio(seq.toString()) > 0.35) {
                    countHighCG++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Number of genes with CG ratio > 0.35: " + countHighCG);
        }

        private static double getCGRatio(String s) {
            int cg = 0;
            for (char c : s.toUpperCase().toCharArray()) {
                if (c == 'C' || c == 'G') cg++;
            }
            return (double) cg / s.length();
        }
    }
