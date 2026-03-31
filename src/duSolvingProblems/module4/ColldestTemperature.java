package duSolvingProblems.module4;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ColldestTemperature {

       /**
         * Returns the CSVRecord with the coldest temperature in the file.
         * Ignores invalid temperatures (-9999).
         */
        public static CSVRecord coldestHourInFile(CSVParser parser) {
            CSVRecord coldestSoFar = null;

            for (CSVRecord currentRow : parser) {
                // Read the temperature from the "TemperatureF" column (adjust column name if different)
                String tempStr = currentRow.get("TemperatureF");
                double temp;

                try {
                    temp = Double.parseDouble(tempStr);
                } catch (NumberFormatException e) {
                    continue; // skip invalid numbers
                }

                if (temp == -9999) {
                    continue; // skip invalid temperature readings
                }

                if (coldestSoFar == null) {
                    coldestSoFar = currentRow; // first valid reading
                } else {
                    double coldestTemp = Double.parseDouble(coldestSoFar.get("TemperatureF"));
                    if (temp < coldestTemp) {
                        coldestSoFar = currentRow; // update coldest
                    }
                }
            }

            return coldestSoFar;
        }

        /**
         * Test method for coldestHourInFile()
         */
        public static void testColdestHourInFile() {
            try {
                Reader reader = new FileReader("weather-data.csv"); // replace with your CSV file path
                CSVParser parser = CSVFormat.DEFAULT
                        .withHeader()
                        .withSkipHeaderRecord()
                        .parse(reader);

                CSVRecord coldest = coldestHourInFile(parser);

                if (coldest != null) {
                    System.out.println("Coldest temperature: " + coldest.get("TemperatureF"));
                    System.out.println("At time: " + coldest.get("DateUTC"));
                } else {
                    System.out.println("No valid temperature data found.");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Main method to run the test
        public static void main(String[] args) {
            testColdestHourInFile();
        }
    }

