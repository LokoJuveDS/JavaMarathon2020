package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("Kawasaki", "ZX-6R", 2003, "Green");
        System.out.println(motorbike1.getBrandOfMotorbike());
        System.out.println(motorbike1.getModelOfMotorbike());
        System.out.println(motorbike1.getYearOfMotorbikeManufacture());
        System.out.println(motorbike1.getColourOfMotorbike());

    }
}

class Motorbike {
    // так как нет сеттеров, это подразумевает, что изменять их мы не должны в течении жизни, а значит разумно сделать поля final
    private final String brandOfMotorbike;
    private final String modelOfMotorbike;
    private final int yearOfMotorbikeManufacture;
    private final String colourOfMotorbike;

    public Motorbike(String brandOfMotorbike, String modelOfMotorbike, int yearOfMotorbikeManufacture, String colourOfMotorbike) {
        this.brandOfMotorbike = brandOfMotorbike;
        this.modelOfMotorbike = modelOfMotorbike;
        this.yearOfMotorbikeManufacture = yearOfMotorbikeManufacture;
        this.colourOfMotorbike = colourOfMotorbike;
    }

    public String getBrandOfMotorbike() {
        System.out.print("Марка мотоцикла: ");
        return brandOfMotorbike;
    }

    public String getModelOfMotorbike() {
        System.out.print("Модель: ");
        return modelOfMotorbike;
    }

    public int getYearOfMotorbikeManufacture() {
        System.out.print("Год выпуска: ");
        return yearOfMotorbikeManufacture;
    }

    public String getColourOfMotorbike() {
        System.out.print("Цвет: ");
        return colourOfMotorbike;
    }
}
