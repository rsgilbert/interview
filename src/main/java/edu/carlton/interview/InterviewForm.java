/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.carlton.interview;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author 
 */
public class InterviewForm extends JFrame {
    
    private JRadioButton yesButton = new JRadioButton("Yes");
    private JRadioButton noButton = new JRadioButton("No");
    private JLabel question = new JLabel(" Did you have any shortness of breath today?");

    public InterviewForm() {
        super("Interview");

        setLayout(new FlowLayout());
       
        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(yesButton);
        group.add(noButton);
        
               
        add(question);
        add(yesButton);
        add(noButton);

        //Register a listener for the radio buttons.
        var interviewQuestionActionListener = new InterviewQuestionActionListener();
        yesButton.addActionListener(interviewQuestionActionListener);
        noButton.addActionListener(interviewQuestionActionListener);

    }

    private class InterviewQuestionActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = "";

            if (e.getSource() == yesButton) {
                s = String.format("Field 1: %s", e.getActionCommand());
                question.setText("Do you like cheese");
            }
            if (e.getSource() == noButton) {
                s = String.format("Field 2: %s", e.getActionCommand());
                question.setText("Are you hungry?,Why didyou say no");
            }


            JOptionPane.showMessageDialog(null, s);
        }

    }

}
