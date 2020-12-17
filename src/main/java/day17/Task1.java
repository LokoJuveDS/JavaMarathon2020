package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPieces = new ChessPiece[8];
        chessPieces[0] = ChessPiece.PAWN_WHITE;
        chessPieces[1] = ChessPiece.PAWN_WHITE;
        chessPieces[2] = ChessPiece.PAWN_WHITE;
        chessPieces[3] = ChessPiece.PAWN_WHITE;
        chessPieces[4] = ChessPiece.ROOK_BLACK;
        chessPieces[5] = ChessPiece.ROOK_BLACK;
        chessPieces[6] = ChessPiece.ROOK_BLACK;
        chessPieces[7] = ChessPiece.ROOK_BLACK;

        for (ChessPiece chessPiece : chessPieces) {
            System.out.print(chessPiece.getView() + " ");
        }
    }
}