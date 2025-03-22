package vues.windows;

import vues.components.Containers.InputContainer;
import vues.components.ui.*;
import vues.components.ui.Button;
import vues.components.ui.Label;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPage extends JFrame implements ActionListener {
    private Button Register;

    private Link LoginLink;

    private Legend legend;

    private Label username,password, Cpassword;


    private Input Input_Username, Input_Password, Input_CPassword;




    public RegisterPage() {
        //SET THE WINDOW
        this.setTitle("Register Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0,40));
        this.setSize(350,650);

        //LEGEND
        legend = new Legend("Sign Up");

        //INPUTS
        Input_Username = new Input();
        Input_Password = new Input();
        Input_CPassword = new Input();

        //LABELS
        username = new Label("Username : ");
        password = new Label("Password : ");
        Cpassword= new Label("Confirm your Password : ");

        //BUTTONS
        Register = new Button("Register");
        Register.addActionListener(this);
        //LINK
        LoginLink = new Link("Sign In Here !");
        LoginLink.addActionListener(this);
        // CONTAINERS
        InputContainer UsernameContainer = new InputContainer(username, Input_Username);
        InputContainer PasswordContainer = new InputContainer(password, Input_Password);
        InputContainer CPasswordContainer = new InputContainer(Cpassword, Input_CPassword);

        //ADD THE LEGEND
        this.add(legend);
        //ADD CONTAINERS
        this.add(UsernameContainer);
        this.add(PasswordContainer);
        this.add(CPasswordContainer);

        //ADD REGISTER BUTTON
        this.add(Register);
        //ADD THE LINK TO THE LOGIN PAGE
        this.add(LoginLink);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == LoginLink){
            this.dispose(); //CLOSE THE CURRENT WINDOW
            new LoginPage();
        }
    }
}
