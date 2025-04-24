/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.carlton.interview;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

/**
 *
 * @author SSG
 */
public class Mole extends JFrame {

    private JTextField question1;
    private JTextField question2;
    private JTextField question3;
    private JPasswordField password;

    public Mole() {
        super("Questions");

        setLayout(new FlowLayout());

        question1 = new JTextField(10);
        add(question1);

        question2 = new JTextField("Who is your girlfriend");
        add(question2);

        question3 = new JTextField("Do you love her? Yes", 20);
        question3.setEditable(false);
        add(question3);

        password = new JPasswordField("Your password");
        add(password);

        var moleActionListener = new MoleActionListener();
        question1.addActionListener(moleActionListener);
        question2.addActionListener(moleActionListener);
        question3.addActionListener(moleActionListener);
        password.addActionListener(moleActionListener);

    }

    private class MoleActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = "";

            if (e.getSource() == question1) {
                s = String.format("Field 1: %s", e.getActionCommand());
            }
            if (e.getSource() == question2) {
                s = String.format("Field 2: %s", e.getActionCommand());
            }
            if (e.getSource() == question3) {
                s = String.format("Field 3: %s", e.getActionCommand());
            }
            if (e.getSource() == password) {
                s = String.format("Password: %s", e.getActionCommand());
            }
            
            JOptionPane.showMessageDialog(null, s);
        }

    }

}
