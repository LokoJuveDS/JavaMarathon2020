package day7;

public class Airplane {
    private final String producer; // (изготовитель)
    private final int year; //(год выпуска)
    private final int length; //(длина)
    private final int weight; //(вес)
    private int fuel; //(количество топлива в баке)

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getLength() {
        return length;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() != airplane2.getLength()) {
            String answer = (airplane1.getLength() > airplane2.getLength()) ? "Первый самолет длиннее" : "Второй самолет длиннее";
            System.out.println(answer);
        } else {
            System.out.println("Длины самолетов равны");
        }
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
}
