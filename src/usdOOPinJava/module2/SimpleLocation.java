package usdOOPinJava.module2;

public class SimpleLocation {
    public double lat;
    public double lon;
  //  public double latitude;
//    public boolean latitude;

    public SimpleLocation(double latIn, double lonIn) {
        this.lat = latIn;
        this.lon = lonIn;
    }



        public static void main(String[] args) {
            SimpleLocation loc1 = new SimpleLocation(39.9, 116.4);
            SimpleLocation loc2 = new SimpleLocation(55.8, 37.6);
            loc1 = loc2;
            loc1.lat = -8.3;
            System.out.println(loc2.lat + ", " + loc2.lon);
        }
    }

