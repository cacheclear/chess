package com.mycompany.app;

import com.mycompany.app.piece.*;
import java.util.HashMap;

public class Board {

    public HashMap<Position, Piece> squares;

    public Board() {
        this.squares = new HashMap<Position, Piece>();
        this.initSquares(); 
        this.setPieces();
    }

    private void initSquares() {
        for(int y = 0; y <= 8; y++) {
            for(int x = 0; x <= 8; x++) {
                this.squares.put(new Position(x, y), null);
            }
        }
    }

    public void setPieces() {
        this.setWhitePieces();
        this.setBlackPieces();
    }

    private void setWhitePieces() {
        this.squares.put(new Position(1 ,1), new Rook(Game.white));
        this.squares.put(new Position(2 ,1), new Knight(Game.white));
        this.squares.put(new Position(3 ,1), new Bishop(Game.white));
        this.squares.put(new Position(4 ,1), new Queen(Game.white));
        this.squares.put(new Position(5 ,1), new King(Game.white));
        this.squares.put(new Position(6 ,1), new Bishop(Game.white));
        this.squares.put(new Position(7 ,1), new Knight(Game.white));
        this.squares.put(new Position(8 ,1), new Rook(Game.white));
        this.squares.put(new Position(1 ,2), new Pawn(Game.white));
        this.squares.put(new Position(2 ,2), new Pawn(Game.white));
        this.squares.put(new Position(3 ,2), new Pawn(Game.white));
        this.squares.put(new Position(4 ,2), new Pawn(Game.white));
        this.squares.put(new Position(5 ,2), new Pawn(Game.white));
        this.squares.put(new Position(6 ,2), new Pawn(Game.white));
        this.squares.put(new Position(7 ,2), new Pawn(Game.white));
        this.squares.put(new Position(8 ,2), new Pawn(Game.white));
    }

    private void setBlackPieces() {
        this.squares.put(new Position(1 ,7), new Pawn(Game.black));
        this.squares.put(new Position(2 ,7), new Pawn(Game.black));
        this.squares.put(new Position(3 ,7), new Pawn(Game.black));
        this.squares.put(new Position(4 ,7), new Pawn(Game.black));
        this.squares.put(new Position(5 ,7), new Pawn(Game.black));
        this.squares.put(new Position(6 ,7), new Pawn(Game.black));
        this.squares.put(new Position(7 ,7), new Pawn(Game.black));
        this.squares.put(new Position(8 ,7), new Pawn(Game.black));
        this.squares.put(new Position(1 ,8), new Rook(Game.black));
        this.squares.put(new Position(2 ,8), new Knight(Game.black));
        this.squares.put(new Position(3 ,8), new Bishop(Game.black));
        this.squares.put(new Position(4 ,8), new Queen(Game.black));
        this.squares.put(new Position(5 ,8), new King(Game.black));
        this.squares.put(new Position(6 ,8), new Bishop(Game.black));
        this.squares.put(new Position(7 ,8), new Knight(Game.black));
        this.squares.put(new Position(8 ,8), new Rook(Game.black));
    }

    public HashMap<Position, Piece> getSquares() {

        return this.squares;
    }
}
