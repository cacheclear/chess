package com.mycompany.app;

import com.mycompany.app.piece.*;
import java.util.HashMap;

public class Board {

    public static final String a = "a";
    public static final String b = "b";
    public static final String c = "c";
    public static final String d = "d";
    public static final String e = "e";
    public static final String f = "f";
    public static final String g = "g";
    public static final String h = "h";
    
    public HashMap<Position, Piece> squares;

    public void init() {

        squares = new HashMap<Position, Piece>();
        String[] horizontalIdentifiers = {a, b, c, d, e, f, g, h};
        int[] verticalIdentifiers = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int y : verticalIdentifiers){
            for (String x : horizontalIdentifiers) {
                squares.put(new Position(x, y), null);
            }
        }

        squares.put(new Position(a ,1), new Rook(Game.white));
        squares.put(new Position(b ,1), new Knight(Game.white));
        squares.put(new Position(c ,1), new Bishop(Game.white));
        squares.put(new Position(d ,1), new Queen(Game.white));
        squares.put(new Position(e ,1), new King(Game.white));
        squares.put(new Position(f ,1), new Bishop(Game.white));
        squares.put(new Position(g ,1), new Knight(Game.white));
        squares.put(new Position(h ,1), new Rook(Game.white));
        squares.put(new Position(a ,2), new Pawn(Game.white));
        squares.put(new Position(b ,2), new Pawn(Game.white));
        squares.put(new Position(c ,2), new Pawn(Game.white));
        squares.put(new Position(d ,2), new Pawn(Game.white));
        squares.put(new Position(e ,2), new Pawn(Game.white));
        squares.put(new Position(f ,2), new Pawn(Game.white));
        squares.put(new Position(g ,2), new Pawn(Game.white));
        squares.put(new Position(h ,2), new Pawn(Game.white));

        squares.put(new Position(a ,7), new Pawn(Game.black));
        squares.put(new Position(b ,7), new Pawn(Game.black));
        squares.put(new Position(c ,7), new Pawn(Game.black));
        squares.put(new Position(d ,7), new Pawn(Game.black));
        squares.put(new Position(e ,7), new Pawn(Game.black));
        squares.put(new Position(f ,7), new Pawn(Game.black));
        squares.put(new Position(g ,7), new Pawn(Game.black));
        squares.put(new Position(h ,7), new Pawn(Game.black));
        squares.put(new Position(a ,8), new Rook(Game.black));
        squares.put(new Position(b ,8), new Knight(Game.black));
        squares.put(new Position(c ,8), new Bishop(Game.black));
        squares.put(new Position(d ,8), new Queen(Game.black));
        squares.put(new Position(e ,8), new King(Game.black));
        squares.put(new Position(f ,8), new Bishop(Game.black));
        squares.put(new Position(g ,8), new Knight(Game.black));
        squares.put(new Position(h ,8), new Rook(Game.black));
    }

    public HashMap<Position, Piece> getSquares() {

        return this.squares;
    }
}
