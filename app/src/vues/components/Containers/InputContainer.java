package vues.components.Containers;

import vues.components.ui.Input;
import vues.components.ui.Label;

import javax.swing.*;
import java.awt.*;

public class InputContainer extends JPanel {
    public InputContainer(Label label, Input input) {

        this.setLayout(new GridLayout(2,1));

        this.add(label);
        this.add(input);

        this.setOpaque(true);
        this.setVisible(true);
    }
}
