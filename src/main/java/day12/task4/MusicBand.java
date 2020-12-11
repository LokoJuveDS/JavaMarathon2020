package day12.task4;

import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
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

    public List<String> getMembers() {
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
        List<String> members = band.getMembers();
        for (String member : members) {
            System.out.println(member);
        }
    }
}
