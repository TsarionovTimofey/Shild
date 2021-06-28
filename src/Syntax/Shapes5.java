package Syntax;

public class Shapes5 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("contour", 8, 12);
        Triangle t3 = new Triangle(4);
        t1 = t2;

        System.out.println("Information about t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area());
        System.out.println();

        System.out.println("Information about t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area());
        System.out.println();

        System.out.println("Information about t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area - " + t3.area());
        System.out.println();
    }
}
