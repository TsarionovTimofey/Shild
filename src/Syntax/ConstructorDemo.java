package Syntax;

public class ConstructorDemo {
    public static void main(String[] args) {
        MyClass t3 = new MyClass();
        MyClass t4 = new MyClass();
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);
        System.out.println(t1.x + " " + t2.x);
    }
}
