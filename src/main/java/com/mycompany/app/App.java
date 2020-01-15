package com.mycompany.app;

import java.util.function.BiConsumer;

public class App 
{
    public static void main( String[] args )
    {
        Game game = new Game();
        game.init();

        Board board = game.getBoard();
        game.getBoard().getSquares().forEach(new BiConsumer<Position, Piece>() {
            @Override
            public void accept(Position position, Piece piece) {
                System.out.println(position + " " + piece);
            }
        });
    }
}
