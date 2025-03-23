package Dbconnexion;

import Errors.SQLErrors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    private final static String url = "jdbc:mysql://localhost:3306/projetjava";
    private final static String username = "root";
    private final static String password = "bassem1234";
    public static Connection getConnexion(){
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected Succesfully!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            SQLErrors.Show(e.getMessage());
            return null;
        }
    }
}