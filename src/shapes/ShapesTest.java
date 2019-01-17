package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable shape;

        shape = new Square(4);
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());

        Measurable myShape = new Rectangle(10, 17);
        System.out.println("Area: " + myShape.getArea());
        System.out.println("Perimeter: " + myShape.getPerimeter());
    }
}
