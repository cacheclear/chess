package com.mycompany.app;

public class Game {

    public static final String white = "white";
    public static final String black = "black";

    private Player player1;

    private Player player2;

    private Board board;

    public Game() {
        this.player1 = new Player(white);
        this.player2 = new Player(black);
        this.board = new Board();
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public Board getBoard() {
        return this.board;
    }
}
