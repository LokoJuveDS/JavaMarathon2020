package day4;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001); // тоже специально до 10001, чтобы было строго от 0 до 10000
        }

        int maxNumberOfArray = array[0];
        int minNumberOfArray = array[0];
        int countOfNumbersEndsTen = 0;
        int sum = 0;

        // хотел узнать, что быстрее: посчитать всё в одном цикле, или разбить на 4 цикла отдельных
        // сделал 10 тестов, и как и думал, в одном цикле быстрее в несколько раз идёт рассчёт
        // конечно разница много от чего зависит, на моём ПК появилась разница только от 1 - 10 млн элементов
        // видимо напрямую зависит от количества пробегов циклов
//        long start = System.currentTimeMillis();

        for (int number : array) {
            if (number > maxNumberOfArray) {
                maxNumberOfArray = number;
            }
            if (number < minNumberOfArray) {
                minNumberOfArray = number;
            }
            if (number % 10 == 0) {
                countOfNumbersEndsTen++;
                sum += number;
            }
        }
//        for (int number : array) {
//            if (number > maxNumberOfArray) {
//                maxNumberOfArray = number;
//            }
//        }
//
//        for (int number : array) {
//            if (number < minNumberOfArray) {
//                minNumberOfArray = number;
//            }
//        }
//
//        for (int number : array) {
//            if (number % 10 == 0) {
//                countOfNumbersEndsTen++;
//            }
//        }
//        for (int number : array) {
//            if (number % 10 == 0) {
//                sum += number;
//            }
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        System.out.println("Максимальное число в массиве: " + maxNumberOfArray);
        System.out.println("Минимальное число в массиве: " + minNumberOfArray);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countOfNumbersEndsTen);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
