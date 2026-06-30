package duSolvingProblems.module5;

import edu.duke.DirectoryResource;
import edu.duke.FileResource;
import org.apache.commons.csv.CSVRecord;

import java.io.File;

public class FindAverageRank {
    public double getAverageRank(String name, String gender){
        DirectoryResource dr = new DirectoryResource();
        double  totalRank = 0;
        int filesFound=0;
        for(File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            int rank = 0;
            int currRank = -1;
            for(CSVRecord rec : fr.getCSVParser(false)){
                if(rec.get(1).equals(gender)){
                    rank ++;
                    if(rec.get(0).equals(name)){
                        currRank=rank;
                        break;
                    }
                }
            }
            if(currRank !=-1){
                totalRank +=currRank;
                filesFound++;
            }
        }
        if(filesFound ==0){
            return -1.0;
        }
        return totalRank/filesFound;
    }
    public void testGetAverageRank(){
        double avg = getAverageRank("Robert", "M");
        System.out.println(avg);
    }
}
