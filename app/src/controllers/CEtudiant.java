package controllers;

import Dbconnexion.Connexion;
import controllers.interfaces.IEtudiant;
import models.Etudiant;

import java.sql.Connection;

public class CEtudiant implements IEtudiant {

    static public void AddStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();
    }


    static public void FindStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();
    }


    static public void UpdateStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();


    }


    static public void DeleteStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();

    }
}
