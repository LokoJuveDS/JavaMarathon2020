package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scannerCity = new Scanner(System.in);

        // 1-ый вариант. Тесты прошли.
        //можно называть loop, чтобы потом использовать break на определённом loop-e
        outerloop:
        while (true) {
            String city = scannerCity.next();
            switch (city) {
                // вынесем проверку на Stop вверх, чтобы сразу проверять на выход из цикла,и не проверять все значения
                // так как лучше выставлять case от самых популярных, до менее популярных значений
                case "Stop":
                    break outerloop;

                // с JAVA 7 String, но ещё лучше бы с enum
                // можно перечислением отдельно как в обучении, так визуально понятнее
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                // можно в строку через запятую, так меньше кода, но сбивается ctrl+alt+L
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                // можно просто через запятую значения
                case "Ливерпуль", "Манчестер", "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин", "Мюнхен", "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
        }
//        // 2-ой вариант. Тесты прошли.
//        // c JAVA 12 кажется можно лямбду, но вводим ещё одну переменную
//        while (true) {
//            String city = scannerCity.next();
//            //кажется в таком случае break не предусматривается, придется создать проверку if
//            if (city.equals("Stop")) {
//                break;
//            }
//            String country = switch (city) {
//                case "Москва", "Владивосток", "Ростов" -> "Россия";
//                case "Рим", "Милан", "Турин" -> "Италия";
//                case "Ливерпуль", "Манчестер", "Лондон" -> "Англия";
//                case "Берлин", "Мюнхен", "Кёльн" -> "Германия";
//                default -> "Неизвестная страна";
//            };
//            System.out.println(country);
//        }
    }
}