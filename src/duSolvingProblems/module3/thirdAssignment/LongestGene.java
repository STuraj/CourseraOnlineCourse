package duSolvingProblems.module3.thirdAssignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class LongestGene {



        public static void main(String[] args) {
            String urlPath = "https://users.cs.duke.edu/~rodger/GRch38dnapart.fa";
            int maxLength = 0;
            int currentLength = 0;

            try (BufferedReader br = new BufferedReader(new InputStreamReader(new URL(urlPath).openStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.startsWith(">")) {
                        // Update max length if needed
                        if (currentLength > maxLength) {
                            maxLength = currentLength;
                        }
                        currentLength = 0; // reset for next gene
                    } else {
                        currentLength += line.trim().length(); // add sequence length
                    }
                }
                // Check the last gene
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Length of the longest gene: " + maxLength);
        }
    }

