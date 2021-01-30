package org.nazee.tictactoe;


import org.approvaltests.Approvals;
import org.approvaltests.awt.AwtApprovals;
import org.approvaltests.core.Options;
import org.approvaltests.reporters.ClipboardReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {
    @Test
    //@UseReporter(ClipboardReporter.class)
    public void TicTacToe() {
        //Make a TicTacToe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //check board is empty
        //put an X in the middle
        ticTacToeBoard.putMiddle("x");
        //put an O in the middle left
        ticTacToeBoard.putMiddleLeft("o");
        //put an X in the left bottom
        ticTacToeBoard.putBottomLeft("x");
        //put an O in the left top
        ticTacToeBoard.putLeftTop("o");
        //put an X in the right top
        ticTacToeBoard.putRightTop("x");
        //Check X wins the game
        Assert.assertEquals("x", ticTacToeBoard.winner());
        AwtApprovals.verify(new TicTacToeGui(ticTacToeBoard));
    }

    @Test
    public void OWins() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an O in the top middle
        ticTacToeBoard.putTopMiddle("o");
        //put an x in the top right
        ticTacToeBoard.putRightTop("x");
        //put an o in the middle
        ticTacToeBoard.putMiddle("o");
        //put an x in the middle right
        ticTacToeBoard.putMiddleRight("x");
        //put an o in the bottom middle
        ticTacToeBoard.putBottomMiddle("o");
        //Check o wins
        Assert.assertEquals("o", ticTacToeBoard.winner());
    }
    //check board is empty

    @Test
    public void boardEmpty() {
        //create a tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //check nobodys won
        Assert.assertEquals(null, ticTacToeBoard.winner());
    }

    @Test
    public void noBodyWins() {
        //create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an x in the bottom right
        ticTacToeBoard.putRightTop("x");
        //check nobodies won
        Assert.assertEquals(null, ticTacToeBoard.winner());
    }

    @Test
    public void noBodyWinsTwo() {
        //create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an X middle
        ticTacToeBoard.putMiddle("x");
        //put an o in the top right
        ticTacToeBoard.putRightTop("o");
        //put an o in the bottom left
        ticTacToeBoard.putBottomLeft("o");
        //no one wins
        Assert.assertEquals(null, ticTacToeBoard.winner());
    }

    @Test
    public void noBodyWinsWith1Space() {
        //create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an X middle
        Assert.assertEquals(ticTacToeBoard.getTopMiddle(), null);
        ticTacToeBoard.putTopMiddle("x");
        Assert.assertEquals(ticTacToeBoard.getTopMiddle(), "x");

    }

    @Test
    public void testPutTopMiddle() {
        //create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an X middle
        Assert.assertEquals(ticTacToeBoard.getTopMiddle(), null);
        ticTacToeBoard.putTopMiddle("o");
        Assert.assertEquals(ticTacToeBoard.getTopMiddle(), "o");

    }

    @Test
    public void testPutTopRight() {
        //Create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an x in the top right
        ticTacToeBoard.putRightTop("x");
        Assert.assertEquals(ticTacToeBoard.getTopRight(), "x");
    }

    @Test
    public void testPutTopRightO() {
        //Create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an x in the top right
        ticTacToeBoard.putRightTop("o");
        Assert.assertEquals(ticTacToeBoard.getTopRight(), "o");
    }

    @Test
    public void testPutTopLeft() {
        //Create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an x in the top left
        ticTacToeBoard.putLeftTop("x");
        Assert.assertEquals(ticTacToeBoard.getTopLeft(), "x");
    }

    @Test
    public void testPutMiddleLeft() {
        //Create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an x in the middle left
        ticTacToeBoard.putMiddleLeft("x");
        Assert.assertEquals(ticTacToeBoard.getMiddleLeft(), "x");
    }

    @Test
    public void testPutMiddleRight() {
        //Create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //get an x in the middle right
        ticTacToeBoard.putMiddleRight("x");
        Assert.assertEquals(ticTacToeBoard.getMiddleRight(), "x");
    }

    @Test
    public void testPutBottomLeft() {
        //Create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an x in the bottom left
        ticTacToeBoard.putBottomLeft("x");
        Assert.assertEquals(ticTacToeBoard.getBottomLeft(), "x");
    }

    @Test
    public void testPutBottomMiddle() {
        //Create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an x in the bottom left
        ticTacToeBoard.putBottomMiddle("x");
        Assert.assertEquals(ticTacToeBoard.getBottomMiddle(), "x");
    }

    @Test
    public void testPutBottomRight() {
        //Create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an x in the bottom left
        ticTacToeBoard.putBottomRight("x");
        Assert.assertEquals(ticTacToeBoard.getBottomRight(), "x");
    }

    @Test
    public void testPutMiddle() {
        //create a new tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an o in the middle
        ticTacToeBoard.putMiddle("x");
        Assert.assertEquals(ticTacToeBoard.getMiddle(), "x");
    }

    @Test

    public void TicTacToeEmpty() {
        //Make a TicTacToe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //check board is empty
        AwtApprovals.verify(new TicTacToeGui(ticTacToeBoard));
    }

    @Test
    public void TicTacToeTakeTurns() {
        //Make a TicTacToe Board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //Find out whose turn it is
        String xTurn = ticTacToeBoard.whoseTurnItIs();
        Assert.assertEquals("x", xTurn);
        ticTacToeBoard.putMiddle("x");

        //it is os turn
        String oTurn = ticTacToeBoard.whoseTurnItIs();
        Assert.assertEquals("o", oTurn);
        ticTacToeBoard.putLeftTop("o");
        //Check/compare that o is the return value
        Assert.assertEquals("x", ticTacToeBoard.whoseTurnItIs());

    }

    @Test
    public void ClickOnTheSameBoxTwice() {
        //make a tic tac toe board
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //put an 'x' on the top left
        ticTacToeBoard.putLeftTop("x");
        //put an 'o' on the top left
        ticTacToeBoard.putLeftTop("o");
        //Check the top left is still an 'x'
        Assert.assertEquals(ticTacToeBoard.getTopLeft(), "x");
        //check it is 'o' turn
        String oTurn = ticTacToeBoard.whoseTurnItIs();
        Assert.assertEquals("o", oTurn);
    }

    @Test
    public void addOTopMiddle() {
        //put an o in the top middle
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        ticTacToeBoard.putTopMiddle("o");
        //check the top middle value is o
        Assert.assertEquals(ticTacToeBoard.getTopMiddle(), "o");
        //check it is x's turm
    }

    @Test
    public void checkTurnGetsUpdated() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //click on the top middle
        ticTacToeBoard.putTopMiddle(ticTacToeBoard.whoseTurnItIs());
        //check it is o's turn
        Assert.assertEquals("o", ticTacToeBoard.whoseTurnItIs());
    }

    @Test
    public void checkAfterTopRightTurnGetsUpdated() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //Click on the top right
        ticTacToeBoard.putRightTop(ticTacToeBoard.whoseTurnItIs());
        //Check it is O's turn
        Assert.assertEquals("o", ticTacToeBoard.whoseTurnItIs());
    }

    @Test
    public void CheckBottomLeftGetsUpdated() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //click on the bottom left
        ticTacToeBoard.putBottomLeft(ticTacToeBoard.whoseTurnItIs());
        //Check it is O's turn
        Assert.assertEquals("o", ticTacToeBoard.whoseTurnItIs());
    }

    @Test
    public void CheckBottomMiddleGetsUpdated() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //click on the bottom middle
        ticTacToeBoard.putBottomMiddle(ticTacToeBoard.whoseTurnItIs());
        //check it is O's turn
        Assert.assertEquals("o", ticTacToeBoard.whoseTurnItIs());
    }

    @Test
    public void CheckBottomRightGetsUpdated() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //Click on the bottom right
        ticTacToeBoard.putBottomRight(ticTacToeBoard.whoseTurnItIs());
        //Check it is O's turn
        Assert.assertEquals("o", ticTacToeBoard.whoseTurnItIs());
    }

    @Test
    public void checkMiddleRightGetsUpdated() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //click on the middle right
        ticTacToeBoard.putMiddleRight(ticTacToeBoard.whoseTurnItIs());
        //check it is o's turn
        Assert.assertEquals("o", ticTacToeBoard.whoseTurnItIs());
    }

    @Test
    public void checkMiddleGetsUpdated() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        ticTacToeBoard.putMiddle(ticTacToeBoard.whoseTurnItIs());
        Assert.assertEquals("o", ticTacToeBoard.whoseTurnItIs());
    }

    @Test
    public void checkMiddleLeftGetsUpdated() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        ticTacToeBoard.putMiddleLeft(ticTacToeBoard.whoseTurnItIs());
        Assert.assertEquals("o", ticTacToeBoard.whoseTurnItIs());
    }

    @Test
    public void checkMiddleGetsUpdateWithO() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //Put O in the middle of the board
        ticTacToeBoard.putMiddle("o");
        //Check middle has an O
        Assert.assertEquals("o", ticTacToeBoard.getMiddle());
    }

    @Test
    public void checkBottomLeftStaysSameWhenDoubleClick() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        // Put X in the Left Bottom of the board
        ticTacToeBoard.putBottomLeft("x");
        // Put O in the Left Bottom of the board
        ticTacToeBoard.putBottomLeft("o");
        //Check middle has an X in the left bottom
        Assert.assertEquals("x", ticTacToeBoard.getBottomLeft());
    }
    @Test
    public void checkBottomMiddleStaysSameWhenDoubleClick() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        // Put X in the Left Bottom of the board
        ticTacToeBoard.putBottomMiddle("x");
        // Put O in the Left Bottom of the board
        ticTacToeBoard.putBottomMiddle("o");
        //Check middle has an X in the left bottom
        Assert.assertEquals("x", ticTacToeBoard.getBottomMiddle());
    }
    @Test
    public void checkBottomRightStaysSameWhenDoubleClick() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        // Put X in the Left Bottom of the board
        ticTacToeBoard.putBottomRight("x");
        // Put O in the Left Bottom of the board
        ticTacToeBoard.putBottomRight("o");
        //Check middle has an X in the left bottom
        Assert.assertEquals("x", ticTacToeBoard.getBottomRight());
    }
    @Test
    public void checkMiddleRightStaysSameWhenDoubleClick() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        // Put X in the Left Bottom of the board
        ticTacToeBoard.putMiddleRight("x");
        // Put O in the Left Bottom of the board
        ticTacToeBoard.putMiddleRight("o");
        //Check middle has an X in the left bottom
        Assert.assertEquals("x", ticTacToeBoard.getMiddleRight());
    }
    @Test
    public void checkMiddleStaysSameWhenDoubleClick() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        // Put X in the Left Bottom of the board
        ticTacToeBoard.putMiddle("x");
        // Put O in the Left Bottom of the board
        ticTacToeBoard.putMiddle("o");
        //Check middle has an X in the left bottom
        Assert.assertEquals("x", ticTacToeBoard.getMiddle());
    }
    @Test
    public void checkMiddleLeftStaysSameWhenDoubleClick() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        // Put X in the Left Bottom of the board
        ticTacToeBoard.putMiddleLeft("x");
        // Put O in the Left Bottom of the board
        ticTacToeBoard.putMiddleLeft("o");
        //Check middle has an X in the left bottom
        Assert.assertEquals("x", ticTacToeBoard.getMiddleLeft());
    }
    @Test
    public void checkToopMiddleStaysSameWhenDoubleClick() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        // Put X in the Left Bottom of the board
        ticTacToeBoard.putTopMiddle("x");
        // Put O in the Left Bottom of the board
        ticTacToeBoard.putTopMiddle("o");
        //Check middle has an X in the left bottom
        Assert.assertEquals("x", ticTacToeBoard.getTopMiddle());
    }
    @Test
    public void checkTopRightStaysSameWhenDoubleClick() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        // Put X in the Left Bottom of the board
        ticTacToeBoard.putRightTop("x");
        // Put O in the Left Bottom of the board
        ticTacToeBoard.putRightTop("o");
        //Check middle has an X in the left bottom
        Assert.assertEquals("x", ticTacToeBoard.getTopRight());
    }

    @Test
    public void checkXIsAWinner() {

        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //check tictactoeboard winner is null
        // Check no body has won
        Assert.assertEquals(null, ticTacToeBoard.winner());
        ticTacToeBoard.putMiddle("x");
        Assert.assertEquals(null, ticTacToeBoard.winner());
        ticTacToeBoard.putTopMiddle("o");
        Assert.assertEquals(null, ticTacToeBoard.winner());
        ticTacToeBoard.putRightTop("x");
        Assert.assertEquals(null, ticTacToeBoard.winner());
        ticTacToeBoard.putMiddleRight("o");
        Assert.assertEquals(null, ticTacToeBoard.winner());
        ticTacToeBoard.putBottomLeft("x");
        //check X is a winner
        Assert.assertEquals("x", ticTacToeBoard.winner());
    }

    @Test
    public void CheckNoOneIsAWinner() {
        //create the tictactoeboard
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        //Put X on middle bottom
        ticTacToeBoard.putBottomMiddle("x");
        //check nobody won
        Assert.assertEquals(null, ticTacToeBoard.winner());

    }

    @Test
    public void checkMiddleRowWins() {
        //create the tictactoeboard
        TicTacToeBoard ticTacToeBoard  =  new TicTacToeBoard();
        //Put X  on  middle
        ticTacToeBoard.putMiddle("x");
        //Put x  on  middle  right
        ticTacToeBoard.putMiddleRight("x");
        //put x  on  middle left
        ticTacToeBoard.putMiddleLeft("x");
        Assert.assertEquals("x", ticTacToeBoard.winner());
    }

    @Test
    public void checkMiddleRowWinsDifferentOrder() {
        //create the tictactoeboard
        TicTacToeBoard ticTacToeBoard  =  new TicTacToeBoard();
        //put x  on  middle left
        ticTacToeBoard.putMiddleLeft("x");
        //Put x  on  middle  right
        ticTacToeBoard.putMiddleRight("x");
        //Put X  on  middle
        ticTacToeBoard.putMiddle("x");

        Assert.assertEquals("x", ticTacToeBoard.winner());
    }
    @Test
    public void checkMiddleRowWinsDifferentOrder2() {
        //create the tictactoeboard
        TicTacToeBoard ticTacToeBoard  =  new TicTacToeBoard();
        //put x  on  middle left
        ticTacToeBoard.putMiddleLeft("x");
        //Put X  on  middle
        ticTacToeBoard.putMiddle("x");
        //Put x  on  middle  right
        ticTacToeBoard.putMiddleRight("x");

        Assert.assertEquals("x", ticTacToeBoard.winner());
    }

    @Test
    public void checkFirstColumnWins() {
        TicTacToeBoard ticTacToeBoard  =  new TicTacToeBoard();
        ticTacToeBoard.putLeftTop("x");
        ticTacToeBoard.putMiddleLeft("x");
        ticTacToeBoard.putBottomLeft("x");
        Assert.assertEquals("x", ticTacToeBoard.winner());
    }
}
