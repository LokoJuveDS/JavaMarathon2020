package BATTLESHIP.data;

import java.util.Arrays;

public class PlayGround {
    private final String[][] newGrid = new String[10][10];

    public String[][] createGrid() {
        for (String[] strings : newGrid) {
            Arrays.fill(strings, ".");
        }
        return newGrid;
    }
}
