package day9.Task2;

public class Triangle extends Figure {

    private final int firstSide;
    private final int secondSide;
    private final int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide, String colour) {
        super(colour);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double area() {
        return Math.sqrt((perimeter() / 2) * (perimeter()/2 - firstSide) * (perimeter()/2 - secondSide) * (perimeter()/2 - thirdSide));
    }

    @Override
    public double perimeter() {
        return firstSide + secondSide + thirdSide;
    }
}
