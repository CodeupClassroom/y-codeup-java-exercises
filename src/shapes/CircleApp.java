package shapes;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the shapes application!");
        System.out.println("There are currently " + Circle.getNumberOfCircles() + " circles in the app.");

        Circle circle1 = new Circle(5);
        System.out.println("Radius is: " + circle1.getRadius());
        System.out.println("Area is: " + circle1.getArea());
        System.out.println("Circumference is: " + circle1.getCircumference());

        Circle circle2 = new Circle(5);

        System.out.println("Number of circles is now: " + Circle.getNumberOfCircles());
    }
}
