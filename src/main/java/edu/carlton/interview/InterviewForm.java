/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.carlton.interview;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
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

    private final JRadioButton yesButton = new JRadioButton("Yes");
    private final JRadioButton noButton = new JRadioButton("No");
    private final JLabel question = new JLabel(" Did you have any shortness of breath today?");

    private final List<Question> questions = LoadQuestions.loadQuestions();
    private Question currentQuestion;

    public InterviewForm() {
        super("Interview");

        setLayout(new FlowLayout());

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(yesButton);
        group.add(noButton);

        //Register a listener for the radio buttons.
        var interviewQuestionActionListener = new InterviewQuestionActionListener();
        yesButton.addActionListener(interviewQuestionActionListener);
        noButton.addActionListener(interviewQuestionActionListener);

        add(question);
        add(yesButton);
        add(noButton);

        currentQuestion = questions.get(0);
        question.setText(currentQuestion.getQuestion());

    }

    private class InterviewQuestionActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = "";

            if (e.getSource() == yesButton) {
                if (currentQuestion.getId() == 0) {
                    return;
                }
//                Question nextQuestion = questions.(WIDTH) 
//                for(int i = 0; i < questions.size(); i++) {
                //                    if()
                //                }
//            );
//               
            }

            if (e.getSource() == noButton) {
            }
        }

    }

}
