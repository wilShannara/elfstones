package fletch.chess.game;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class ChessGame {

    private String myState;

    public static void main(String... args){
        ChessGame game = new ChessGame();
        game.myState = "dslkjdsfljk";
        //1. Create the frame.
        JFrame frame = new JFrame("chessGame");

        frame.setPreferredSize(new Dimension(800, 800));

        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the frame.
        //...create emptyLabel...
        ImageIcon icon = new ImageIcon("Rochefoucauld-Grail-Gawain-in-battle.jpg");
        JLabel label = new JLabel(icon);
        frame.getContentPane().add(label, BorderLayout.CENTER);
        label.setText("UnicornWar");

        //4. Size the frame.
        frame.pack();

        //5. Show it.
        frame.setVisible(true);


    }
}

