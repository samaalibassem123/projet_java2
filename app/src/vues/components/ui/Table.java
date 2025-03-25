package vues.components.ui;

import models.Etudiant;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

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
    public Table(ArrayList<Etudiant> data) {   // Column names

        // Create the table model
        DefaultTableModel model = new DefaultTableModel(c,0);

        for (Etudiant s :data){
            Object[] studentRow = new Object[]{s.getId(), s.getNom(), s.getPrenom()};
            model.addRow(studentRow);
        }

        // Create the table
        JTable table = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        this.add(scrollPane);
    }


}
