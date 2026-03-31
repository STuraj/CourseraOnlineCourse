package duSolvingProblems.module4;


    import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Task2 {
        public static void main(String[] args) throws IOException {
            String data = "TemperatureF\n72.5";
            CSVParser parser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(new StringReader(data));
            CSVRecord row = parser.getRecords().get(0);
            String tempValue = row.get("TemperatureF");
            System.out.println(tempValue);
        }
    }


