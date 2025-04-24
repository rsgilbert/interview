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
        
    }
    
    
    
}
