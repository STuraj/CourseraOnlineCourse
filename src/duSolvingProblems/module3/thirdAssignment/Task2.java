package duSolvingProblems.module3.thirdAssignment;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class Task2 {


        public static void main(String[] args) {
    String filePath = "https://users.cs.duke.edu/~rodger/GRch38dnapart.fa"; // your file path
            int longGeneCount = 0;
            int currentLength = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.startsWith(">")) {
                        // Check previous gene's length before resetting
                        if (currentLength > 60) {
                            longGeneCount++;
                        }
                        currentLength = 0; // reset for next gene
                    } else {
                        // Add sequence length (ignore whitespace)
                        currentLength += line.trim().length();
                    }
                }
                // Check the last gene
                if (currentLength > 60) {
                    longGeneCount++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Number of genes longer than 60: " + longGeneCount);
        }
    }

