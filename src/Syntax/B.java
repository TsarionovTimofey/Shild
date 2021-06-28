package Syntax;

public class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
        System.out.println("Constructor Interfaces.B");
    }

    void show() {
        System.out.println("i in superClass: " + super.i);
        System.out.println("i in subClass : " + i);
    }
}
