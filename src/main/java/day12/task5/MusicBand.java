package day12.task5;

import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Группа = " + name + ", год основания = " + year + ", участники группы = " + members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.getMembers().addAll(band1.getMembers());
        band1.getMembers().clear();
    }

    public static void printMembers(MusicBand band) {
        System.out.println("Состав группы:");
        List<MusicArtist> members = band.getMembers();
        for (MusicArtist member : members) {
            System.out.println(member);
        }
    }
}
