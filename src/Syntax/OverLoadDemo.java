package Syntax;

public class OverLoadDemo {
    public static void main(String[] args) {
        Overload obj = new Overload();
        int resI;
        double resD;
        obj.ovlDemo();
        System.out.println();
        resI = obj.ovlDemo(4,6);
        System.out.println("Call result ob.ovlDemo(4,6): " + resI);
        System.out.println();
        resD = obj.ovlDemo(1.1,2.32);
        System.out.println("Call result ob.ovlDemo(1.2,2.32): " + resD);
    }
}
