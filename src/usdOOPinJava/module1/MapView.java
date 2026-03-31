package usdOOPinJava.module1;

public class MapView {

        String name;
        int x;
        int y;
        int width;
        int height;

        MapView() {
            name = "Default";
            x = 0;
            y = 0;
            width = 800;
            height = 600;
        }

        MapView(int w, int h) {
            name = "Sized";
            x = 0;
            y = 0;
            width = w;
            height = h;
        }

        MapView(String n, int px, int py, int w, int h) {
            name = n;
            x = px;
            y = py;
            width = w;
            height = h;
        }



        public static void main(String[] args) {
            MapView a = new MapView();
            MapView b = new MapView(500, 400);
            MapView c = new MapView("Inset", 50, 40, 300, 200);

            System.out.println(a.name + " " + a.width + "x" + a.height + ", " +
                    b.name + " " + b.width + "x" + b.height + ", " +
                    c.name + " " + c.x + "," + c.y);
        }
    }


