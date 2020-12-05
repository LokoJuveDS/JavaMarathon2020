package day6;

public class Task1 {
    public static void main(String[] args) {
        // т.к. не было условия, просто использовал оба метода
        Car car1 = new Car();
        car1.setBrandOfCar("Ferrari");
        car1.setModelOfCar("360 Modena");
        car1.setYearOfCarManufacture(1999);
        car1.setColourOfCar("Red");

        Motorbike motorbike1 = new Motorbike("Kawasaki", "Green", 2003);

        car1.info();
        System.out.println("Разница между заданным годом и годом выпуска: " + car1.yearDifference(2020));
        motorbike1.info();
        System.out.println("Разница между заданным годом и годом выпуска: " + motorbike1.yearDifference(2020));
    }
}
