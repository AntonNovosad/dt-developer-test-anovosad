package com.vizor.test.gallery;

import javax.swing.*;
import java.awt.*;

public class PictureDialog {

    public Component dialog(String name, ImageIcon imageIcon, JLabel label) {
        JDialog jDialog = new JDialog();
        jDialog.setTitle(name);
        jDialog.setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());
        jDialog.add(label);
        jDialog.setVisible(true);
        return jDialog;
    }
}
