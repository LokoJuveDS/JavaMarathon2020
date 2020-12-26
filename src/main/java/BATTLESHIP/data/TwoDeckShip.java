package BATTLESHIP.data;

import java.util.Arrays;
import java.util.HashSet;

public class TwoDeckShip extends Ships {

    public TwoDeckShip() {
        health = 2;
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
            if (coordinatesXY.length != 2) {
                throw new IllegalArgumentException("Количество координат для 2-х палубного должно быть 2:");
            }
            setCoordinatesX(coordinatesXY);
            setCoordinatesY(coordinatesXY);
            int[] tempCoordinatesX = Arrays.copyOf(coordinatesX, coordinatesX.length);
            int[] tempCoordinatesY = Arrays.copyOf(coordinatesY, coordinatesY.length);
            Arrays.sort(tempCoordinatesX);
            Arrays.sort(tempCoordinatesY);
            if (tempCoordinatesX[1] == tempCoordinatesX[0]) {
                if (!Arrays.stream(tempCoordinatesY).allMatch(new HashSet<>()::add) || Arrays.stream(tempCoordinatesY).sum() != (1 + 2 * tempCoordinatesY[0])) {
                    throw new IllegalArgumentException("Не валидный корабль. Расстановка не линейна.");
                }
            } else if (tempCoordinatesY[1] == tempCoordinatesY[0]) {
                if (!Arrays.stream(tempCoordinatesX).allMatch(new HashSet<>()::add) || Arrays.stream(tempCoordinatesX).sum() != (1 + 2 * tempCoordinatesX[0])) {
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
