package com.vizor.test.gallery;

import javax.swing.*;
import java.awt.*;

public class GalleryLabel {

    public Component label() {
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("Pictures Gallery");
        Font font = new Font("Verdana", Font.BOLD, 15);
        jPanel.add(jLabel);
        jLabel.setFont(font);
        return jPanel;
    }
}
