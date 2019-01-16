package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side); // parent constructor still needs to arguments
        name = "square"; // if we don't assign "square", the default would be "rectangle"
    }

    @Override
    public int getArea() {
        return (int) Math.pow(length, 2); // explicit casting
    }

    @Override
    public int getPerimeter() {
        return 4 * length;
    }
}
