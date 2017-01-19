package main.java;

import javax.swing.*;

/**
 * Created by Suli on 2017.01.19..
 */
public class FormX extends JFrame{
    private JTextPane textPane1;
    private JTextField textField1;
    private JButton button1;
    private JPanel almafa;

    public FormX(){
        super("My Title");

        setContentPane(almafa);

        pack();

        setVisible(true);
    }
}
