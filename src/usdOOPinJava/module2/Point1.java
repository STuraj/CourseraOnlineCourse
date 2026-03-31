package usdOOPinJava.module2;

public class Point1 {

        int x;



        public static void main(String[] args) {
            Point a = new Point();
            a.x = 5;

            Point b = new Point();
            b.x = 9;

            a = b;
            b.x = 12;

            System.out.println(a.x);
        }
    }

