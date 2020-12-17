package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chessGame = loadChessGame(new File("gameKramnikKasparov2000"));
        ChessBoard chessBoard = new ChessBoard(chessGame);
        chessBoard.print();
    }

    public static ChessPiece[][] loadChessGame(File file) {
        ChessPiece[][] chessGame = new ChessPiece[8][8];
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] stringChessGame = line.split(",");
                for (String lineInfo : stringChessGame) {
                    chessGame[Integer.parseInt(stringChessGame[0])][Integer.parseInt(stringChessGame[1])] = ChessPiece.valueOf(stringChessGame[2]);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл на найден");
        }
        return chessGame;
    }
}
