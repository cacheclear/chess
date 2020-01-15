package com.mycompany.app;

import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.core.Is.is;


public class GameTest {

    @Test
    public void testGameInitialization() {
        Game game = new Game();
        game.init();
        Player player1 = game.getPlayer1();
        Player player2 = game.getPlayer2();
        Board board = game.getBoard();

        Assert.assertThat(player1.getPiecesColor(), is("white"));
        Assert.assertThat(player2.getPiecesColor(), is("black"));



    }
}
