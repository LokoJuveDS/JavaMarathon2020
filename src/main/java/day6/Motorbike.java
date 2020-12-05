package day6;


public class Motorbike {

    private final String brandOfMotorbike;
    private final int yearOfMotorbikeManufacture;
    private final String colourOfMotorbike;

    public Motorbike(String brandOfMotorbike,  String colourOfMotorbike, int yearOfMotorbikeManufacture) {
        this.brandOfMotorbike = brandOfMotorbike;
        this.yearOfMotorbikeManufacture = yearOfMotorbikeManufacture;
        this.colourOfMotorbike = colourOfMotorbike;
    }

    public String getBrandOfMotorbike() {
        System.out.print("Марка мотоцикла: ");
        return brandOfMotorbike;
    }

    public int getYearOfMotorbikeManufacture() {
        System.out.print("Год выпуска: ");
        return yearOfMotorbikeManufacture;
    }

    public String getColourOfMotorbike() {
        System.out.print("Цвет: ");
        return colourOfMotorbike;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        return Math.abs(year - yearOfMotorbikeManufacture);
    }
}
