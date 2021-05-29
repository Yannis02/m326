import javax.swing.*;
import java.awt.*;

public class StartGUI extends JFrame {

    Color primary = new Color(112, 211, 186);
    Color secondary = new Color(200, 142, 234);
    Color tertiary = new Color(190, 226, 128);
    JPanel topPanel;
    JPanel midPanel;
    JPanel botPanel;
    JButton startButton;
    JButton editButton;
    JTextField title;


    public StartGUI() {
        init();
    }

    public void init() {
        topPanel = new JPanel();
        midPanel = new JPanel();
        botPanel = new JPanel();
        startButton = new JButton("Start Game");
        editButton = new JButton("Settings");
        title = new JTextField("Memory!");

        this.getContentPane().add(topPanel, BorderLayout.NORTH);
        this.getContentPane().add(midPanel,BorderLayout.CENTER);
        this.getContentPane().add(botPanel, BorderLayout.SOUTH);

        topPanel.add(title, BorderLayout.CENTER);
        botPanel.add(startButton, BorderLayout.WEST);
        botPanel.add(editButton, BorderLayout.EAST);

        topPanel.setBackground(primary);
        midPanel.setBackground(primary);
        botPanel.setBackground(primary);

        title.setEditable(false);
        title.setBorder(BorderFactory.createEmptyBorder());
        title.setBackground(primary);
        startButton.setBorder(BorderFactory.createRaisedBevelBorder());
        startButton.setBackground(secondary);
        editButton.setBorder(BorderFactory.createRaisedBevelBorder());
        editButton.setBackground(tertiary);
        this.setMinimumSize(new Dimension(500,500));
        this.setBackground(primary);
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
    }
}
