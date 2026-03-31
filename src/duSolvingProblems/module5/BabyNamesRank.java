package duSolvingProblems.module5;

import edu.duke.*;
import org.apache.commons.csv.*;



    public class BabyNamesRank {
        public static void main(String[] args) {
            FileResource fr = new FileResource("example-babynames.csv");
            CSVParser parser = fr.getCSVParser(false);
            int rank = 0;
            for (CSVRecord rec : parser) {
                String name = rec.get(0);
                String gender = rec.get(1);
                String count = rec.get(2);
                if (gender.equals("F")) {
                    rank = rank + 1;
                    if (rank == 2) {
                        System.out.println(name + " " + count);
                    }
                }
            }
        }
    }

/* Contents of example-babynames.csv (no header row):
Emma,F,20799
Olivia,F,19674
Noah,M,19144
Liam,M,18342
*/

