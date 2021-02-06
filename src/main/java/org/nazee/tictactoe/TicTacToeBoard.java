package org.nazee.tictactoe;

public class TicTacToeBoard {

    private String boardWinner;
    private String [][] grid = new String[3][3];
    private int time = 1;


    public void putBottomLeft(String value) {
        if (grid [2][0] == null) {
            grid [2][0] = value;
            time += 1;
            if (value.equals(grid [1][1]) && value.equals(grid [0][2])) {
                // that value is the winner
                boardWinner = value;
            }
            //check  middle left value and top left value and middle bottom value are the same
            leftColumnWins(value);
        }
        checkIfRowWins(value, 2);
    }

    private void leftColumnWins(String value) {
        if  (value.equals(grid [0][0]) && value.equals(grid[1][0]) && value.equals(grid [2][0])) {
            boardWinner = value;
        }
    }
    private void rightColumnWins(String value) {
        if (value.equals(grid [2][2] ) && value.equals(grid [1][2]) && value.equals(grid [0][2])) {
            boardWinner  =  value;
        }
    }

    public void putMiddle(String value) {
        if (grid [1][1] == null) {
            grid [1][1] = value;
            //it is the next persons turn
            time += 1;
        }
        checkIfRowWins(value, 1);
    }

    public void putMiddleLeft(String value) {
        if (grid [1][0] == null) {
            grid [1][0] = value;
            time += 1;
            checkIfRowWins(value, 1);
        }
        leftColumnWins(value);
    }


    public void putLeftTop(String value) {
        if (grid[0][0] == null) {
            grid[0][0] = value;
            time += 1;
        }
        checkIfRowWins(value, 0);
        leftColumnWins(value);
    }


    public void putRightTop(String value) {
        //Put x on the right top box
        if (grid [0][2] == null) {
            grid [0][2] = value;
            time += 1;
        }
        //When there are three x's in a diagonal order (there is an x in the middle)
        //When the three diagonal order have the same value,
        if (value.equals(grid [1][1]) && value.equals(grid [2][0])) {
            // that value is the winner
            boardWinner = value;
        }
        checkIfRowWins(value, 0);
        rightColumnWins(value);
    }



    public String winner() {
        //no box has a value
        // I added this code
        return boardWinner;
    }

    public void putTopMiddle(String value) {
        if (grid [0][1] == null) {
            grid [0][1] = value;
            time += 1;
        }
        checkIfRowWins(value, 0);
    }


    public void putMiddleRight(String value) {
        if (grid [1][2] == null) {
            grid [1][2] = value;
            time += 1;
        }
        //Check  middle across has  the same value
        checkIfRowWins(value, 1);
        rightColumnWins(value);

    }

    public void putBottomMiddle(String value) {
        if (grid [2][1] == null) {
            grid [2][1]  = value;
            time += 1;
            //O wins
            //When the middle column have the same values(X OR O) THAT VALUE WINS
            //When the bottom row all have the same values (X or O) that value wins
            if (value.equals(grid [1][1]) && value.equals(grid [0][1])) {
                // that value is the winner
                boardWinner = value;
            }
            checkIfRowWins(value, 2);
        }
    }

    private void checkIfRowWins(String value, int row) {
        if (value.equals(grid [row][0]) && value.equals(grid [row][1]) && value.equals(grid[row][2])) {
            // that value is the winner
            boardWinner = value;
        }
    }

    public void putBottomRight(String value) {
        if (grid [2][2] == null) {
            grid [2][2] = value;
            time += 1;
        }
        rightColumnWins(value);
        checkIfRowWins(value, 2);
    }

    public String getTopMiddle() {
        // return the value in the top middle
        return grid [0][1];
    }

    public String getTopRight() {
        return grid [0][2];
    }

    public String getTopLeft() {
        return grid[0][0];
    }

    public String getMiddleLeft() {
        return grid [1][0];
    }

    public String getMiddleRight() {
        return grid [1][2];
    }

    public String getBottomLeft() {
        return grid [2][0];
    }

    public String getBottomMiddle() {
        return grid [2][1] ;
    }

    public String getBottomRight() {
        return grid [2][2];
    }

    public String getMiddle() {
        return grid [1][1];
    }

    public String whoseTurnItIs() {
        //The first time is x's turn
        //when the turn ia an odd number return x
        if (time % 2 == 0) {
            return "o";

            //the second time is o's turn
            //when the turn is an even number return o
        } else {
            return "x";
        }
    }
}



