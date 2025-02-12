package view;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;

import javax.swing.*;


/**
 * Owner
 * @author Crescenzi Daniele
 */
public class Main {
    public static void main(String[] args) {


        try {
            UIManager.setLookAndFeel(new FlatArcDarkIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        new Display();

    }
}