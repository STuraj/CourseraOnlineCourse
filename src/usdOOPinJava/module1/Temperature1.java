package usdOOPinJava.module1;

public class Temperature1 {
    private double celsius;

    public Temperature1(double c) {
        celsius = c;
    }

    public double getCelsius() {
        return celsius;
    }


//    public class TemperatureTester {
        public static void main(String[] args) {
            Temperature1 t = new Temperature1(36.5);
          //  System.out.println(t.celsius); // This line would cause a compile-time error
            System.out.println(t.getCelsius());
        }
    }

