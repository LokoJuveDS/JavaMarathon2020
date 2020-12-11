package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Михаил Горшенев", 1973));
        members1.add(new MusicArtist("Андрей Князев", 1973));
        MusicBand musicBand1 = new MusicBand("Король и Шут", 1988, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Виктор Цой", 1962));
        members2.add(new MusicArtist("Юрий Каспарян", 1963));
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
