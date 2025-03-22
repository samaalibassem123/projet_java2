package vues.components.ui;

import javax.swing.*;
import java.awt.*;

public class Legend extends JLabel {
    public Legend(String text) {
        super(text);
        //SET THE FONT AND WEIGHT AND THE SIZE
        Font boldFont = new Font("Arial", Font.BOLD, 24);
        this.setFont(boldFont);

        this.setOpaque(true);
        this.setVisible(true);
    }
}
