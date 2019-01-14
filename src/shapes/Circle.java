package shapes;

public class Circle {
    private double radius;
    private static int numberOfCircles = 0;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircles++;
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
