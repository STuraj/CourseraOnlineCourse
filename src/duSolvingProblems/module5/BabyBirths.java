package duSolvingProblems.module5;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVRecord;

public class BabyBirths {
    public void printNames(){
        FileResource fr = new FileResource();
        for (CSVRecord rec : fr.getCSVParser(false)){
            System.out.println("Name" + rec.get(0)+
                    "Gender" + rec.get(1)+
                    "Num Born" +rec.get(2));
        }
    }

    public static void main(String[] args) {
        BabyBirths bb = new BabyBirths();
        bb.printNames();
    }
}
