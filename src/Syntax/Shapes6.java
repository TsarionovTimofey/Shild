package Syntax;

public class Shapes6 {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("contour", 9, 12, "Blue");
        ColorTriangle t2 = new ColorTriangle("filled in", 2, 2, "Red");

        System.out.println("Information about t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area - " + t1.area());
        System.out.println();

        System.out.println("Information about t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area - " + t2.area());
        System.out.println();
    }
}
