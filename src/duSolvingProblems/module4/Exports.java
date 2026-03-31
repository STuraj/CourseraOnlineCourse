package duSolvingProblems.module4;


import edu.duke.*;
import org.apache.commons.csv.*;
public class Exports {


        public void listExportersTwoProducts(CSVParser parser, String item1, String item2) {
            int count = 0; // ölkələrin sırasını saymaq
            for (CSVRecord record : parser) {
                String export = record.get("Exports");
                if (export.contains(item1) && export.contains(item2)) {
                    count++;
                    if (count == 3) { // üçüncü ölkəni tapdıq
                        String country = record.get("Country");
                        System.out.println("Third country exporting both " + item1 + " and " + item2 + ": " + country);
                        break;
                    }
                }

            }
        }
                public static void main (String[]args){
                    Exports obj = new Exports();
                    FileResource fr = new FileResource("exportdata.csv");
                    CSVParser parser = fr.getCSVParser();
                    obj.listExportersTwoProducts(parser, "gold", "diamonds");
                }
            }


