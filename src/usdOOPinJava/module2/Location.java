package usdOOPinJava.module2;

public class Location {

    double latitude;
    double longitude;

    public Location(double lat, double lon) {
        latitude = lat;
        longitude = lon;
    }



        public static void main(String[] args) {
            Location cityA = new Location(10.5, 20.5);
            Location cityB = new Location(30.0, 40.0);

            System.out.println(cityB.latitude);
        }
    }


