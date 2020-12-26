package BATTLESHIP;

import BATTLESHIP.data.Player;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя игрока номер 1");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Введите имя игрока номер 2");
        Player player2 = new Player(scanner.nextLine());

        System.out.println("Расстановка кораблей. Начинает игрок " + player1.getName());
        player1.setShips();
//
////        clearScreen();
//
        System.out.println("Расстановка кораблей. Начинает игрок " + player2.getName());
        player2.setShips();

        playGame(player1, player2);
    }

    public static void playGame(Player player1, Player player2) {
        Random random = new Random();
        int whoStart = (random.nextInt(2) + 1);
        Player firstPlayer;
        Player secondPlayer;
        if (whoStart == 1) {
            firstPlayer = player1;
            secondPlayer = player2;
        } else {
            firstPlayer = player2;
            secondPlayer = player1;
        }

        while (true) {
            firstPlayer.shoot(secondPlayer);
            if (secondPlayer.getCounterOfLiveShips() == 0) {
                secondPlayer.printGrid(secondPlayer.getGrid());
                break;
            }
            secondPlayer.shoot(firstPlayer);
            if (firstPlayer.getCounterOfLiveShips() == 0) {
                firstPlayer.printGrid(firstPlayer.getGrid());
                break;
            }
        }
    }

//    public static void clearScreen() {
//        System.out.println("Enter для следующего хода");
//        String wait = new Scanner(System.in).nextLine();
//        if (wait.equals("")) {
//            System.out.println("ABC");
//            System.out.print("\033[H\033[2J");
//            System.out.flush();
//            System.out.println("BCD");
//            System.out.flush();
//        }
//    }

}
