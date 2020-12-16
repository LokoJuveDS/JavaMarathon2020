package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileInput = new File("src/main/resources/shoes.csv");
        File fileOutput = new File("src/main/resources/missing_shoes.txt");
        try {
            Scanner scanner = new Scanner(fileInput);
            PrintWriter printWriter = new PrintWriter(fileOutput);
            printWriter.println("название, размер, количество");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] infoAboutShoe = line.split(";");
                if (Integer.parseInt(infoAboutShoe[2]) == 0) {
                    printWriter.println(line.replaceAll(";", ", "));
                }
            }
            scanner.close();
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
