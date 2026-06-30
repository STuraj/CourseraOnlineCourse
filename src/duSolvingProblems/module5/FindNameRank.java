package duSolvingProblems.module5;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVRecord;

public class FindNameRank {
    public String getName(int rank, String gender){
        FileResource fr = new FileResource();
        int currRank = 0;
        for (CSVRecord rec : fr.getCSVParser(false)){
            if (rec.get(1).equals(gender)){
                currRank ++;
                if(currRank == rank){
                    return rec.get(0);
                }
            }
        }
        return "No Name";
    }
    public void testGetName(){
        String name = getName(350, "F");
        System.out.println("Girl at rank 350 = " + name);
    }
}
