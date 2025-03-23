package Dbconnexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    private final static String url = "jdbc:mysql://localhost:3306/projetjava";
    private final static String username = "root";
    private final static String password = "bassem1234";
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        try (connection) {
            System.out.println("Connected Succesfully!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}