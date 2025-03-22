package vues.windows;

import vues.components.Containers.InputContainer;
import vues.components.ui.*;
import vues.components.ui.Button;
import vues.components.ui.Label;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
    private Button Login;


    private Link RegisterLink;
    private Legend legend;

    private Label username;
    private Label password;

    private Input Input_Username;
    private Input Input_Password;



    public LoginPage() {
        //SET THE WINDOW
        this.setTitle("Login Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0,40));
        this.setSize(350,500);

        //LEGEND
        legend = new Legend("Login");

        //INPUTS
        Input_Username = new Input();
        Input_Password = new Input();

        //LABELS
        username = new Label("Username : ");
        password = new Label("Password : ");

        //BUTTONS
        Login = new Button("Login");
        Login.addActionListener(this);
        //LINK
        RegisterLink = new Link("Sign Up Here !");
        RegisterLink.addActionListener(this);

        // CONTAINERS
        InputContainer UsernameContainer = new InputContainer(username, Input_Username);
        InputContainer PasswordContainer = new InputContainer(password, Input_Password);

        //ADD THE LEGEND
        this.add(legend);
        //ADD CONTAINERS
        this.add(UsernameContainer);
        this.add(PasswordContainer);

       //LOGIN BUTTON
        this.add(Login);
        //ADD THE LINK TO REGISTER PAGE
        this.add(RegisterLink);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == RegisterLink){
            this.dispose(); //CLOSE THE CUURENT WINDOW
            new RegisterPage();
        }
    }
}
