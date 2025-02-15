package view;

import javax.swing.*;
import java.awt.*;
import java.net.URI;

/**
 * edited by Enzo
 * @author Enzo
 */

public class Display extends JFrame{
    private JPanel main;
    private JTextField chatInsert;
    private JButton send;
    private JButton options;
    private JButton collegamentiButton;
    private JLabel chatUser;
    private JLabel chatBot;


    public Display() {

        setContentPane(main);
        setTitle("Ai Chat Display");
        setSize(400,500);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(super.getGraphicsConfiguration());

        int upperBar = screenInsets.bottom;
        int x = screenSize.width - getWidth();
        int y = screenSize.height - getHeight() - upperBar;

        setLocation(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        collegamentiButton.addActionListener(e -> {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI("https://www.voltafr.edu.it"));
            } catch (Exception a) {
                JOptionPane.showMessageDialog(null, "Impossibile aprire la pagina web.", null, JOptionPane.ERROR_MESSAGE);
            }
        });

        send.addActionListener(e -> {
            if(chatInsert.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Inserisci un messaggio.", null, JOptionPane.INFORMATION_MESSAGE);
            }
            chatUser.setText(chatInsert.getText());
        });
    }

}
