import javafx.scene.paint.Stop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Maruthan Thanabalasingam
 * @version 0.9
 * @date 16-06-2021
 * Bei der Instanzierung wird ein JFrame-Objekt erzeugt und dies wird als Startfenster angezeigt.
 */

public class SpielGUI extends JFrame {
    JPanel topPanel;
    JPanel midPanel;
    JPanel botPanel;
    Stopwatch timer;
    //Attributes
    Font original;
    Font titleFont;
    Color teal;
    Color mandarine;

    public SpielGUI() {
        init();
    }

    public void init() {
        set();
        modify();
        add();
        activate();
    }

    public void set() {
        topPanel = new JPanel();
        midPanel = new JPanel();
        botPanel = new JPanel();
        timer= new Stopwatch();
        original = new Font("Comic Sans MS", Font.BOLD, 18);
        titleFont = new Font("Comic Sans MS", Font.BOLD, 32);
        teal = new Color(170, 241, 237);
        mandarine = new Color(248, 205, 171);
    }

    public void modify() {

    }

    public void add() {
        this.getContentPane().add(topPanel,BorderLayout.NORTH);
        this.getContentPane().add(midPanel,BorderLayout.CENTER);
        this.getContentPane().add(botPanel,BorderLayout.SOUTH);
        botPanel.add(new Stopwatch());
    }

    public void activate() {
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {

    }
}
