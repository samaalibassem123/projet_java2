package vues.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Link extends JLabel {
    public Link(String text) {
        super("<html><u>"+text+"</u></html>");
        this.setForeground(Color.GRAY);

        //MAKE THE CURSOR POINTER
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Add HOVER EFFECT
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                setForeground(Color.GRAY);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                setForeground(Color.black);

            }
        });

        this.setOpaque(true);
        this.setVisible(true);
    }
}
