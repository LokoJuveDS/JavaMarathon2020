package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrandOfCar("Ferrari");
        car1.setModelOfCar("360 Modena");
        car1.setYearOfCarManufacture(1999);
        car1.setColourOfCar("Red");
        // тест
        car1.setLength(4);
        System.out.println(car1.getBrandOfCar());
        System.out.println(car1.getModelOfCar());
        System.out.println(car1.getYearOfCarManufacture());
        System.out.println(car1.getColourOfCar());
        // тест
        System.out.println(car1.getLength());

    }
}

class Car {
    private String brandOfCar;
    private String modelOfCar;
    private int yearOfCarManufacture;
    private String colourOfCar;
    // тест
    private int length;

    public int getLength() {
        System.out.println("Длина: ");
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getBrandOfCar() {
        System.out.print("Марка автомобиля: ");
        return brandOfCar;
    }

    public void setBrandOfCar(String brandOfCar) {
        this.brandOfCar = brandOfCar;
    }

    public String getModelOfCar() {
        System.out.print("Модель: ");
        return modelOfCar;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    public int getYearOfCarManufacture() {
        System.out.print("Год выпуска: ");
        return yearOfCarManufacture;
    }

    public void setYearOfCarManufacture(int yearOfCarManufacture) {
        this.yearOfCarManufacture = yearOfCarManufacture;
    }

    public String getColourOfCar() {
        System.out.print("Цвет: ");
        return colourOfCar;
    }

    public void setColourOfCar(String colourOfCar) {
        this.colourOfCar = colourOfCar;
    }
}
