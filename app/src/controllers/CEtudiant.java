package controllers;

import Dbconnexion.Connexion;
import Errors.SQLErrors;
import Errors.VerifHomeInputs;
import controllers.interfaces.IEtudiant;
import models.Etudiant;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CEtudiant implements IEtudiant {


    public static ArrayList<Etudiant> getStudents(String user_id){
        Connection conn = Connexion.getConnexion();
        ArrayList<Etudiant> data = new ArrayList<Etudiant>();
        if (conn != null){
            try{
                String sql = "Select * from etudiant where user_id=?";
                PreparedStatement stm = conn.prepareStatement(sql);
                stm.setString(1,user_id);
                ResultSet res = stm.executeQuery();
                while(res.next()){
                    Etudiant s = new Etudiant();
                    s.setId(res.getInt(1));
                    s.setNom(res.getString(2));
                    s.setPrenom(res.getString(3));
                    data.add(s);
                }

                return data;
            }catch (SQLException e){
                SQLErrors.Show(e.getMessage());
            }
        }
        return data;

    }

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

    static public void AddStudent(Etudiant e){
        Connection conn = Connexion.getConnexion();
        if (conn!= null){
            try{
                String sql = "Insert into etudiant values(?,?,?,?)";
                PreparedStatement stm = conn.prepareStatement(sql);
                stm.setInt(1, e.getId());
                stm.setString(2, e.getNom());
                stm.setString(3, e.getPrenom());
                stm.setString(4, e.getUsername());
                stm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student added Succesfully !","Create Student",JOptionPane.INFORMATION_MESSAGE);

            }catch (SQLException E){
                SQLErrors.Show("Id is used Try another one ! \n"+E.getMessage());

            }
        }

    }

    static public void UpdateStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();
        //SEARCH THE STUDENT AND AUTHENTICATE THE USER
        if (AuthUser(e)){
            if (AuthUser(e)){
                try {
                    String name = JOptionPane.showInputDialog("Update the student name:");
                    String prenom = JOptionPane.showInputDialog("Update the Student prenom:");
                    Boolean verif = VerifHomeInputs.Verif(name,prenom);
                    if (verif){
                        String sql = "Update etudiant set nom=? ,prenom=? where user_id=? and id=?";
                        PreparedStatement stm = conn.prepareStatement(sql);
                        stm.setString(1, name);
                        stm.setString(2, prenom);
                        stm.setString(3, e.getUsername());
                        stm.setInt(4, e.getId());
                        stm.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Student Updated Succesfully !", "Student Updation", JOptionPane.INFORMATION_MESSAGE);
                    }

                }catch (SQLException E){
                    SQLErrors.Show(E.getMessage());
                }
        }
        }
    }

    static public void DeleteStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();
        //SEARCH THE STUDENT AND AUTHENTICATE THE USER
        if (AuthUser(e)){
            if (AuthUser(e)){
                try {
                    int verif = JOptionPane.showConfirmDialog(null, "Are u sure u want to delete this Student", "Student deletion", JOptionPane.YES_NO_CANCEL_OPTION);
                    System.out.println(verif);
                    if (verif == 0){
                        String sql = "delete From etudiant where user_id=? and id=?";
                        PreparedStatement stm = conn.prepareStatement(sql);
                        stm.setString(1, e.getUsername());
                        stm.setInt(2, e.getId());
                        stm.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Student Deleted Succesfully !", "Student Deletion", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch (SQLException E){
                    SQLErrors.Show(E.getMessage());
                }
            }
        }


    }
}
