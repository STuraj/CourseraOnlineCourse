package duSolvingProblems.module5;

public class Task3 {

        public static void main(String[] args) {
            Pixel pixel = new Pixel(30, 90, 150);
            int average = 90;
            pixel.setRed(average);
            pixel.setGreen(average);
            pixel.setBlue(average);
            System.out.println(pixel.getRed() + " " + pixel.getGreen() + " " + pixel.getBlue());
        }
    }

    class Pixel {
        private int r, g, b;

        public Pixel(int red, int green, int blue) {
            r = red;
            g = green;
            b = blue;
        }

        public void setRed(int value) {
            r = value;
        }

        public void setGreen(int value) {
            g = value;
        }

        public void setBlue(int value) {
            b = value;
        }

        public int getRed() {
            return r;
        }

        public int getGreen() {
            return g;
        }

        public int getBlue() {
            return b;
        }
    }

