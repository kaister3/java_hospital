package com.company;
/*
  created by Kris Wang
  2019-04-09
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Login {

    private JPanel panel1;
    private JButton loginButton;
    private JButton resetButton;
    private JPasswordField passwordField1;
    private JTextField inputHereTextField;

    public Login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello Java");
            }
        });

        panel1.addComponentListener(new ComponentAdapter() {
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setBounds(500, 400, 600,400);
        frame.setContentPane(new Login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setVisible(true);
    }
}
