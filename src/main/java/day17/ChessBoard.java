package day17;

import java.util.Arrays;

public class ChessBoard {

    private ChessPiece[][] myArray = new ChessPiece[0][0];

    public ChessBoard(ChessPiece[][] chessPieces) {
        myArray = chessPieces;
    }

    public void print() {
        for (ChessPiece[] chessPieces : myArray) {
            for (ChessPiece chessPiece : chessPieces) {
                System.out.print(chessPiece.getView());
            }
            System.out.println();
        }
    }
}
