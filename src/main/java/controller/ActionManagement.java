package controller;

import view.Index;

import javax.swing.*;
import java.awt.*;
import java.net.URI;

public final class ActionManagement extends Index{


    public ActionManagement() {
        super();
        this.build();

    }

    /**
     * set the properties for the GUI
     */
    private void build() {

        super.collegamentiButton.addActionListener(e -> {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI("https://www.voltafr.edu.it"));
            } catch (Exception a) {
                JOptionPane.showMessageDialog(null, "Impossibile aprire la pagina web.", null, JOptionPane.ERROR_MESSAGE);
            }
        });

        send.addActionListener(e -> {
            if (chatInsert.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Inserisci un messaggio.", null, JOptionPane.INFORMATION_MESSAGE);
            }
            chatUser.setText(chatInsert.getText());
        });

    }


    /**
     * start index
     */
    public void start() {
        super.setVisible(true);
    }


    /**
     * stop index only See,non process in background
     */
    public void stop() {
        super.setVisible(false);
    }

}
