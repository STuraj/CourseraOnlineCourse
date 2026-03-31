package usdOOPinJava.module1;

public class ReadOnlyCounter {
    private int count;

    public ReadOnlyCounter(int start) {
        this.count = start;
    }

    public int getCount() {
        return this.count;
    }



    public static void main(String[] args) {
        ReadOnlyCounter counter = new ReadOnlyCounter(10);

        // The following line would cause a compile-time error and is not allowed:
        // counter.count = 25;

        System.out.println(counter.getCount());
    }
}
