package inheritance;

class Shape {
    private int x;
    private int y;

    public Shape() {
    }
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Rectangle extends Shape {
    private int hieght;
    private int width;

    public Rectangle() {
        this(0, 0, 0, 0);
    }

    public Rectangle(int height, int width) {
        this(0, 0, height, width);
    }
    public Rectangle(int x, int y, int hieght, int width) {
        super(x, y);
        this.hieght = hieght;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "hieght=" + hieght +
                ", width=" + width +
                "} " + super.toString();
    }
}
public class ConstructorChaining {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        System.out.println(rectangle);

        Shape rectangle2 = new Rectangle(12, 10);
        System.out.println(rectangle2);

        Shape rectangle3 = new Rectangle(1,2,3,4);
        System.out.println(rectangle3);
    }
}
