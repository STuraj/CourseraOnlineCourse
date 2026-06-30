package duSolvingProblems.module5;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVRecord;

public class TotalBirthsHigherRanked {
    public int getTotalBirthsRankedHigher(int year, String name, String gender){
        FileResource fr = new FileResource();
        int totalBirths=0;
        for(CSVRecord rec : fr.getCSVParser(false)){
            if(rec.get(1).equals(gender)){
                if(rec.get(0).equals(name)){
                    return totalBirths;
                }
                totalBirths +=Integer.parseInt(rec.get(2));
            }
        }
        return 0;
    }
    public void testGetTotalBirthsRankedHigher(){
        int total = getTotalBirthsRankedHigher(1990, "Drew" , "M");
        System.out.println(total);
    }
}
