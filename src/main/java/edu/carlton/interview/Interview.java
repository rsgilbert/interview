/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.carlton.interview;


import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author SSG
 */
public class Interview {
    
    public static void main(String[] args) {
        var gilbertTuna = new InterviewForm();
        gilbertTuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gilbertTuna.setSize(275,180);
        gilbertTuna.setVisible(true);
                
    }

//    public static void main(String[] args) {
//        System.out.println("Hello Uganda!");
//        
//        String fn = JOptionPane.showInputDialog("Enter first number");
//        String sn = JOptionPane.showInputDialog("Enter second number");
//        
//        int num1 = Integer.parseInt(fn);
//        int num2 = Integer.parseInt(sn);
//        
//        int sum = num1 + num2;
//        
//        JOptionPane.showMessageDialog(null, "The answer is " + sum, "SUM", JOptionPane.PLAIN_MESSAGE);
//        
//    }
}
