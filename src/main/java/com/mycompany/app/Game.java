package com.mycompany.app;

import jdk.internal.jline.internal.Nullable;

public class Game {

    public static final String white = "white";
    public static final String black = "black";

    private Player player1;

    private Player player2;

    private Board board;

    public void init() {
        this.player1 = new Player(white);
        this.player2  = new Player(black);
        this.board = new Board();
        this.board.init();


    }

    public @Nullable Player getPlayer1() {
        return this.player1;
    }

    public @Nullable Player getPlayer2() {
        return this.player2;
    }

    public @Nullable Board getBoard() {
        return this.board;
    }
}
