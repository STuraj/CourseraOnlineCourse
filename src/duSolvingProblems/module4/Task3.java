package duSolvingProblems.module4;

public class Task3 {
    public static void main(String[] args) {


                double largestSoFar = -1.0;

                // Day 1 hottest hour
                double currentTemp = 51.1;
                if (largestSoFar < 0) {
                    largestSoFar = currentTemp;
                } else {
                    if (currentTemp > largestSoFar) {
                        largestSoFar = currentTemp;
                    }
                }

                // Day 2 hottest hour
                currentTemp = 54.0;
                if (largestSoFar < 0) {
                    largestSoFar = currentTemp;
                } else {
                    if (currentTemp > largestSoFar) {
                        largestSoFar = currentTemp;
                    }
                }

                // Day 3 hottest hour
                currentTemp = 49.5;
                if (largestSoFar < 0) {
                    largestSoFar = currentTemp;
                } else {
                    if (currentTemp > largestSoFar) {
                        largestSoFar = currentTemp;
                    }
                }

                System.out.println(largestSoFar);
            }
        }

