package controllers.interfaces;

import models.User;

public interface IUser {
    void  RegisterUser(User user);
    void  LoginUser(User user);
}
