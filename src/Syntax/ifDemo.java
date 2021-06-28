package Syntax;

public class ifDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;
        if (a < b) System.out.println("a <b");
        if (a == b) System.out.println("You are will not see that text");
        System.out.println();
        c = a - b;
        System.out.println("c = -1");
        if (c >= 0) System.out.println("c >= 0");
        if (c < 0) System.out.println("c < 0");
        c = b - a;
        System.out.println("c = 1");
        if (c >= 0) System.out.println("c >= 0");
        if (c < 0) System.out.println("c < 0");
    }
}
