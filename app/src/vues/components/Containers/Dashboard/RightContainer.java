package vues.components.Containers.Dashboard;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class RightContainer extends JScrollPane {
    public RightContainer() {
        // Column names
        String[] columnNames = {"ID", "Name", "prenom"};

        // Data for the table
        Object[][] data = {
                {1, "John ", "Doe"},
                {2, "Jane ", "Smith"},
                {3, "Bob ", "Johnson"}
        };

        // Create the table model
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create the table
        JTable table = new JTable(model);
        table.setOpaque(true);
        table.setVisible(true);
        // Add the table to a scroll pane
        this.add(table);
        this.setOpaque(true);
        this.setVisible(true);
    }
}
