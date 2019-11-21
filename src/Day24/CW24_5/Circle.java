package Day24.CW24_5;

import java.awt.*;

public class Circle {
    private double radius;
    private Color color;
    final static double PI = 3.14159;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Area : " + getArea() + "\nCircumference : " + getCircumference();
    }

}
