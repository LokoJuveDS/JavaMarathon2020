package day2;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scannerX = new Scanner(System.in);
//        scannerX.useLocale(Locale.ENGLISH);
        double x = scannerX.nextDouble();
        double y;

        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
            System.out.println(y);
        } else if (x > -3 && x < 5) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
            System.out.println(y);
        } else {
            y = 420;
            System.out.println(y);
        }
        // тест-то прошёл, но объясните, пожалуйста баг с вводом double через точку и через запятую
    }
}
