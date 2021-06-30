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

public class KonfigurationGUI extends JFrame {
    JPanel topPanel;
    JPanel midPanel;
    JPanel botPanel;
    JButton startButton;
    JButton editButton;
    JTextField title;
    JTextField subtitle;
    JComboBox withJoker;
    //Attributes
    Font original;
    Font titleFont;
    Color teal;
    Color mandarine;
    public KonfigurationGUI(){
        init();
    }

    public void init(){
        set();
        modify();
        add();
        activate();
    }
    public void set(){
        setTopPanel(new JPanel());
        setMidPanel(new JPanel());
        setBotPanel(new JPanel());
        setStartButton(new JButton());
        setEditButton(new JButton());
        setTitle(new JTextField());
        setSubtitle(new JTextField());

        original = new Font("Comic Sans MS", Font.BOLD,18);
        titleFont = new Font("Comic Sans MS", Font.BOLD,32);
        teal = new Color(170, 241, 237);
        mandarine = new Color(248, 205, 171);
    }
    public void modify(){
        topPanel.setBackground(teal);
        topPanel.setPreferredSize(new Dimension(700,50));
        midPanel.setBackground(teal);
        midPanel.setPreferredSize(new Dimension(700,50));
        botPanel.setBackground(teal);
        botPanel.setPreferredSize(new Dimension(700,50));
        title.setText("Memory");
        title.setSize(200,200);
        title.setBackground(teal);
        title.setBorder(BorderFactory.createEmptyBorder());
        title.setFont(titleFont);
        title.setEditable(false);
        subtitle.setText("Maruthan Thanabalasingam,Yannis Lee,Jonas Rhbary");
        subtitle.setBackground(teal);
        subtitle.setBorder(BorderFactory.createEmptyBorder());
        subtitle.setFont(original);
        subtitle.setEditable(false);
        startButton.setText("Start Game");
        startButton.setBackground(mandarine);
        startButton.setFont(original);
        editButton.setText("Edit Settings");
        editButton.setBackground(mandarine);
        editButton.setFont(original);


    }
    public void add(){
        this.getContentPane().add(topPanel, BorderLayout.NORTH);
        this.getContentPane().add(midPanel, BorderLayout.CENTER);
        this.getContentPane().add(botPanel, BorderLayout.SOUTH);
        topPanel.add(title,BorderLayout.CENTER);
        midPanel.add(subtitle,BorderLayout.CENTER);
        botPanel.add(startButton,BorderLayout.WEST);
        botPanel.add(editButton,BorderLayout.EAST);
    }
    public void activate(){
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
    }

    public void addListener(){
        this.startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start Button clicked!");

            }
        });
    }
    //Setter & Getter
    public void setTopPanel(JPanel topPanel) {
        this.topPanel = topPanel;
    }
    public void setMidPanel(JPanel midPanel) {
        this.midPanel = midPanel;
    }

    public void setBotPanel(JPanel botPanel) {
        this.botPanel = botPanel;
    }
    public void setStartButton(JButton startButton) {
        this.startButton = startButton;
    }
    public void setEditButton(JButton editButton) {
        this.editButton = editButton;
    }
    public void setTitle(JTextField title) {
        this.title = title;
    }
    public void setSubtitle(JTextField subtitle) {
        this.subtitle = subtitle;
    }
}
