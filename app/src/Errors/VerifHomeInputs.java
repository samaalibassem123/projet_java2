package Errors;

import javax.swing.*;

public class VerifHomeInputs {
    public static Boolean Verif(String name, String prenom){
        if (name.equals("") || prenom.equals("")) {
            JOptionPane.showMessageDialog(null, "try Again and Fill all the Fields please", "Home fields Eroors", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    public static Boolean Verif(String id, String name, String prenom){
        if (id.equals("") || name.equals("") || prenom.equals("")) {
            JOptionPane.showMessageDialog(null, "Fill all the Fields please", "Home fields Eroors", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try {
            Integer.parseInt(id);
            return true;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Id Should be a number \n"+e.getMessage(), "Home fields Eroors", JOptionPane.WARNING_MESSAGE);
            return false;
        }

    }
}
