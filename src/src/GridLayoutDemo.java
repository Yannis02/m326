/**
 * Demo für den Layout-Manager GridLayout.
 *
 * Wenn Sie dieses Codebeispiel zum Laufen bringen wollen, beachten Sie, dass
 * Sie den Quelltext in einer Datei namens GridLayoutDemo.java speichern
 * (Achtung auf Groß-und Kleinschreibung) und dass sich die Datei in einem
 * Unterordner „gui“ unter Ihrem Projektordner befinden muss.
 *
 * Die meisten Swing-Formulare leiten javax.swing.JFrame ab.
 *
 * @author phaidros
 */
public class GridLayoutDemo extends javax.swing.JFrame {


    private javax.swing.JPanel jPanel1 = new javax.swing.JPanel();

    private javax.swing.JButton[] jButton = new javax.swing.JButton[9];


    public GridLayoutDemo() {


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        jPanel1.setLayout( new java.awt.GridLayout( 3, 3 ) );


        ButtonListener bl = new ButtonListener();

        for ( int i = 0; i<9; i++ ) {
            jButton[i] = new javax.swing.JButton ( "JButton" + (i+1) );
            jButton[i].addActionListener ( bl );
            jPanel1.add ( jButton[i] );
        }


        this.getContentPane().add ( jPanel1 ) ;


        pack();


    }

    class ButtonListener implements java.awt.event.ActionListener {
        public void actionPerformed(java.awt.event.ActionEvent e) {


            for (int i=0; i<9; i++) {
                if( e.getSource() == jButton[i] ){
                    System.out.println("JButton" + (i+1) + " wurde geklickt.");
                }
            }
        }
    }

    public static void main(String args[]) {
        // Ein Objekt der Klasse erzeugen und sichtbar machen.
        new GridLayoutDemo().setVisible ( true );
    }
}