package vues.components.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Table extends JTable {
    public Table() {   // Column names
        String[] columnNames = {"ID", "Name", "Age"};

        // Data for the table
        Object[][] data = {
                {1, "John Doe", 25},
                {2, "Jane Smith", 30},
                {3, "Bob Johnson", 40}
        };

        // Create the table model
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create the table
        JTable table = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
    }


}
