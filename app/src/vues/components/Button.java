package vues.components;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public Button(String text) {
        this.setText(text);
        this.setPreferredSize(new Dimension(300, 40));
        this.setFocusable(false);
        this.setVisible(true);
    }
}
