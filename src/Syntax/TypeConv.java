package Syntax;

public class TypeConv {
    public static void main(String[] args) {
        Overload2 obj = new Overload2();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;
        obj.f(i);
        obj.f(d);
        obj.f(b);
        obj.f(s);
        obj.f(f);
    }
}
