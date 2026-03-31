package duSolvingProblems.module4;

public class Task1 {

        public static void main(String[] args) {
            String[] row = {"2021", "42.75"};

            String yearText = row[0];
            String scoreText = row[1];

            int year = Integer.parseInt(yearText);
            double score = Double.parseDouble(scoreText);

            System.out.println(yearText + " " + scoreText + " " + year + " " + score);
        }
    }

