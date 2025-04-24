/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.carlton.interview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SSG
 */
public class LoadQuestions {

    

    public static List<Question> loadQuestions() {
        List<Question> questions = new ArrayList<>();
        String connectionString = "jdbc:mysql://localhost:3306/patient?useSSL=false&user=efris&password=efris";
        try {
            Connection connection = DriverManager.getConnection(connectionString);
            Statement statement = connection.createStatement();
            var resultSet = statement.executeQuery("SELECT * FROM shortness_of_breath_questions");
            while (resultSet.next()) {
                Question q = new Question();
                q.setId(resultSet.getInt("id"));
                q.setLeftId(resultSet.getInt("left_id"));
                q.setRightId(resultSet.getInt("right_id"));
                q.setQuestion(resultSet.getString("question"));
                System.out.println(q);
                questions.add(q);
            }

        } catch (SQLException e) {
            System.err.println("Failed to connect to database. " + e.getMessage());
        }
        
        return questions;
    }

}
