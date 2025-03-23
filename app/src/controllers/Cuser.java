package controllers;

import Dbconnexion.Connexion;
import controllers.interfaces.IUser;
import models.User;

import java.sql.Connection;

public class  Cuser implements IUser {



    static public void RegisterUser(User user) {
       Connection conn = Connexion.getConnexion();
       
    }


    static public void LoginUser(User user) {
       Connection conn = Connexion.getConnexion();
    }
}
