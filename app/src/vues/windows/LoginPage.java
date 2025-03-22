package vues.windows;

import models.User;
import vues.components.*;
import vues.components.Button;
import vues.components.Label;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
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
        //LINK
        RegisterLink = new Link("Sign Up Here !");
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
}
