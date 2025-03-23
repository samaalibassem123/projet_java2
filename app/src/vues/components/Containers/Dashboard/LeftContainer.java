package vues.components.Containers.Dashboard;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LeftContainer extends JPanel {
    public LeftContainer(InputsContainer inputs, ButtonsContainer buttons) {
        this.setLayout(new GridLayout(3,1,10,10));
        this.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.add(inputs);
        this.add(buttons);
        this.setOpaque(true);
        this.setVisible(true);
    }
}
