package usdOOPinJava.module2;

public class Point {

    public int x;
    public int y;


    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 3;
        p1.y = 7;

        Point p2 = new Point();
        p2.x = 10;
        p2.y = 20;

        p1 = p2;
        p1.x = 99;

        System.out.println(p2.y);
    }
}
