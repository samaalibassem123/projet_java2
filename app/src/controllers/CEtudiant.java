package controllers;

import Dbconnexion.Connexion;
import Errors.SQLErrors;
import controllers.interfaces.IEtudiant;
import models.Etudiant;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CEtudiant implements IEtudiant {


    public static Boolean AuthUser(Etudiant e){
        Connection conn = Connexion.getConnexion();
        if (conn != null){
            try{
                String query = "Select * from etudiant where id=? and nom=? and prenom=?";
                PreparedStatement stm = conn.prepareStatement(query);
                stm.setInt(1, e.getId());
                stm.setString(2,e.getNom());
                stm.setString(3, e.getPrenom());
                ResultSet res = stm.executeQuery();
                res.next();
                if (res.getRow() != 0){
                    String sql = "Select * from etudiant where id=? and nom=? and prenom=? and user_id=?";
                    PreparedStatement searchStm = conn.prepareStatement(sql);
                    searchStm.setInt(1, e.getId());
                    searchStm.setString(2,e.getNom());
                    searchStm.setString(3, e.getPrenom());
                    searchStm.setString(4, e.getUsername());
                    ResultSet searchRes = searchStm.executeQuery();
                    searchRes.next();
                    if (searchRes.getRow() != 0){
                        return true;
                    }else {
                        SQLErrors.Show("Access Denied you D'ont have the rights To see or edit this student !");
                        return false;
                    }
                }else {
                    SQLErrors.Show("Student unavailable check the id , nom or prenom fields !");
                    return false;
                }

            }catch (SQLException E){
                SQLErrors.Show(E.getMessage());
                return false;
            }
        }
        return false;
    }

    static public void AddStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();
    }


    static public void FindStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();
    }


    static public void UpdateStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();
        //SEARCH THE STUDENT AND AUTHENTICATE THE USER
        if (AuthUser(e)){
            try {
                String sql = "Update etudiant set id=? ,nom=? ,prenom=? where user_id=?";
                PreparedStatement stm = conn.prepareStatement(sql);
                stm.setInt(1,e.getId());
                stm.setString(2,e.getNom());
                stm.setString(3,e.getPrenom());
                stm.setString(4,e.getUsername());
                stm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student Updated Succesfully !", "User Updation", JOptionPane.INFORMATION_MESSAGE);
            }catch (SQLException E){
                SQLErrors.Show(E.getMessage());
            }


        }
        }





    static public void DeleteStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();

    }
}
