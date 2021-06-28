package Syntax;

public class MyClass3 {
    int x;

    MyClass3() {
        System.out.println("Inside Interfaces.MyClass().");
        x = 0;
    }

    MyClass3(int i) {
        System.out.println("Inside Interfaces.MyClass(int)");
        x = i;
    }

    MyClass3(double d) {
        System.out.println("Inside Interfaces.MyClass(double)");
        x = (int) d;
    }

    MyClass3(int i, int j) {
        System.out.println("Inside Interfaces.MyClass(int, int)");
        x = i * j;
    }
}
