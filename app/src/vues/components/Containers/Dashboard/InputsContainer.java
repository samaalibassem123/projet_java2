package vues.components.Containers.Dashboard;

import vues.components.Containers.InputContainer;

import javax.swing.*;
import java.awt.*;

public class InputsContainer extends JPanel {
    public InputsContainer(InputContainer inp1, InputContainer inp2, InputContainer inp3) {
        this.setLayout(new GridLayout(3, 1));
        this.add(inp1);
        this.add(inp2);
        this.add(inp3);
        this.setOpaque(true);
        this.setVisible(true);
    }
}
