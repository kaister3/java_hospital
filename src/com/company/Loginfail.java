package com.company;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loginfail extends JFrame{
    private JButton button1;
    private JPanel panel1;

    public static void main(String[] args) {
        //
    }


    public Loginfail() {
        this.setTitle("Loginfail");
        this.setBounds(500, 400, 400, 100);
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
