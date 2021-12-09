package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chess = new ChessPiece[8];
        for (int i = 0; i < 8; i++) {
            if (i < 4)
                chess[i] = ChessPiece.PAWN_WHITE;
            else
                chess[i] = ChessPiece.ROOK_BLACK;
            System.out.print(chess[i]+" ");
        }
    }
}