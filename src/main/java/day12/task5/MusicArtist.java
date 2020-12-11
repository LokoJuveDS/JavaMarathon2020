package day12.task5;

public class MusicArtist {
    private final String name;
    private final int yearOfBirth;

    public MusicArtist(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Имя музыканта " + name + ", год рождения музыканта = " + yearOfBirth;
    }
}
