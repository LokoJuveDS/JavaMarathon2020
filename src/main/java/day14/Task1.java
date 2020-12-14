package day14;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length != 10) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("Некорректный входной файл");
                    return;
                }
            }
            int[] numbers = new int[numbersString.length];
            int sum = 0;
            for (int i = 0; i < numbersString.length; i++) {
                numbers[i] = Integer.parseInt(numbersString[i]);
                sum += numbers[i];
            }
            // сделал сначала так, но тут создается переменная лишняя
//            int counter = 0;
//            for (String number : numbersString) {
//                numbers[counter] = Integer.parseInt(number);
//                sum += numbers[counter++];
//            }
            System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
