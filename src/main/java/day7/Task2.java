package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random randomStamina = new Random();

        Player player1 = new Player((randomStamina.nextInt(11) + 90));
        Player player2 = new Player((randomStamina.nextInt(11) + 90));
        Player player3 = new Player((randomStamina.nextInt(11) + 90));
        Player player4 = new Player((randomStamina.nextInt(11) + 90));
        Player player5 = new Player((randomStamina.nextInt(11) + 90));
        Player player6 = new Player((randomStamina.nextInt(11) + 90));
        Player.info();
    }
}
