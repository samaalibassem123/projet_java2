package vues.components.ui;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    public Label(String text) {
        this.setText(text);
        Font font = new Font("Arial", Font.BOLD, 12);
        this.setFont(font);
        this.setOpaque(true);
        this.setVisible(true);
    }
}
