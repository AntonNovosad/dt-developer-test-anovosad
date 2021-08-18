package com.vizor.test.gallery;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar {

    public JMenuBar menu() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        jMenuBar.add(file);

        file.add(new JMenuItem("Open", 'O'));
        file.add(new JMenuItem("Save", 'S'));
        file.addSeparator();
        file.add(new JMenuItem("Exit", 'E')).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        return jMenuBar;
    }
}
