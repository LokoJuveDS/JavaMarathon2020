package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (!(a >= b)) {
            //первый инкремент опять задаю вручную, присваиваю временной переменной temp, чтобы не изменять значение a и b
            int temp = a + 1;
            while (temp < b) {
                if (!(temp % 10 == 0) && (temp % 5 == 0)) {
                    System.out.print(temp + " ");
                }
                temp++;
            }
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}
