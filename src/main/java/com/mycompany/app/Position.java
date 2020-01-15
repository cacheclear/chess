package com.mycompany.app;

public class Position {

    public String x;

    public int y;

    public Position(String x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + " y: " + y;
    }
}
