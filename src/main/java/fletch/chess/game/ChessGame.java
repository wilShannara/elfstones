package fletch.chess.game;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ChessGame extends JFrame implements ActionListener {

    private String myState;

    public static void main(String... args) {

        ChessGame game = new ChessGame();
        game.myState = "dslkjdsfljk";

        //1. Create the frame.
        JFrame frame = new JFrame("chessGame -- UnicornWar");

        frame.setPreferredSize(new Dimension(800, 800));
        frame.setBackground(Color.RED);


        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the frame.
        //...create emptyLabel...
        ImageIcon icon = new ImageIcon("Rochefoucauld-Grail-Gawain-in-battle.jpg");
        JLabel label = new JLabel("<html><h1>UnicornWar</h1></html>", icon, JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        JButton startButton = new JButton("Start Game");
        startButton.setToolTipText("Click to continue");
        //add(startButton);
        //startButton.addActionListener(this);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setVisible(true);

        //4. Size the frame.
        frame.pack();

        //5. Show it.
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {
        for(int i = 0; true; i++) {
            System.out.println(i);
        }
    }
}

