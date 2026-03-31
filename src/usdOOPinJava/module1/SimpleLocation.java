package usdOOPinJava.module1;

public class SimpleLocation {

    private double latitude;

    public SimpleLocation(double lat) {
        latitude = lat;
    }

    public void setLatitude(double lat) {
        if (lat < -180 || lat > 180) {
            System.out.println("Illegal latitude value");
        } else {
            latitude = lat;
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public static void main(String[] args) {
        SimpleLocation loc = new SimpleLocation(10.0);
        loc.setLatitude(250.0);
        loc.setLatitude(45.0);
        System.out.println(loc.getLatitude());
    }
}
