package circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    private String getColor() {
        return color;
    }
    protected double getArea() {
        return Math.PI*getRadius()*getRadius();
    }
}
