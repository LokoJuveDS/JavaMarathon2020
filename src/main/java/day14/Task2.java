package day14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        //судя по условию, надо делать метод без параметра, но отталкиваясь от первого задания и Теста, видимо с параметром
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> stringList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            // просто решение через чтение идеального файла заданного по строкам и отбора по возрасту не захотел
            // я решил поработать с файлом, в котором может быть написано с ошибками
            // или будет ещё что-то другое между Именем - возрастом, используя pattern и matcher
            // понимаю, что единичное приклеивание делается через sb под капотом, но вручную решил создать sb
            StringBuilder sb = new StringBuilder();
            // склеиваю в один файл стринг
            while (scanner.hasNext()) {
                sb.append(scanner.next()).append(" ");
            }
            scanner.close();
            String text = sb.toString();
            // рассмотрел варианты
            // 1) между именем и возрастом если только пробелы в любом количестве, то валидно
            // 2) между именем и возрастом если любой символ (не цифры, не буквы), то не валидно
            // 3) если минус стоит непосредственно примыкая к числу, то оно отрицательное,и выбрасывается исключение
            // понимаю, что можно измываться над паттерном сколь угодно ещё, просто привёл мини пример
            Pattern namePlusAge = Pattern.compile("(\\w+)(\\s+)(-?\\d+)");
            Matcher matcher = namePlusAge.matcher(text);
            // пока матчер true
            while (matcher.find()) {
                // то проверяем Группу с числом на отрицательность и возвращаем пустой массив (или null)
                if (Integer.parseInt(matcher.group(3)) < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                        return stringList = new ArrayList<>();
                    }
                }
                // если возраст положительный, до добавляем в список элемент
                stringList.add(matcher.group(1) + " " + matcher.group(3));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return stringList;
    }
}
