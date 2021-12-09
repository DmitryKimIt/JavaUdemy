package day17;

public enum ChessPiece {
    KING_WHITE(100, "\u2654"),
    QUEEN_WHITE(9, "\u2655"),
    ROOK_WHITE(5, "\u2656"),
    BISHOP_WHITE(3.5, "\u2657"),
    KNIGHT_WHITE(3, "\u2658"),
    PAWN_WHITE(1, "\u2659"),

    KING_BLACK(100, "\u265a"),
    QUEEN_BLACK(9, "\u265b"),
    ROOK_BLACK(5, "\u265c"),
    BISHOP_BLACK(3.5, "\u265d"),
    KNIGHT_BLACK(3, "\u265e"),
    PAWN_BLACK(1, "\u265f"),
    EMPTY(-1,"_");
    private double value;
    private String name;

    ChessPiece(double value, String name) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name;
    }
}
