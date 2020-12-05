package day6;

public class Car {
    private String brandOfCar;
    private String modelOfCar;
    private int yearOfCarManufacture;
    private String colourOfCar;

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

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int year) {
        return Math.abs(year - yearOfCarManufacture);
    }
}
