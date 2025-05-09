package vues.windows;

import Errors.VerifHomeInputs;
import controllers.CEtudiant;
import models.Etudiant;
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
import javax.swing.text.InternationalFormatter;
import javax.swing.text.TabableView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class HomePage extends JFrame implements ActionListener {
    private Label id, prenom, nom;
    private Button add, delete, update;
    private Input Iid ,Iprenom ,Inom;
    private Table table;
    private String username;
    public HomePage(String username) {
        this.username = username;
        this.setTitle("Home");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setBackground(Color.black);

        //1. COMPONENTS
        //1.0 labels
        id = new Label("Id : ");
        nom = new Label("Name : ");
        prenom = new Label("Family name : ");
        //1.1 buttons
        add = new Button("Add");
        delete = new Button("Delete", new Color(252, 97, 132));
        update = new Button("Update", new Color(5, 252, 126));

        add.addActionListener(this);
        delete.addActionListener(this);
        update.addActionListener(this);
        //1.2 inputs
        Iid = new Input();
        Inom = new Input();
        Iprenom = new Input();
        //1.3 table

        // Data for the table
        ArrayList<Etudiant> data = CEtudiant.getStudents(username);

        table = new Table(data);

        //CONTAINERS
        InputContainer ID = new InputContainer(id, Iid);
        InputContainer NOM = new InputContainer(nom, Inom);
        InputContainer PRENOM = new InputContainer(prenom, Iprenom);

        InputsContainer inputs = new InputsContainer(ID, NOM, PRENOM);
        ButtonsContainer buttons = new ButtonsContainer(add, delete, update);

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
        String id = Iid.getText();
        String nom = Inom.getText();
        String prenom = Iprenom.getText();
        boolean VerifInputes = VerifHomeInputs.Verif(id, nom, prenom);
        if (VerifInputes){
            if (e.getSource() == add){
                Etudiant student = new Etudiant(Integer.parseInt(id), nom, prenom,username);
                CEtudiant.AddStudent(student);
            } else if (e.getSource() == delete){
                Etudiant student = new Etudiant(Integer.parseInt(id), nom, prenom,username);
                CEtudiant.DeleteStudent(student);
            } else if (e.getSource() == update){
                Etudiant student = new Etudiant(Integer.parseInt(id), nom, prenom,username);
                CEtudiant.UpdateStudent(student);
            }
            //Refresh the Home page
            this.dispose();
            new HomePage(username);
        }

    }
}
