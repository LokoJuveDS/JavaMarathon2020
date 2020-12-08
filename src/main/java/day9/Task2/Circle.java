package day9.Task2;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String colour) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
