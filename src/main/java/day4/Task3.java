package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        // создаём двумерный массив - матрицу
        int[][] matrix = new int[12][8];
        Random random = new Random();
        // проходимся по строкам (длина массива определяется по его первой размерности, то есть количество рядов)
//        for (int i = 0; i < matrix.length; i++) {
//            // проходимся по столбцам (если мы хотим узнать количество столбцов в ряду, тогда указываем ряд,
//            // а затем вычисляем у него количество столбцов)
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = random.nextInt(51);
//            }
//        }
        // максимальная сумма с которой мы будем сравнивать временную сумму в строке
        int maxSum = 0;
        // временная сумма в конкретной строке
        int tempSum;
        // меняющийся индекс строки с максимальной суммой элементов
        int indexOfMaxSumRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Индекс строки: " + i + " | ");

            tempSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                // перенёс сюда наполнение
                matrix[i][j] = random.nextInt(51);
                System.out.print(matrix[i][j] + " ");
                tempSum += matrix[i][j];
                if (tempSum > maxSum) {
                    maxSum = tempSum;
                    indexOfMaxSumRow = i;
                }
            }
            System.out.print(" | Сумма строки: " + tempSum);
            System.out.println();
        }
        System.out.println(indexOfMaxSumRow);
    }
}
