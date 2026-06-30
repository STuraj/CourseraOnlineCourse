package duSolvingProblems.module5;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVRecord;

public class CountGirls {
    public int countGirlsName(int year){
        FileResource fr = new FileResource();
        int count =0;
        for(CSVRecord rec : fr.getCSVParser(false)){
            if(rec.get(1).equals("F")){
                count++;
            }
        }

        return count;
    }
    public void testCountGirlsName(){
        int count = countGirlsName(1900);

        System.out.println(count);
    }
}
