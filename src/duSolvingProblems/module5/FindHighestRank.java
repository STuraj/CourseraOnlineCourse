package duSolvingProblems.module5;

import edu.duke.DirectoryResource;
import edu.duke.FileResource;
import org.apache.commons.csv.CSVRecord;

import java.io.File;

public class FindHighestRank {
        public int yearOfHighestRank(String name, String gender){
            DirectoryResource dr = new DirectoryResource();
            int highestRank = Integer.MAX_VALUE;
            int year = -1;
            for(File f : dr.selectedFiles()){
                FileResource fr = new FileResource(f);
                int rank = 0;
                int currRank = -1;
                for(CSVRecord rec :fr.getCSVParser(false)){
                    if(rec.get(1).equals(gender)){
                        rank ++;
                        if(rec.get(0).equals(name)){
                            currRank=rank;
                            break;
                        }
                    }
                }
                if(currRank != -1 && currRank <highestRank){
                    highestRank=currRank;
                    String fileName = f.getName();
                    year = Integer.parseInt(fileName.substring(3,7));
                }
            }
            return year;
        }
        public void testYearOfHighestRank(){

            int year = yearOfHighestRank("Mich" , "M");
            System.out.println(year);
        }
}
