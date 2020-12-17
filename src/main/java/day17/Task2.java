package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] gameKramnikKasparov2000 = new ChessPiece[8][8];
        gameKramnikKasparov2000[0][0] = ChessPiece.ROOK_BLACK;
        gameKramnikKasparov2000[0][1] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[0][2] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[0][3] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[0][4] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[0][5] = ChessPiece.ROOK_BLACK;
        gameKramnikKasparov2000[0][6] = ChessPiece.KING_BLACK;
        gameKramnikKasparov2000[0][7] = ChessPiece.EMPTY;

        gameKramnikKasparov2000[1][0] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[1][1] = ChessPiece.ROOK_WHITE;
        gameKramnikKasparov2000[1][2] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[1][3] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[1][4] = ChessPiece.PAWN_BLACK;
        gameKramnikKasparov2000[1][5] = ChessPiece.PAWN_BLACK;
        gameKramnikKasparov2000[1][6] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[1][7] = ChessPiece.PAWN_BLACK;

        gameKramnikKasparov2000[2][0] = ChessPiece.PAWN_BLACK;
        gameKramnikKasparov2000[2][1] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[2][2] = ChessPiece.KNIGHT_BLACK;
        gameKramnikKasparov2000[2][3] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[2][4] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[2][5] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[2][6] = ChessPiece.PAWN_BLACK;
        gameKramnikKasparov2000[2][7] = ChessPiece.EMPTY;

        gameKramnikKasparov2000[3][0] = ChessPiece.QUEEN_BLACK;
        gameKramnikKasparov2000[3][1] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[3][3] = ChessPiece.BISHOP_WHITE;
        gameKramnikKasparov2000[3][2] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[3][4] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[3][5] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[3][6] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[3][7] = ChessPiece.EMPTY;

        gameKramnikKasparov2000[4][0] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[4][1] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[4][2] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[4][3] = ChessPiece.BISHOP_BLACK;
        gameKramnikKasparov2000[4][4] = ChessPiece.PAWN_WHITE;
        gameKramnikKasparov2000[4][5] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[4][6] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[4][7] = ChessPiece.EMPTY;

        gameKramnikKasparov2000[5][0] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[5][1] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[5][2] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[5][3] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[5][4] = ChessPiece.BISHOP_WHITE;
        gameKramnikKasparov2000[5][5] = ChessPiece.PAWN_WHITE;
        gameKramnikKasparov2000[5][6] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[5][7] = ChessPiece.EMPTY;

        gameKramnikKasparov2000[6][0] = ChessPiece.PAWN_WHITE;
        gameKramnikKasparov2000[6][1] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[6][2] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[6][3] = ChessPiece.QUEEN_WHITE;
        gameKramnikKasparov2000[6][4] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[6][5] = ChessPiece.PAWN_WHITE;
        gameKramnikKasparov2000[6][6] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[6][7] = ChessPiece.PAWN_WHITE;

        gameKramnikKasparov2000[7][0] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[7][1] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[7][2] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[7][3] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[7][4] = ChessPiece.EMPTY;
        gameKramnikKasparov2000[7][5] = ChessPiece.ROOK_WHITE;
        gameKramnikKasparov2000[7][6] = ChessPiece.KING_WHITE;
        gameKramnikKasparov2000[7][7] = ChessPiece.EMPTY;

        ChessBoard chessBoard = new ChessBoard(gameKramnikKasparov2000);
        chessBoard.print();
    }
}
