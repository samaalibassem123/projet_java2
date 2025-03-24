package controllers;

import Dbconnexion.Connexion;
import Errors.SQLErrors;
import models.User;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class  Cuser  {



    static public Boolean RegisterUser(User user) {
       Connection conn = Connexion.getConnexion();
       if (conn != null){
           try{
               String query = "Insert into user values(?,?,?);";
               PreparedStatement stm = conn.prepareStatement(query);
               stm.setInt(1, user.getUserId());
               stm.setString(2,user.getUsername());
               stm.setString(3,user.getPassword());
               stm.executeUpdate();
               JOptionPane.showMessageDialog(null, "Created Succesfully !", "Register validation", JOptionPane.PLAIN_MESSAGE);
               return true;
           }catch (SQLException e){
               SQLErrors.Show(e.getMessage());
               return false;
           }
       }
       return false;
    }


    /*static public Boolean LoginUser(User user) {
       Connection conn = Connexion.getConnexion();
    }*/
}
