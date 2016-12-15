package main.java;

import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {

    private DrawPanel panel;

    public DrawFrame() {

        initUI();
    }

    private void initUI() {

        panel = new DrawPanel();
        add(panel);

        setSize(350, 250);
        setTitle("Points");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            DrawFrame ex = new DrawFrame();
            ex.setVisible(true);
        });
    }
}
