package com.vizor.test.gallery;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SaveFile {

    public Component save() {
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Add new picture");
        jButton.setFont(new Font("Verdana", Font.BOLD, 15));
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                jFileChooser.setDialogTitle("Open Picture");
                jFileChooser.setFileFilter(new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        String name = pathname.getName().toLowerCase();
                        return pathname.isFile() &&
                                name.endsWith(".png") ||
                                name.endsWith(".jpg");
                    }

                    @Override
                    public String getDescription() {
                        return ".png , .jpg";
                    }
                });
                File file = jFileChooser.getSelectedFile();
                jFileChooser.showOpenDialog(jPanel);
            }
        });
        return jPanel;
    }
}
