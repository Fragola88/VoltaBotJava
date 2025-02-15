package view;

import javax.swing.*;
import java.awt.*;
import java.net.URI;

/**
 * edited by Enzo
 *
 * @author Enzo
 */

public class Index extends JFrame {


    /**
     * tutti gli ascoltatori stanno nel controller
     */

    private String title = "Ai Chat Index";

    private JPanel main;
    protected JTextField chatInsert;
    protected JButton send;
    protected JButton options;
    protected JButton collegamentiButton;
    protected JLabel chatUser;
    protected JLabel chatBot;


    public Index() {

        setContentPane(main);
        setTitle(this.title);
        setSize(400, 500);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(super.getGraphicsConfiguration());

        int upperBar = screenInsets.bottom;
        int x = screenSize.width - getWidth();
        int y = screenSize.height - getHeight() - upperBar;

        setLocation(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
