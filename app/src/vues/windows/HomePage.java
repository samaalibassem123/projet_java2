package vues.windows;

import vues.components.Containers.Dashboard.ButtonsContainer;
import vues.components.Containers.Dashboard.InputsContainer;
import vues.components.Containers.Dashboard.LeftContainer;
import vues.components.Containers.Dashboard.RightContainer;
import vues.components.Containers.InputContainer;
import vues.components.ui.Input;
import vues.components.ui.Button;
import vues.components.ui.Label;
import vues.components.ui.Table;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TabableView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener {
    private Label id, prenom, nom;
    private Button add, find, delete, update;
    private Input Iid ,Iprenom ,Inom;
    private Table table;
    public HomePage() {
        this.setTitle("Home");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());


        //1. COMPONENTS
        //1.0 labels
        id = new Label("Id : ");
        nom = new Label("Name : ");
        prenom = new Label("Family name : ");
        //1.1 buttons
        add = new Button("Add");
        find = new Button("Find", new Color(5, 145, 252));
        delete = new Button("Delete", new Color(252, 97, 132));
        update = new Button("Update", new Color(5, 252, 126));
        add.addActionListener(this);
        find.addActionListener(this);
        delete.addActionListener(this);
        update.addActionListener(this);
        //1.2 inputs
        Iid = new Input();
        Inom = new Input();
        Iprenom = new Input();
        //1.3 table

        // Data for the table
        Object[][] data = {
                {1, "John Doe", 25},
                {2, "Jane Smith", 30},
                {3, "Bob Johnson", 40}
        };
        table = new Table(data);

        //CONTAINERS
        InputContainer ID = new InputContainer(id, Iid);
        InputContainer NOM = new InputContainer(nom, Inom);
        InputContainer PRENOM = new InputContainer(prenom, Iprenom);

        InputsContainer inputs = new InputsContainer(ID, NOM, PRENOM);
        ButtonsContainer buttons = new ButtonsContainer(add, delete, update , find);

        LeftContainer leftSide = new LeftContainer(inputs, buttons);
        RightContainer rightSide = new RightContainer(table);


        //2. ADD CONTAINERS
        this.add(leftSide, BorderLayout.WEST);
        this.add(rightSide, BorderLayout.EAST);


        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
