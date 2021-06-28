package Syntax;

public class VarArgs4 {
    static void vaTest(int... v) {
    }

    static void vaTest(boolean... v) {
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true,true,false);
//        vaTest();
    }
}
