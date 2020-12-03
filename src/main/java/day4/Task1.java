package day4;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scannerArraySize = new Scanner(System.in);
        // вводится размер массива
        int arraySize = scannerArraySize.nextInt();
        // создается массив указанного размера
        int[] array = new int[arraySize];

        Random randomNumber = new Random();
        // заполнение массива псевдослучайными числами от 0 до 10, как в задании, 11 т.к. bound строгий
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(11);
        }

        System.out.println(Arrays.toString(array));
        int countOfNumberGreatThanEight = 0;
        int countOfNumbersEqualsOne = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sum = 0;
        // проверяется всё сразу в одном цикле, чтобы не бегать каждый раз
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                countOfNumberGreatThanEight++;
            }
            if (array[i] == 1) {
                countOfNumbersEqualsOne++;
            }
            if (array[i] % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            sum += array[i];

        }

        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + countOfNumberGreatThanEight);
        System.out.println("Количество чисел равных 1: " + countOfNumbersEqualsOne);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + oddNumbers);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
