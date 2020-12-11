package day12.task3;

import day12.task3.MusicBand.*;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Король и Шут", 1988);
        MusicBand musicBand2 = new MusicBand("КИНО", 1982);
        MusicBand musicBand3 = new MusicBand("Imagine Dragons", 2008);
        MusicBand musicBand4 = new MusicBand("Торба-на-Круче", 1998);
        MusicBand musicBand5 = new MusicBand("Потомучто", 2010);
        MusicBand musicBand6 = new MusicBand("Вася Обломов", 2010);
        MusicBand musicBand7 = new MusicBand("Йорш", 2003);
        MusicBand musicBand8 = new MusicBand("Нейромонах Феофан", 2009);

        List<MusicBand> bandList = new ArrayList<>();

        bandList.add(musicBand1);
        bandList.add(musicBand2);
        bandList.add(musicBand3);
        bandList.add(musicBand4);
        bandList.add(musicBand5);
        bandList.add(musicBand6);
        bandList.add(musicBand7);
        bandList.add(musicBand8);

        bandList.forEach(System.out::println);
        System.out.println();

        Collections.shuffle(bandList);
        bandList.forEach(System.out::println);
        System.out.println();

        // toString тоже переписан, но мне не нравится что он запятые ставит между объектами
        // System.out.println(groupsAfter2000(bandList));
        groupsAfter2000(bandList).forEach(System.out::println);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000)
                groupsAfter2000.add(band);
        }
        return groupsAfter2000;
    }
}
