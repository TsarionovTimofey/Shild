package Syntax;

public abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape(double w, double h) {
        width = w;
        height = h;
        name = "none";
    }

    TwoDShape(double x, String name) {
        width = height = x;
        this.name = name;
    }

    public TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    TwoDShape(TwoDShape twoDShapeObject) {
        width = twoDShapeObject.width;
        height = twoDShapeObject.height;
        name = twoDShapeObject.name;
    }

    public TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape(double x) {
        width = height = x;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim() {
        System.out.println("Width and height - " +
                width + " and " + height);
    }

   abstract double area();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
