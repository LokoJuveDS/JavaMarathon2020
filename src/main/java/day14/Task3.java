package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> personList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNext()) {
                sb.append(scanner.next()).append(" ");
            }
            scanner.close();
            String text = sb.toString();
            Pattern namePlusAge = Pattern.compile("(\\w+)(\\s+)(-?\\d+)");
            Matcher matcher = namePlusAge.matcher(text);
            while (matcher.find()) {
                if (Integer.parseInt(matcher.group(3)) < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                        return personList = new ArrayList<>();
                    }
                }
                personList.add(new Person((matcher.group(1)), (Integer.parseInt(matcher.group(3)))));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return personList;
    }
}
