package com.mycompany.app;

public class Piece {

    private String color;

    public Piece(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "color='" + color + '\'' +
                '}';
    }
}
