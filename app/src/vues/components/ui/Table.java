package vues.components.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Table extends JPanel {
    private String[] c= {"ID", "Name", "Age"};

    public Table() {   // Column names

        // Create the table model
        DefaultTableModel model = new DefaultTableModel(null, c);

        // Create the table
        JTable table = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        this.add(scrollPane);
    }
    public Table(Object[][] data) {   // Column names

        // Create the table model
        DefaultTableModel model = new DefaultTableModel(data, c);

        // Create the table
        JTable table = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        this.add(scrollPane);
    }


}
