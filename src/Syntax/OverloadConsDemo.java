package Syntax;

public class OverloadConsDemo {
    public static void main(String[] args) {
        MyClass3 t1 = new MyClass3();
        MyClass3 t2 = new MyClass3(88);
        MyClass3 t3 = new MyClass3(17.23);
        MyClass3 t4 = new MyClass3(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);

    }
}
