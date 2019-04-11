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

    private static JFrame frame;
    private JPanel panel1;
    private JButton loginButton;
    private JButton resetButton;
    private JPasswordField passwordField1;
    private JTextField inputHereTextField;
    private JButton exitButton;
    private JRadioButton patientRadioButton;
    private JRadioButton doctorRadioButton;

    public Login() {

        panel1.addComponentListener(new ComponentAdapter() {
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                log();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordField1.setText("");
                inputHereTextField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        frame = new JFrame("Login");
        frame.setBounds(600, 300, 600,400);
        frame.setContentPane(new Login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void log() {
        String username = inputHereTextField.getText();
        String password = new String(passwordField1.getPassword());
        if (patientRadioButton.isSelected()) {
            System.out.println("I'm a patient");
            System.out.println("Hello Java");
            asd faildialog = new asd();
            faildialog.setLocation(600, 300);
            faildialog.pack();
            faildialog.setVisible(true);
        }
        /* System.out.println(username + password); */


    }
}
