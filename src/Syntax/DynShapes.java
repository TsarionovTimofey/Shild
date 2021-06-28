package Syntax;

public class DynShapes {
    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[4];
        shapes[0] = new Triangle("contoured", 8, 12);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7);
//        shapes[4] = new TwoDShape(10, 20, "figure");

        for (TwoDShape shape : shapes) {
            System.out.println("Object - " + shape.getName());
            System.out.println("Square - " + shape.area());
            System.out.println();
        }

    }
}
