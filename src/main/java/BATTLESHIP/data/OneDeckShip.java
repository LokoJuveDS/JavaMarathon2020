package BATTLESHIP.data;

public class OneDeckShip extends Ships {

    public OneDeckShip() {
        health = 1;
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
            if (coordinatesXY.length != 1) {
                throw new IllegalArgumentException("Количество координат для 1 палубного должно быть 1:");
            }
//            setCoorinatesX(coordinatesXY);
//            setCoorinatesY(coordinatesXY);
//            int[] tempCoordinatesX = Arrays.copyOf(coordinatesX, coordinatesX.length);
//            int[] tempCoordinatesY = Arrays.copyOf(coordinatesY, coordinatesY.length);
//            Arrays.sort(tempCoordinatesX);
//            Arrays.sort(tempCoordinatesY);
//            if (tempCoordinatesX[1] == tempCoordinatesX[0]) {
//                if (!Arrays.stream(tempCoordinatesY).allMatch(new HashSet<>()::add) || Arrays.stream(tempCoordinatesY).sum() != (1 + 2 * tempCoordinatesY[0])) {
//                    throw new IllegalArgumentException("Не валидный корабль. Расстановка не линейна.");
//                }
//            } else if (tempCoordinatesY[1] == tempCoordinatesY[0]) {
//                if (!Arrays.stream(tempCoordinatesX).allMatch(new HashSet<>()::add) || Arrays.stream(tempCoordinatesX).sum() != (1 + 2 * tempCoordinatesX[0])) {
//                    throw new IllegalArgumentException("Не валидный корабль. Расстановка не линейна.");
//                }
//            } else {
//                throw new IllegalArgumentException("Не валидный корабль. Расстановка не линейна.");
//            }
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
