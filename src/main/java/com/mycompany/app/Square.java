package com.mycompany.app;

public class Square {

    private Position position;

    private Piece piece;

    public Square(Position pos) {
        this.position = pos;
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return this.piece;
    }
}
