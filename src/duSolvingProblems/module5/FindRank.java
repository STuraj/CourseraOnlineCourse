package duSolvingProblems.module5;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVRecord;

public class FindRank {
    public int getRank(int year, String name, String gender){
        FileResource fr = new FileResource();
        int rank =0;
        for (CSVRecord rec : fr.getCSVParser(false)){
            if (rec.get(1).equals(gender)){
                rank++;
                if (rec.get(0).equals(name)){
                    return rank;
                }
            }
        }
        return -1;
    }
    public void testGetRank(){
        int rank = getRank(1972, "Susan", "F");
        System.out.println("Susan rank = "+ rank);
    }
}
