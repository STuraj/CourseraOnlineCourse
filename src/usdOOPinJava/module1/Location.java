package usdOOPinJava.module1;

public class Location {

    double latitude;
    double longitude;

    Location() {
        latitude = 10.5;
        longitude = 20.5;
    }

    Location(double lat, double lon) {
        latitude = lat;
        longitude = lon;
    }



        public static void main(String[] args) {
            Location home = new Location();
            Location office = new Location(35.2, 42.8);
         //   Location.Main();
            System.out.println(home.latitude + "," + home.longitude + " " + office.latitude + "," + office.longitude);
        }
    }

