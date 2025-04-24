/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.carlton.interview;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author SSG
 */
public class tuna extends JFrame {
    private JLabel item1;
    
    public tuna() {
        super("The Tuna Catalog");
        
        setLayout(new FlowLayout());
        
        item1 = new JLabel("What is your favorite fish?");
        item1.setToolTipText("Dont say Tuna!");
        add(item1);
    }
    
}
