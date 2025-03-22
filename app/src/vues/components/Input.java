package vues.components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Input extends JTextField {
    public Input() {
        this.setPreferredSize(new Dimension(300, 40));
        //PADDING
        this.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.setVisible(true);
    }
}
