package controllers.interfaces;

import models.User;

public interface IUser {
    static void  RegisterUser(User user){};
    static void  LoginUser(User user){};
}
