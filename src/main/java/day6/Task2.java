package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000, 70, 183500);
        airplane.info();
        airplane.setYear(2005);
        airplane.setLength(71);
        airplane.fillUp(100000);
        airplane.fillUp(25000);
        airplane.info();
    }
}

