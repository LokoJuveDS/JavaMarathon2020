package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // кажется при double не выбрасывается ArithmeticException, а либо Infinity, либо NaN
        // поэтому try catch на 0 нет смысла, лучше просто break, чтобы и по условию, и по тестам прошло
        while (true) {
            try {
                System.out.println("Введите делимое:");
                double dividend = scanner.nextDouble();
                System.out.println("Введите делитель:");
                double divisor = scanner.nextDouble();
                //только из-за условия добавил break, лучше было бы выбросить исключение тоже, как и на текст сейчас
                if (divisor == 0) {
                    break;
                }
                double division = dividend / divisor;
                System.out.println("Результат: " + division);
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Введите два целых числа через пробел");
                scanner.nextLine();
            }
        }
        // всё работает, тест из-за дополнительных sout не проходит, если это важно, могу убрать
    }
}
