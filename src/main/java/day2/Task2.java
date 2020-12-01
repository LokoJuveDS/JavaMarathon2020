package day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // защитил от неправильного ввода, в конце открывается nextLine и ждём опять два числа
        while (true) {
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (!(a >= b)) {
                    //в условии сказано a и b не учитывать
                    for (int i = a + 1; i < b; i++) {
                        //лучше проверять сразу деление на 10, чтобы исключить лишние проверки на 5, т.к. при первом же false в if c &&, цикл пойдет дальше
                        if (!(i % 10 == 0) && (i % 5 == 0)) {
                            System.out.print(i + " ");
                        }
                    }
                } else {
                    System.out.println("Некорректный ввод, первое число должно быть строго меньше второго");
                }

                break;
            } catch (Exception e) {
                System.out.println("Введите два целых числа через пробел");
                scanner.nextLine();
            }
        }


    }
}
