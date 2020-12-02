package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // запускаем итерацию 5 раз
        for (int i = 0; i < 5; i++) {
            double dividend = scanner.nextDouble();
            double divisor = scanner.nextDouble();
            // если делитель оказался = 0, сообщаем об этом и через continue идём на следующую итерацию for
            if (divisor == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            double division = dividend / divisor;
            System.out.println(division);
        }
    }
}
