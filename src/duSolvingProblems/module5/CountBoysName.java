package duSolvingProblems.module5;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVRecord;

public class CountBoysName {
    public int countBoysName(int year){
        FileResource fr = new FileResource();
        int count =0;
        for(CSVRecord rec : fr.getCSVParser(false)){
            if(rec.get(1).equals("M")){
                count++;
            }
        }

        return count;
    }
    public void testCountBoysName(){

        int count = countBoysName(1905);

        System.out.println(count);
    }
}
