package day9.Task2;

public abstract class Figure {
    private String colour;

    public Figure(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public abstract double area();

    public abstract  double perimeter();
}
