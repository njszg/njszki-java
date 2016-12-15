package main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleEx extends JFrame {

    public SimpleEx(){
        initUI();
    }

    private void initUI() {
        JButton quitButton = new JButton("Quit");
        JButton showButton = new JButton("Show");
        JButton removeButton = new JButton("Remove");
        JLabel label1 = new JLabel("label1");
        JLabel label2 = new JLabel("label2");

        int a = 3;
        quitButton.addActionListener(new ClickAction(a));

        showButton.addActionListener((ActionEvent e) -> {
            System.out.println("2");
            label2.setText("pottyos");
        });

        ActionListener listener = (ActionEvent e) -> {
            System.out.println("1");
            label1.setText("labda");
        };

        showButton.addActionListener(listener);

        removeButton.addActionListener((ActionEvent e) -> {
            showButton.removeActionListener(listener);
        });



        setTitle("Valamilyen cím");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(null);
        quitButton.setBounds(10,10,100,100);
        showButton.setBounds(110,10,100,100);
        removeButton.setBounds(210,10,100,100);
        label1.setBounds(10,110,100,100);
        label2.setBounds(110,110,100,100);
        add(quitButton);
        add(showButton);
        add(removeButton);
        add(label1);
        add(label2);
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SimpleEx ex = new SimpleEx();
            ex.setVisible(true);
        });
    }

    private class ClickAction implements ActionListener {

        private int aa;

        public ClickAction(int a){
            aa = a;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(aa);
            System.exit(0);
        }
    }
}
