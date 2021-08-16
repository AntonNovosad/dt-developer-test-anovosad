package com.vizor.test;

import com.vizor.test.gallery.GalleryLabel;
import com.vizor.test.gallery.ReadPicture;
import com.vizor.test.gallery.SaveFile;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static final int WIDTH = 1024;
    private static final int HEIGHT = 768;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main()::run);
    }

    public void run() {
        JFrame frame = new JFrame("DT Developer Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        GalleryLabel label = new GalleryLabel();
        ReadPicture picture = new ReadPicture();
        SaveFile saveFiles = new SaveFile();

        frame.add(label.label(), BorderLayout.NORTH);
        frame.add(picture.execute(), BorderLayout.CENTER);
        frame.add(saveFiles.execute(), BorderLayout.SOUTH);

        frame.pack();
    }
}
