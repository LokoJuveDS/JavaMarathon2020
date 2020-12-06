package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2000, 70, 183500);
        Airplane airplane2 = new Airplane("Туполев", 2005, 48, 102000);
        airplane1.info();
        airplane2.info();
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}