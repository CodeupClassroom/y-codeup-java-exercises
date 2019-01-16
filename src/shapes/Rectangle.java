package shapes;

public class Rectangle {
    protected int length;
    protected int width;
    protected String name;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        name = "rectangle";
    }

    public int getArea() {
        return width * length;
    }

    public int getPerimeter() {
        return 2 * length + 2 * width;
    }

    public void getInfo() {
        System.out.println("Area of " + name + " with width of " + width + " and length of " + length + " is " + getArea());
        System.out.println("Perimeter of " + name +  " with width of " + width + " and length of " + length + " is " + getPerimeter());

    }
}
