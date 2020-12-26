package BATTLESHIP.data;

import java.util.Arrays;
import java.util.HashSet;

public class ThreeDeckShip extends Ships {

    public ThreeDeckShip() {
        health = 3;
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
            if (coordinatesXY.length != 3) {
                throw new IllegalArgumentException("Количество координат для 3-х палубного должно быть 3:");
            }
            setCoordinatesX(coordinatesXY);
            setCoordinatesY(coordinatesXY);
            int[] tempCoordinatesX = Arrays.copyOf(coordinatesX, coordinatesX.length);
            int[] tempCoordinatesY = Arrays.copyOf(coordinatesY, coordinatesY.length);
            Arrays.sort(tempCoordinatesX);
            Arrays.sort(tempCoordinatesY);
            if (tempCoordinatesX[2] == tempCoordinatesX[0]) {
                if (!Arrays.stream(tempCoordinatesY).allMatch(new HashSet<>()::add) || Arrays.stream(tempCoordinatesY).sum() != (3 + 3 * tempCoordinatesY[0])) {
                    throw new IllegalArgumentException("Не валидный корабль. Расстановка не линейна.");
                }
            } else if (tempCoordinatesY[2] == tempCoordinatesY[0]) {
                if (!Arrays.stream(tempCoordinatesX).allMatch(new HashSet<>()::add) || Arrays.stream(tempCoordinatesX).sum() != (3 + 3 * tempCoordinatesX[0])) {
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
