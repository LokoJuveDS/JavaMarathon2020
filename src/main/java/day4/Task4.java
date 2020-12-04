package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }

        // макмисальная сумма у группы чисел
        int maxSumOfGroupNumbers = 0;
        // временная переменная суммы группы чисел
        int tempSum;
        // индекс первого элемента группы чисел с максимальной суммой
        int indexOfFirstElementOfGroupWithMaxSum = 0;
        // задаваемое количество элементов в группе для сравнения сумм
        Scanner scanner = new Scanner(System.in);
        // можно поставить защиту на ввод, и на количество элементов в группе, чтобы не больше длины массива было
        System.out.println("Введите количество элементов в группе от 1 до 100:");
        int groupOFNumbers = scanner.nextInt();


        for (int i = 0; i < array.length - (groupOFNumbers - 1); i++) {

            tempSum = 0;
            // изначально делал так, но прочитал комментарий Наиля, и переделал по любое кол-во элементов в группе
            // tempSum = array[i] + array[i + 1] + array[i + 2];
            // бегаем по указанной группе чисел и считаем их сумму
            for (int j = i; j < i + groupOFNumbers; j++) {
                tempSum += array[j];
            }

            if (tempSum > maxSumOfGroupNumbers) {
                maxSumOfGroupNumbers = tempSum;
                indexOfFirstElementOfGroupWithMaxSum = i;
            }
        }

        System.out.println("Максимальная сумма группы из " + groupOFNumbers + " чисел: " + maxSumOfGroupNumbers);
        System.out.println("Индекс первого элемента группы из " + groupOFNumbers + " чисел с максимальной суммой: " + indexOfFirstElementOfGroupWithMaxSum);

    }
}
