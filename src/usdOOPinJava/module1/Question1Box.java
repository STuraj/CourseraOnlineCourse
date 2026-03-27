package usdOOPinJava.module1;

import javax.swing.*;

public class Question1Box {
    int width;

    public Question1Box(int w) {
        width = w;
    }


    public class BoxTester {
        public static void main(String[] args) {
            Box smallBox = new Box(3);
            Box bigBox = new Box(7);
           //System.out.println(bigBox.width);
        }
    }
}
