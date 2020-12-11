package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("AUDI");
        stringList.add("Porsche");
        stringList.add("Ferrari");
        stringList.add("Renault");
        stringList.add("Jaguar");

        System.out.println(stringList);

        stringList.add(2, "Jeep");

        stringList.remove(0);

        stringList.forEach(System.out::println);
    }
}
