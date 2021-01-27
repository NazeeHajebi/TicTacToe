package org.nazee.tictactoe;

import com.spun.util.WindowUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TicTacToeGui extends JPanel implements MouseListener {
    private TicTacToeBoard ticTacToeBoard;
    private JButton topLeft;
    private JButton topMiddle;
    private JButton topRight;
    private JButton middleTop;
    private JButton middleLeft;
    private JButton middle;
    private JButton middleRight;
    private JButton bottomLeft;
    private JButton bottomMiddle;
    private JButton bottomRight;

    public TicTacToeGui(TicTacToeBoard ticTacToeBoard) {
        this.ticTacToeBoard = ticTacToeBoard;
        createBoard();
        refreshBoard();
    }

    private void refreshBoard() {
        topLeft.setText(ticTacToeBoard.getTopLeft());
        topMiddle.setText(ticTacToeBoard.getTopMiddle());
        topRight.setText(ticTacToeBoard.getTopRight());
        middleLeft.setText(ticTacToeBoard.getMiddleLeft());
        middle.setText(ticTacToeBoard.getMiddle());
        middleRight.setText(ticTacToeBoard.getMiddleRight());
        bottomLeft.setText(ticTacToeBoard.getBottomLeft());
        bottomMiddle.setText(ticTacToeBoard.getBottomMiddle());
        bottomRight.setText(ticTacToeBoard.getBottomRight());
        repaint();
    }

    private void createBoard() {
        GridLayout experimentLayout = new GridLayout(3, 3);


        this.setLayout(experimentLayout);

        topLeft = new JButton("Button 1");
        this.add(topLeft);
        topLeft.setFont(new Font("", Font.PLAIN, 30));
        //Listen to the top left button being clicked
        topLeft.addMouseListener(this);
        topMiddle = new JButton("Button 2");
        this.add(topMiddle);
        topMiddle.setFont(new Font("", Font.PLAIN, 30));
        //Listen to the top left button being clicked
        topMiddle.addMouseListener(this);
        topRight = new JButton("Button 3");
        this.add(topRight);
        topRight.setFont(new Font("", Font.PLAIN, 30));
        //Listen to the top left button being clicked
        topRight.addMouseListener(this);
        middleLeft = new JButton("Button 4");
        this.add(middleLeft);
        middleLeft.setFont(new Font("", Font.PLAIN, 30));
        middleLeft.addMouseListener(this);
        middle = new JButton("Button 5");
        this.add(middle);
        middle.setPreferredSize(new Dimension(100, 100));
        middle.setFont(new Font("", Font.PLAIN, 30));
        middle.addMouseListener(this);
        middleRight = new JButton("Button 6");
        this.add(middleRight);
        middleRight.setFont(new Font("", Font.PLAIN, 30));
        middleRight.addMouseListener(this);
        bottomLeft = new JButton("Button 7");
        this.add(bottomLeft);
        bottomLeft.setFont(new Font("", Font.PLAIN, 30));
        bottomLeft.addMouseListener(this);
        bottomMiddle = new JButton("Button 8");
        this.add(bottomMiddle);
        bottomMiddle.setFont(new Font("", Font.PLAIN, 30));
        bottomMiddle.addMouseListener(this);
        bottomRight = new JButton("Button 9");
        this.add(bottomRight);
        bottomRight.setFont(new Font("", Font.PLAIN, 30));
        bottomRight.addMouseListener(this);
    }

    public static void main(String[] arg) {
        WindowUtils.testPanel(new TicTacToeGui(new TicTacToeBoard()));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //when the user clicks on top left add an x
        if (topLeft == e.getComponent()) {
            this.ticTacToeBoard.putLeftTop(this.ticTacToeBoard.whoseTurnItIs());
            refreshBoard();
            //When the user click on Top middle put an O
        } else if (topMiddle == e.getComponent()) {
            this.ticTacToeBoard.putTopMiddle(this.ticTacToeBoard.whoseTurnItIs());
            refreshBoard();
        } else if (topRight == e.getComponent()) {
            this.ticTacToeBoard.putRightTop(this.ticTacToeBoard.whoseTurnItIs());
            refreshBoard();
        } else if (bottomLeft == e.getComponent()) {
            this.ticTacToeBoard.putBottomLeft(this.ticTacToeBoard.whoseTurnItIs());
            refreshBoard();
        } else if (bottomMiddle == e.getComponent()) {
            this.ticTacToeBoard.putBottomMiddle(this.ticTacToeBoard.whoseTurnItIs());
            refreshBoard();
        } else if (bottomRight == e.getComponent()) {
            this.ticTacToeBoard.putBottomRight(this.ticTacToeBoard.whoseTurnItIs());
            refreshBoard();
        } else if (middleRight == e.getComponent()) {
            this.ticTacToeBoard.putMiddleRight(this.ticTacToeBoard.whoseTurnItIs());
            refreshBoard();
        } else if (middle == e.getComponent()) {
            this.ticTacToeBoard.putMiddle(this.ticTacToeBoard.whoseTurnItIs());
            refreshBoard();
        } else if (middleLeft == e.getComponent()) {
            this.ticTacToeBoard.putMiddleLeft(this.ticTacToeBoard.whoseTurnItIs());
            refreshBoard();
        }
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (this.ticTacToeBoard.winner() != null) {
            g.drawString(ticTacToeBoard.winner() + " has Won", 120, 150);
        }
    }
}
