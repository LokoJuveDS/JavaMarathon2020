package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {new Triangle(10, 10, 10, "Red"),
                //а это спецаильно было сделано, что параметры в таком поряджке идут? а не в том, в котором IDEA автоматически
                //создаёт конструктор, или я просто параною?))
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumOfRedPerimeter = 0;
        for (Figure figure : figures) {
            if (figure.getColour().equals("Red")) {
                sumOfRedPerimeter += figure.perimeter();
            }
        }
        return sumOfRedPerimeter;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumOfRedArea = 0;
        for (Figure figure : figures) {
            if (figure.getColour().equals("Red")) {
                sumOfRedArea += figure.area();
            }
        }
        return sumOfRedArea;
    }
}
