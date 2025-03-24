package controllers;

import Dbconnexion.Connexion;
import Errors.SQLErrors;
import com.mysql.cj.protocol.Resultset;
import models.User;

import javax.swing.*;
import java.sql.*;

public class  Cuser  {



    static public Boolean RegisterUser(User user) {
       Connection conn = Connexion.getConnexion();
       if (conn != null){
           try{
               String query = "Insert into user (user_name,password) values (?,?);";
               PreparedStatement stm = conn.prepareStatement(query);
               stm.setString(1,user.getUsername());
               stm.setString(2,user.getPassword());
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
