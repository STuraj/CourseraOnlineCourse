package usdOOPinJava.module2;

public class MyClass2 {
    private int a;
    public double b;

    public MyClass2(int first, double second)
    {
        this.a = first;
        this.b = second;
    }
    public static void main(String[] args)
    {
        MyClass2 c1 = new MyClass2(10, 20.5);
        MyClass2 c2 = new MyClass2(10, 31.5);
        // lines below are changed from the question above
        c2 = c1;
        c1.a = 2;
        System.out.println(c2.a);
    }
}
