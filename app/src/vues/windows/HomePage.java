package vues.windows;

import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {
    public HomePage() {
        this.setTitle("Home");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }
}
