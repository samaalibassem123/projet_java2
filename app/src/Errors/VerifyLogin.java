package Errors;

import javax.swing.*;


public class VerifyLogin {
    public static Boolean Verif(String inp1, String password) {
        if (inp1.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Fill all the Fields please", "Register Form Eroors", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
}
