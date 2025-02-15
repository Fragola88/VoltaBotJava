package view;


import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import controller.ActionManagement;

import javax.swing.*;

/**
 * Owner
 * @author Crescenzi Daniele
 */
public class EntryPoint  {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {


        UIManager.setLookAndFeel(new FlatArcDarkIJTheme());
        new ActionManagement().start();

    }
}