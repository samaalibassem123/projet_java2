package vues.components.Containers.Dashboard;

import vues.components.ui.Legend;
import vues.components.ui.Table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class RightContainer extends JPanel {
    public RightContainer(Table table) {
        this.add(table);
        this.setOpaque(true);
        this.setVisible(true);
    }
}
