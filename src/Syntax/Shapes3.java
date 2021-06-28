package Syntax;

public class Shapes3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("filled in", 4.0, 4.0);
        Triangle t2 = new Triangle("contour", 8.0, 12.0);

        System.out.println("Information about t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area());
        System.out.println();

        System.out.println("Information about t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area());

//        TwoDShape shape = new TwoDShape();
//        shape.setWidth(10);
//        shape.setHeight(20);
//        shape.showDim();
    }
}
