package Syntax;

public class VarArgs2 {

    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.println("Content: ");
        for (int i = 0; i < v.length; i++)
            System.out.println("arg " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One argument in array: ", 10);
        vaTest("Three argument in array: ", 1, 2, 3);
        vaTest("Zero arguments in array: ");
    }
}
