package Errors;

import javax.swing.*;

public class VerifRegister {
    public static Boolean Verif(String inp1, String password, String Cpassword) {
        if (inp1.equals("") || password.equals("") || Cpassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Fill all the Fields please", "Register Form Eroors", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (!password.equals(Cpassword)) {
            JOptionPane.showMessageDialog(null, "Password is not same like Cpassword", "Register Form Eroors", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
}
