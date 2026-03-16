package module2;

public class Task10 {
    public static void main(String[] args) {
        double[][] points = {
                {-1, 3},
                {-1, -1},
                {4, -1},
                {1, 3}
        };
        double perimeter = 0.0;
        int n = points.length;
        //Calculating the distance between two consecutive points
        for (int i = 0; i < n; i++) {
            double x1 = points[i][0];
            double y1 = points[i][1];
            double x2 = points[(i + 1) % n][0]; //to return from the last point to the first point
            double y2 = points[(i + 1) % n][1];
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            perimeter += distance;
            //Print the answer to two decimal places
            System.out.printf("Perimeter is %f\n", perimeter);
        }
    }
}
