package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            double average = 0;
            int counter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbersString = line.split(" ");
                for (String number : numbersString) {
                    sum += Integer.parseInt(number);
                    counter++;
                }
            }
            average = sum / counter;
            System.out.printf(average + " --> " + "%.3f", average);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

