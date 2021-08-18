package com.vizor.test;

import com.vizor.test.gallery.GalleryLabel;
import com.vizor.test.gallery.MenuBar;
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
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - WIDTH / 2, dim.height / 2 - HEIGHT / 2);
        frame.setVisible(true);

        GalleryLabel label = new GalleryLabel();
        ReadPicture picture = new ReadPicture();
        SaveFile saveFiles = new SaveFile();
        MenuBar menuBar = new MenuBar();

        frame.setJMenuBar(menuBar.menu());
        frame.add(label.label(), BorderLayout.NORTH);
        frame.add(picture.read(), BorderLayout.CENTER);
        frame.add(saveFiles.save(), BorderLayout.SOUTH);

        frame.pack();
    }
}
