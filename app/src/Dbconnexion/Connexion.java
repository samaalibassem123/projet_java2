package Dbconnexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/projetjava";
        String username = "root";
        String password = "bassem1234";
        Connection connection = DriverManager.getConnection(url, username, password);
        try (connection) {
            System.out.println("Connected Succesfully!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}