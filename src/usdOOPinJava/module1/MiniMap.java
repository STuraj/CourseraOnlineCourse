package usdOOPinJava.module1;

public class MiniMap {

        int x;
        int y;
        int width;
        int height;

        MiniMap(int width, int height) {
            this.x = 0;
            this.y = 0;
            this.width = width;
            this.height = height;
        }

        MiniMap(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }



        public static void main(String[] args) {
            MiniMap mapA = new MiniMap(800, 600);
            MiniMap mapB = new MiniMap(50, 40, 700, 500);

            System.out.println(mapA.x + "," + mapA.y + "," + mapB.width + "," + mapB.height);
        }
    }

