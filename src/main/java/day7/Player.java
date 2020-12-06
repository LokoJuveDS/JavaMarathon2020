package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina > 0) {
            if (stamina != 1) {
                stamina--;
            } else {
                stamina--;
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            switch (6 - countPlayers) {
                case 1 -> System.out.println("Команды неполные. На поле еще есть 1 свободное место");
                case 2, 3, 4 -> System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных места");
                case 5, 6 -> System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
            }
        } else {
            System.out.println("На поле нет свободных мест");
        }

    }
}
