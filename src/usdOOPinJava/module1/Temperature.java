package usdOOPinJava.module1;

public class Temperature {
    private int value;

    public Temperature(int initial) {
        value = initial;
    }

    public void setValue(int newValue) {
        value = newValue;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Temperature t = new Temperature(20);
        t.setValue(35);
        System.out.println(t.getValue());
    }
}
