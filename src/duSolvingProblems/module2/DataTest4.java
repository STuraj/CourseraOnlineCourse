package duSolvingProblems.module2;

public class DataTest4 {
    public static void main(String[] args) {
        double[][] points = {
                {-3, 9},
                {-8, 7},
                {-12, 4},
                {-6, -2},
                {-4, -6},
                {2, -8},
                {6, -5},
                {10, -3},
                {8, 5},
                {4, 8}
        };
        double perimeter = 0;
        int n = points.length;
        for (int i = 0; i < n; i++) {
            double x1 = points[i][0];
            double y1 = points[i][1];
            double x2 = points[(i + 1) % n][0]; //to return from the last point to the first point
            double y2 = points[(i + 1) % n][1];
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            perimeter += distance;
            System.out.printf("Perimeter is %f\n", perimeter);
        }
    }
}