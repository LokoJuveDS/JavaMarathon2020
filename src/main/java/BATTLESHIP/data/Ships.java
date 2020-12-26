package BATTLESHIP.data;

import java.util.List;
import java.util.Scanner;

public abstract class Ships {
    protected int health;
    private String stringCoordinates;
    protected String[] coordinatesXY;
    protected int[] coordinatesX;
    protected int[] coordinatesY;

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String readStringCoordinates() {
        Scanner scanner = new Scanner(System.in);
        stringCoordinates = scanner.nextLine();

        return stringCoordinates;
    }

    public void setCoordinatesXY() {
        String[] temp = readStringCoordinates().split(";");
        try {
            for (String s : temp) {
                if (s.split(",").length != 2) {
                    throw new IllegalArgumentException("Количество координат одной точки должно быть 2");
                } else if (Integer.parseInt(s.split(",")[0]) < 0 || Integer.parseInt(s.split(",")[0]) > 9) {
                    throw new IllegalArgumentException("Некорректный ввод координаты Х");
                } else if (Integer.parseInt(s.split(",")[1]) < 0 || Integer.parseInt(s.split(",")[1]) > 9) {
                    throw new IllegalArgumentException("Некорректный ввод координат Y");
                } else {
                    coordinatesXY = temp;
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            setCoordinatesXY();
        }
    }

    public String[] getCoordinatesXY() {
        return coordinatesXY;
    }


    public int[] setCoordinatesX(String[] coordinatesXY) {
        coordinatesX = new int[coordinatesXY.length];
        for (int i = 0; i < coordinatesXY.length; i++) {
            coordinatesX[i] = Integer.parseInt(coordinatesXY[i].split(",")[0]);
        }
        return coordinatesX;
    }

    public int[] setCoordinatesY(String[] coordinatesXY) {
        coordinatesY = new int[coordinatesXY.length];
        for (int i = 0; i < coordinatesXY.length; i++) {
            coordinatesY[i] = Integer.parseInt(coordinatesXY[i].split(",")[1]);
        }
        return coordinatesY;
    }

    public void setShipsToTheGrid(String[][] grid, List<Ships> allShipsList) {
        int tempX;
        int tempY;
        //"\uD83D\uDEE5";
        String shipView = "-";
        //"\uD83D\uDFE6";
        String halo = "*";
        try {
            for (int i = 0; i < this.getCoordinatesXY().length; i++) {
                tempX = Integer.parseInt(this.getCoordinatesXY()[i].split(",")[0]);
                tempY = Integer.parseInt(this.getCoordinatesXY()[i].split(",")[1]);
                if (grid[tempX][tempY].equals(shipView)) {
                    throw new IllegalArgumentException("Нельзя установить два разных корабля на одно место");
                } else if (grid[tempX][tempY].equals(halo)) {
                    throw new IllegalArgumentException("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть других кораблей (ореол корабля)");
                }
            }
            for (int i = 0; i < this.getCoordinatesXY().length; i++) {
                tempX = Integer.parseInt(this.getCoordinatesXY()[i].split(",")[0]);
                tempY = Integer.parseInt(this.getCoordinatesXY()[i].split(",")[1]);
                grid[tempX][tempY] = shipView;
            }
            allShipsList.add(this);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            this.setCoordinatesXY();
        }
        int leftmost_X_CoordinateOfTheShip = Integer.parseInt(this.getCoordinatesXY()[0].split(",")[0]);
        int rightmost_X_CoordinateOfTheShip = Integer.parseInt(this.getCoordinatesXY()[this.coordinatesXY.length - 1].split(",")[0]);
        int leftmost_Y_CoordinateOfTheShip = Integer.parseInt(this.getCoordinatesXY()[0].split(",")[1]);
        int rightmost_Y_CoordinateOfTheShip = Integer.parseInt(this.getCoordinatesXY()[this.coordinatesXY.length - 1].split(",")[1]);

        for (int i = leftmost_X_CoordinateOfTheShip - 1; i <= rightmost_X_CoordinateOfTheShip + 1; i++) {
            for (int j = leftmost_Y_CoordinateOfTheShip - 1; j <= rightmost_Y_CoordinateOfTheShip + 1; j++) {
                try {
                    if (!grid[i][j].equals(shipView)) {
                        grid[i][j] = halo;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {

                }
            }
        }
    }
}
