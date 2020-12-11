package day12.task4;

import day12.task4.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Михаил Горшенев");
        members1.add("Андрей Князев");
        MusicBand musicBand1 = new MusicBand("Король и Шут", 1988, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Виктор Цой");
        members2.add("Юрий Каспарян");
        MusicBand musicBand2 = new MusicBand("КИНО", 1982, members2);

        System.out.println("До слияния");
        MusicBand.printMembers(musicBand1);
        MusicBand.printMembers(musicBand2);
        System.out.println();

        System.out.println("После слияния");
        MusicBand.transferMembers(musicBand1, musicBand2);
        MusicBand.printMembers(musicBand1);
        MusicBand.printMembers(musicBand2);
    }
}
