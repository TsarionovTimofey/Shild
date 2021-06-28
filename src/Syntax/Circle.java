package Syntax;

public class Circle extends TwoDShape {
    private double radius;

    public Circle(double radius) {
        super(0, "circle");
        this.radius = radius;
    }

    double area() {
        return radius * radius * Math.PI;
    }
}
