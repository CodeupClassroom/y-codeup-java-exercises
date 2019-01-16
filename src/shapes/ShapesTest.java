package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(14, 55);
        box1.getInfo();

        // if all squares are rectangles then we can store a square object in a rectangle typed variable
        Rectangle box2 = new Square(5);
        box2.getInfo();

        Rectangle box3 = new Square(12);
        box3.getInfo();
    }
}
