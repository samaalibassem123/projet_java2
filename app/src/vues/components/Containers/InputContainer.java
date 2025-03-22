package vues.components.Containers;

import javax.swing.*;
import java.awt.*;

public class InputContainer extends JPanel {
    public InputContainer(JLabel label, JTextField input) {
        this.setLayout(new GridLayout(2,1));

        this.add(label);
        this.add(input);

        this.setOpaque(true);
        this.setVisible(true);
    }
}
