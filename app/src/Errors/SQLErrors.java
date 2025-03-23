package Errors;

import javax.swing.*;
import java.sql.SQLException;

public class SQLErrors  {
    public static void Show(String msg){
        JOptionPane.showMessageDialog(null ,msg, "SQLERROR", JOptionPane.ERROR_MESSAGE);
    }
}
