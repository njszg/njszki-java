package main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;

public class SimpleEx extends JFrame {

    public SimpleEx(){
        initUI();
    }

    private void initUI() {
        JButton quitButton = new JButton("Quit");
        JButton otherButton = new JButton("Other");
        JButton thirdButton = new JButton("Third");
        JButton fourthButton = new JButton("Fourth");
        JButton fifthButton = new JButton("Fifth");
        JButton sixthButton = new JButton("Sixth");

        quitButton.setToolTipText("Ezzel ki fogsz lépni.");

        quitButton.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });

        createLayout(quitButton, otherButton, thirdButton, fourthButton, fifthButton, sixthButton);

        ImageIcon icon = new ImageIcon("mario.jpg");
        setIconImage(icon.getImage());
        setTitle("Valamilyen cím");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //quitButton.setSize(200, 200);

        //pack();
    }

    private void createLayout(JComponent... arg){
        Container pane = getContentPane();


        setLayout(null);
        arg[0].setBounds(10,10,100,100);
        add(arg[0]);


        /*GridLayout gl = new GridLayout(5,1);
        pane.setLayout(gl);

        JPanel panel = new JPanel();

        pane.add(arg[0]);
        pane.add(panel);
        pane.add(arg[1]);
        pane.add(arg[2]);

        GridLayout gl2 = new GridLayout(1,5);
        panel.setLayout(gl2);

        panel.add(arg[3]);
        panel.add(arg[4]);
        panel.add(arg[5]);


        /*GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createParallelGroup()
                .addComponent(arg[0])
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(arg[1])
                        .addComponent(arg[2]))
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
                .addComponent(arg[2])
        );*/

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SimpleEx ex = new SimpleEx();
            ex.setVisible(true);
        });

    }
}
