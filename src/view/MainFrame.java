package view;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import javax.swing.text.StringContent;

/**
 * Created by jc277043 on 25/05/15.
 */
public class MainFrame extends JFrame {
    public MainFrame(String title, ShapeWorldPanel panel){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      add(panel);
        pack();
    }
}
