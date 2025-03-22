package vues.windows;

import vues.components.Button;
import vues.components.Input;
import vues.components.Label;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
    private Button Login;

    private Label username;
    private Label password;

    private Input Input_Username;
    private Input Input_Password;

    public LoginPage() {
        //SET THE WINDOW
        this.setTitle("Login-Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 250);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        //INPUTS
        Input_Username = new Input();
        Input_Password = new Input();

        //LABELS
        username = new Label("Username : ");
        password = new Label("Password : ");

        //BUTTONS
        Login = new Button("Login");


        //ADD COMPONENTS
        this.add(username);
        this.add(Input_Username);
        this.add(password);
        this.add(Input_Password);
        this.add(Login);


        this.setVisible(true);
    }
}
