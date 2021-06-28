package Syntax;

public class Rectangle extends TwoDShape {
    Rectangle(double w, double h) {
        super(w, h,"rectangle");
    }
    Rectangle(double x) {
        super(x,"rectangle");
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}
