package vues.components.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Button extends JButton {
    public Button(String text) {
        this.setText(text);
        this.setPreferredSize(new Dimension(300, 40));
        this.setFocusable(false);
        //REMOVE THE DEFAULT PAINTING
        this.setBorderPainted(false);
        //BACKGROUND COLOR
        this.setBackground(Color.BLACK);
        //TEXT COLOR
        this.setForeground(Color.WHITE);

        //MAKE THE CURSOR POINTER
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Add HOVER EFFECT
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(32, 32, 32, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(0, 0, 0, 255));

            }
        });

        this.setOpaque(true);
        this.setVisible(true);
    }

    public Button(String text, Color color) {
        this.setText(text);
        this.setPreferredSize(new Dimension(300, 40));
        this.setFocusable(false);
        //REMOVE THE DEFAULT PAINTING
        this.setBorderPainted(false);
        //BACKGROUND COLOR
        this.setBackground(color);
        //TEXT COLOR
        this.setForeground(Color.WHITE);

        //MAKE THE CURSOR POINTER
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));



        this.setOpaque(true);
        this.setVisible(true);
    }

}
