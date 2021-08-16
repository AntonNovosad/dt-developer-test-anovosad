package com.vizor.test.gallery;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class ReadPicture {

    public Component execute() {
        JPanel jPanel = new JPanel();

        File[] files = new File("assets").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName().toLowerCase();
                return pathname.isFile() &&
                        name.endsWith(".png") ||
                        name.endsWith(".jpg");
            }
        });

        jPanel.setLayout(new GridLayout(files.length / 10, 10, 1, 1));

        for (File file : files) {
            try {
                PictureDialog pictureDialog = new PictureDialog();
                ImageIcon imageIcon = new ImageIcon(ImageIO.read(file));
                JLabel label = new JLabel(imageIcon);
                label.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        pictureDialog.dialog(file.getName(), imageIcon, label);
                    }
                });
                jPanel.add(label);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return jPanel;
    }
}
