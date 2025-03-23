package controllers;

import Dbconnexion.Connexion;
import controllers.interfaces.IEtudiant;
import models.Etudiant;

import java.sql.Connection;

public class CEtudiant implements IEtudiant {
    @Override
    public void AddStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();
    }

    @Override
    public void FindStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();
    }

    @Override
    public void UpdateStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();


    }

    @Override
    public void DeleteStudent(Etudiant e) {
        Connection conn = Connexion.getConnexion();


    }
}
