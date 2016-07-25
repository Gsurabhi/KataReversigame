package com.bitwise.ReversiTest;

import com.bitwise.KataReversi.Board;
import com.bitwise.KataReversi.ReversiGame;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by surabhig on 7/22/2016.
 */
public class TestKatareversi
{
    ReversiGame game = new ReversiGame();

    @Test(expected = Board.BoardSizeNotPossibleException.class)
    public void itShouldHaveAppropriateBoardSize()
    {
        //given
        Board board= new Board(7,8);
        //when
        board.boardSize();
        //then

    }

    @Test
    public void itShouldCreateBoard()
    {
        //given
        Board board= new Board(5,3);
        //when
        board.createBoard();
        //then
        Assert.assertTrue(String.valueOf(true),true);

    }
    @Test
    public void shouldSuccessOnDirectionUpDownLeftRight() {
        //given
        String[][] input_array = new String[][]{
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "B", "W", "0", "0", "0"},
                {"0", "0", "0", "W", "B", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"}
        };

        String[][] output_array = new String[][]{
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "1", "0", "0", "0"},
                {"0", "0", "0", "B", "W", "1", "0", "0"},
                {"0", "0", "1", "W", "B", "0", "0", "0"},
                {"0", "0", "0", "1", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"}
        };
        //when
        //then
        assertTrue(String.valueOf(true), game.printLegalMoves(input_array,output_array));
    }

    @Test
    public void shouldSuccessOnDirectionAntiSlashUp() {
        //given
        String[][] input_array = new String[][]{
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "B", "W", "0", "0", "0"},
                {"0", "0", "0", "W", "B", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"}
        };



        String[][] output_array = new String[][]{
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "B", "W", "1", "0", "0"},
                {"0", "0", "0", "W", "W", "0", "0", "0"},
                {"0", "0", "0", "1", "0", "1", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"}
        };
        //when
        //then
        assertTrue(String.valueOf(true), game.printLegalMoves(input_array,output_array));

    }
    @Test
    public void shouldSuccessOnDirectionAntiSlashDown() {
        //given
        String[][] input_array = new String[][]{
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "W", "B", "0", "0", "0"},
                {"0", "0", "0", "W", "B", "0", "0", "0"},
                {"0", "0", "0", "W", "B", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"}
        };


        String[][] output_array = new String[][]{
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "1", "0", "0", "0", "0", "0"},
                {"0", "0", "1", "W", "B", "1", "0", "0"},
                {"0", "0", "1", "W", "B", "0", "0", "0"},
                {"0", "0", "1", "W", "B", "1", "0", "0"},
                {"0", "0", "1", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"}
        };
        //when
        //then
        assertTrue(String.valueOf(true), game.printLegalMoves(input_array, output_array));
    }
    @Test
    public void shouldSuccessOnTestAntislashDown() {
        //given
        String[][] input_array = new String[][]{
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "W", "B", "0", "0", "0"},
                {"0", "0", "0", "W", "B", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"}
        };


        String[][] output_array = new String[][]{
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "1", "0", "0", "0", "0", "0"},
                {"0", "0", "1", "W", "B", "1", "0", "0"},
                {"0", "0", "1", "W", "B", "0", "0", "0"},
                {"0", "0", "1", "0", "0", "1", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"}
        };


        //when
        //then
        assertTrue(String.valueOf(true), game.printLegalMoves(input_array, output_array));
    }
}
