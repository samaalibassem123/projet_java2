package controllers;

import Dbconnexion.Connexion;
import Errors.SQLErrors;
import com.mysql.cj.protocol.Resultset;
import models.User;

import javax.swing.*;
import java.sql.*;

public class  Cuser{

    static public Boolean RegisterUser(User user) {
       Connection conn = Connexion.getConnexion();
       if (conn != null){
           try{
               String query = "Insert into user (user_name,password) values (?,?);";
               PreparedStatement stm = conn.prepareStatement(query);
               stm.setString(1,user.getUsername());
               stm.setString(2,user.getPassword());
               stm.executeUpdate();
               JOptionPane.showMessageDialog(null, "Created Succesfully !", "Register validation", JOptionPane.INFORMATION_MESSAGE);
               return true;
           }catch (SQLException e){
               SQLErrors.Show("Username Existe Deja");
               return false;
           }
       }
       return false;
    }


    static public Boolean LoginUser(User user) {
       Connection conn = Connexion.getConnexion();
       if (conn != null){
           try {
               String query = "Select * from user Where user_name=? and password=?";
               PreparedStatement stm = conn.prepareStatement(query);
               stm.setString(1, user.getUsername());
               stm.setString(2, user.getPassword());
               ResultSet res = stm.executeQuery();
               res.next();
               if (res.getRow() != 0){
                   return true;
               }else {
                   SQLErrors.Show("Username Or password incorrect !");
                   return false;
               }
           }catch (SQLException e){
               SQLErrors.Show(e.getMessage());
               return false;
           }
       }
       return false;
    }
}
