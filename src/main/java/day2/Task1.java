package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scannerNumberOfFloors = new Scanner(System.in);
        //можно добавить небольшую проверку на вводимый формат
        if (!scannerNumberOfFloors.hasNextInt()) {
            System.out.println("Вы ввели неправильный формат количества этажей.\nВведите целое число.");
        } else {
            int numberOfFloors = scannerNumberOfFloors.nextInt();
            if (numberOfFloors >= 1 && numberOfFloors <= 4) {
                System.out.println("Малоэтажный дом");
            } else if (numberOfFloors >= 5 && numberOfFloors <= 8) {
                System.out.println("Среднеэтажный дом");
            } else if (numberOfFloors >= 9) {
                System.out.println("Многоэтажный дом");
            } else {
                System.out.println("Ошибка ввода");
            }
        }
    }
}
