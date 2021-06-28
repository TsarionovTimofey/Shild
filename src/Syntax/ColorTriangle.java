package Syntax;

public class ColorTriangle extends Triangle {
    private String color;

    public ColorTriangle(String s, double w, double h, String color) {
        super(s, w, h);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Color - " + color);
    }
}
