package Syntax;

public class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }

    Triangle(double x) {
        super(x, "triangle");
        style = "filled in";
    }

    Triangle(Triangle triangleObject) {
        super(triangleObject);
        style = triangleObject.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}
