package com.mycompany.app;

public class App
{
    public static void main( String[] args )
    {
        Game game = new Game();

        game.getBoard().getSquares().forEach(
                (position, piece) -> System.out.println(position + " " + piece)
        );
    }
}
