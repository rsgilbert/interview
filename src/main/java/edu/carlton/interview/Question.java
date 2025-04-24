/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.carlton.interview;

/**
 *
 * @author 
 */
public class Question {
    private int id;
    private String question;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getLeftId() {
        return leftId;
    }

    public void setLeftId(int leftId) {
        this.leftId = leftId;
    }

    public int getRightId() {
        return rightId;
    }

    public void setRightId(int rightId) {
        this.rightId = rightId;
    }
    
    private int leftId;
    private int rightId;
    
    public Question(){
        
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", question=" + question + ", leftId=" + leftId + ", rightId=" + rightId + '}';
    }
    
    
    
    
}
