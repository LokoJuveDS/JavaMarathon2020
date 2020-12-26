package BATTLESHIP.data;

import java.util.Arrays;
import java.util.HashSet;

public class FourDeckShip extends Ships {

    public FourDeckShip() {
        health = 4;
        coordinatesXY = new String[]{};
        coordinatesX = new int[]{};
        coordinatesY = new int[]{};
    }

    @Override
    public int[] setCoordinatesX(String[] coordinatesXY) {
        return super.setCoordinatesX(coordinatesXY);
    }

    @Override
    public int[] setCoordinatesY(String[] coordinatesXY) {
        return super.setCoordinatesY(coordinatesXY);
    }

    @Override
    public void setCoordinatesXY() {
        super.setCoordinatesXY();
        try {
            if (coordinatesXY.length != health) {
                throw new IllegalArgumentException("Количество координат для 4-х палубного должно быть 4:");
            }
            setCoordinatesX(coordinatesXY);
            setCoordinatesY(coordinatesXY);
            int[] tempCoordinatesX = Arrays.copyOf(coordinatesX, coordinatesX.length);
            int[] tempCoordinatesY = Arrays.copyOf(coordinatesY, coordinatesY.length);
            Arrays.sort(tempCoordinatesX);
            Arrays.sort(tempCoordinatesY);
            if (tempCoordinatesX[3] == tempCoordinatesX[0]) {
                if (!Arrays.stream(tempCoordinatesY).allMatch(new HashSet<>()::add) || Arrays.stream(tempCoordinatesY).sum() != (6 + 4 * tempCoordinatesY[0])) {
                    throw new IllegalArgumentException("Не валидный корабль. Расстановка не линейна.");
                }
            } else if (tempCoordinatesY[3] == tempCoordinatesY[0]) {
                if (!Arrays.stream(tempCoordinatesX).allMatch(new HashSet<>()::add) || Arrays.stream(tempCoordinatesX).sum() != (6 + 4 * tempCoordinatesX[0])) {
                    throw new IllegalArgumentException("Не валидный корабль. Расстановка не линейна.");
                }
            } else {
                throw new IllegalArgumentException("Не валидный корабль. Расстановка не линейна.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            setCoordinatesXY();
        }
    }

    @Override
    public String[] getCoordinatesXY() {
        return this.coordinatesXY;
    }
}
