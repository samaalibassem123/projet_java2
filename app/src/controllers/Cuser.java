package controllers;

import Dbconnexion.Connexion;
import controllers.interfaces.IUser;
import models.User;

import java.sql.Connection;

public class  Cuser implements IUser {


    @Override
    public void RegisterUser(User user) {
       Connection conn = Connexion.getConnexion();


    }

    @Override
    public void LoginUser(User user) {
       Connection conn = Connexion.getConnexion();


    }
}
