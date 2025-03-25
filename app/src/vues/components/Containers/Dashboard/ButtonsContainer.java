package vues.components.Containers.Dashboard;

import vues.components.ui.Button;

import javax.swing.*;
import java.awt.*;

public class ButtonsContainer extends JPanel {
    public ButtonsContainer(Button b1,Button b2, Button b3) {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setPreferredSize(new Dimension(800, 200));
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.setOpaque(true);
        this.setVisible(true);
    }
}
