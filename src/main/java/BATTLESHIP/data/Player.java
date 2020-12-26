package BATTLESHIP.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private String[][] grid;
    private String[][] enemyGrid;
    private List<Ships> allShipsList = new ArrayList<>();
    private int counterOfLiveShips = 1;
    private PlayGround playGround = new PlayGround();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[][] getGrid() {
        return grid;
    }

    public String[][] getEnemyGrid() {
        return enemyGrid;
    }

    protected List<Ships> getAllShipsList() {
        return allShipsList;
    }

    public int getCounterOfLiveShips() {
        return counterOfLiveShips;
    }

    public void setCounterOfLiveShips(int counterOfLiveShips) {
        this.counterOfLiveShips = counterOfLiveShips;
    }

    public Player(String name) {
        this.name = name;
        this.grid = new PlayGround().createGrid();
        this.enemyGrid = new PlayGround().createGrid();
    }

    public void printGrid(String[][] grid) {
        System.out.println();
        for (String[] stringsG : grid) {
            for (String stringsV : stringsG) {
                System.out.print(stringsV);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void setShips() {
        System.out.println("Введите координаты четырёхпалубного корабля");
        FourDeckShip fourDeckShip = new FourDeckShip();
        fourDeckShip.setCoordinatesXY();
        fourDeckShip.setShipsToTheGrid(getGrid(), getAllShipsList());
//
//        for (int i = 0; i < 2; i++) {
//            System.out.println("Введите координаты " + (i + 1) + " трёхпалубного корабля");
//            ThreeDeckShip threeDeckShip = new ThreeDeckShip();
//            threeDeckShip.setCoordinatesXY();
//            threeDeckShip.setShipsToTheGrid(getGrid());
//        }
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Введите координаты " + (i + 1) + " двухпалубного корабля");
//            TwoDeckShip twoDeckShip = new TwoDeckShip();
//            twoDeckShip.setCoordinatesXY();
//            twoDeckShip.setShipsToTheGrid(getGrid());
//        }
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Введите координаты " + (i + 1) + " однопалубного корабля");
//            OneDeckShip oneDeckShip = new OneDeckShip();
//            oneDeckShip.setCoordinatesXY();
//            oneDeckShip.setShipsToTheGrid(getGrid());
//        }
    }

    public void shoot(Player player) {
        int tempX;
        int tempY;
        outer:
        while (true) {
            System.out.println("Ход игрока: " + this.getName());
            System.out.println("Поле соперника.");
            this.printGrid(getEnemyGrid());
            System.out.println("Введите координаты для выстрела в формате x,y:");
            Scanner scanner = new Scanner(System.in);
            String shootingCoordinate = scanner.nextLine();
            tempX = Integer.parseInt(shootingCoordinate.split(",")[0]);
            tempY = Integer.parseInt(shootingCoordinate.split(",")[1]);
//
            if (player.getGrid()[tempX][tempY].equals("-")) {
                for (int i = 0; i < this.getAllShipsList().size(); i++) {
//                    System.out.println(Arrays.toString(player.getAllShipsList().get(i).getCoordinatesXY()));
                    for (int j = 0; j < player.getAllShipsList().get(i).getCoordinatesXY().length; j++) {
                        if (Integer.parseInt(player.getAllShipsList().get(i).getCoordinatesXY()[j].split(",")[0]) == tempX && Integer.parseInt(player.getAllShipsList().get(i).getCoordinatesXY()[j].split(",")[1]) == tempY) {
                            enemyGrid[tempX][tempY] = "X";
                            player.getGrid()[tempX][tempY] = "?";
                            player.getAllShipsList().get(i).getCoordinatesXY()[j] = "-1,-1";
                            player.getAllShipsList().get(i).setHealth(player.getAllShipsList().get(i).getHealth() - 1);
                            if (player.getAllShipsList().get(i).getHealth() != 0) {
                                System.out.println("Попадание!");
                            } else {
                                System.out.println("Потопил!");
                                player.setCounterOfLiveShips(player.getCounterOfLiveShips() - 1);
                                if (player.getCounterOfLiveShips() == 0) {
                                    System.out.println("Игрок " + this.getName() + " победил!");
                                    break outer;
                                }
                            }
                        }
                    }
                }
            } else if (player.getGrid()[tempX][tempY].equals("?")) {
                System.out.println("Вы уже стреляли в эту клетку корабля! Переход хода.");
                break;
            } else {
                enemyGrid[tempX][tempY] = "*";
                System.out.println("Мимо! Переход хода.");
                break;
            }
        }
    }
}
