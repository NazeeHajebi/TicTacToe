package org.nazee.tictactoe;

public class TicTacToeBoard {

    private String boardWinner;
    private String topMiddleValue;
    private String topRightValue;
    private String topLeftValue;
    private String middle;
    private String middleLeftValue;
    private String middleRightValue;
    private String bottomLeftValue;
    private String bottomMiddleValue;
    private String bottomRightValue;
    private int time = 1;


    public void putBottomLeft(String value) {
        if (bottomLeftValue == null) {
            bottomLeftValue = value;
            time += 1;
            if (value.equals(middle) && value.equals(topRightValue)) {
                // that value is the winner
                boardWinner = value;
            }
        }
    }

    public void putMiddle(String value) {
        if (middle == null) {
            middle = value;
            //it is the next persons turn
            time += 1;
        }
    }

    public void putMiddleLeft(String value) {
        if (middleLeftValue == null) {
            middleLeftValue = value;
            time += 1;
        }
    }

    public void putLeftTop(String value) {
        if (topLeftValue == null) {
            topLeftValue = value;
            time += 1;
        }
    }

    public void putRightTop(String value) {
        //Put x on the right top box
        if (topRightValue == null) {
            topRightValue = value;
            time += 1;
        }
        //When there are three x's in a diagonal order (there is an x in the middle)
        //When the three diagonal order have the same value,
        if (value.equals(middle) && value.equals(bottomLeftValue)) {
            // that value is the winner
            boardWinner = value;
        }
    }

    public String winner() {
        //no box has a value
        return boardWinner;
    }

    public void putTopMiddle(String ticTacToeMarker) {
        if (topMiddleValue == null) {
            topMiddleValue = ticTacToeMarker;
            time += 1;
        }
    }


    public void putMiddleRight(String value) {
        if (middleRightValue == null) {
            middleRightValue = value;
            time += 1;
        }
    }

    public void putBottomMiddle(String value) {
        if (bottomMiddleValue == null) {
            bottomMiddleValue = value;
            time += 1;
            //O wins
            //When the middle column have the same values(X OR O) THAT VALUE WINS
            //When the bottom row all have the same values (X or O) that value wins

        }
    }

    public void putBottomRight(String value) {
        if (bottomRightValue == null) {
            bottomRightValue = value;
            time += 1;
        }
    }

    public String getTopMiddle() {
        // return the value in the top middle
        return topMiddleValue;
    }

    public String getTopRight() {
        return topRightValue;
    }

    public String getTopLeft() {
        return topLeftValue;
    }

    public String getMiddleLeft() {
        return middleLeftValue;
    }

    public String getMiddleRight() {
        return middleRightValue;
    }

    public String getBottomLeft() {
        return bottomLeftValue;
    }

    public String getBottomMiddle() {
        return bottomMiddleValue;
    }

    public String getBottomRight() {
        return bottomRightValue;
    }

    public String getMiddle() {
        return middle;
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



