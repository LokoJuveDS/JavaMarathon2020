package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File fileOutput1 = new File("file1.txt");
        File fileOutput2 = new File("file2.txt");
        Random random = new Random();

        try {
            PrintWriter pwOut1 = new PrintWriter(fileOutput1);
            PrintWriter pwOut2 = new PrintWriter(fileOutput2);
            int number;
            double sum = 0;
            int counter = 0;
            for (int i = 0; i < 1000; i++) {
                number = random.nextInt(100);
                pwOut1.print(number + " ");
                if (counter < 20) {
                    sum += number;
                    counter++;
                } else {
                    pwOut2.print((sum / counter) + " ");
                    counter = 0;
                }
            }
            pwOut1.close();
            pwOut2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        printResult(fileOutput2);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbersString = line.split(" ");
                double sum = 0;
                for (String number : numbersString) {
                    sum += Double.parseDouble(number);
                }
                System.out.println((int) sum);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
