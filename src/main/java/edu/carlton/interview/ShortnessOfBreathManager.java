/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.carlton.interview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SSG
 */
public class ShortnessOfBreathManager {

    public static List<ShortnessOfBreath> getShortnessOfBreaths() {
        List<ShortnessOfBreath> shortnessOfBreaths = new ArrayList<>();

        var resultSet = DbUtils.executeQuery("SELECT * FROM shortnessofbreath WHERE deleted = false");
        try {
            while (resultSet.next()) {
                var s = new ShortnessOfBreath();
                s.setId(resultSet.getInt("id"));
                s.setPatientId(resultSet.getInt("patientId"));
                s.setInterviewDate(resultSet.getDate("interviewDate"));
                s.setInterviewTime(resultSet.getTime("interviewTime"));
                s.setSeverityLevel(resultSet.getString("severityLevel"));
                s.setHasShortnessOfBreath(resultSet.getBoolean("hasShortnessOfBreath"));
                s.setMoreShortThanYesterday(resultSet.getBoolean("moreShortThanYesterday"));
                System.out.println(s);
                shortnessOfBreaths.add(s);
            }
            return shortnessOfBreaths;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ShortnessOfBreath getShortnessOfBreathById(int id) {
        var resultSet = DbUtils.executeQuery("SELECT * FROM shortnessofbreath WHERE id = " + id);
        try {
            boolean hasResult = resultSet.next();
            if (!hasResult) {
                throw new RuntimeException("No shortnessofbreath found with id " + id);
            }

            var s = new ShortnessOfBreath();
            s.setId(resultSet.getInt("id"));
            s.setPatientId(resultSet.getInt("patientId"));
            s.setInterviewDate(resultSet.getDate("interviewDate"));
            s.setInterviewTime(resultSet.getTime("interviewTime"));
            s.setSeverityLevel(resultSet.getString("severityLevel"));
            s.setHasShortnessOfBreath(resultSet.getBoolean("hasShortnessOfBreath"));
            s.setMoreShortThanYesterday(resultSet.getBoolean("moreShortThanYesterday"));
            return s;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ShortnessOfBreath save(ShortnessOfBreath shortnessOfBreath) {
        var connection = DbUtils.getConnection();
        try {
            var sql = """
                UPDATE shortnessofbreath 
                    SET patientId = ?,
                     interviewDate = ?,
                     interviewTime = ?,
                     severityLevel = ?,
                     hasShortnessOfBreath = ?,
                     moreShortThanYesterday = ?
                WHERE id = ?
                """;

            var statement = connection.prepareStatement(sql);

            statement.setInt(1, shortnessOfBreath.getPatientId());
            statement.setDate(2, new java.sql.Date(shortnessOfBreath.getInterviewDate().getTime()));
            statement.setTime(3, shortnessOfBreath.getInterviewTime());
            statement.setString(4, shortnessOfBreath.getSeverityLevel());
            statement.setBoolean(5, shortnessOfBreath.isHasShortnessOfBreath());
            statement.setBoolean(6, shortnessOfBreath.isMoreShortThanYesterday());
            statement.setInt(7, shortnessOfBreath.getId());
            statement.executeUpdate();

            return getShortnessOfBreathById(shortnessOfBreath.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static ShortnessOfBreath insert() {
        var connection = DbUtils.getConnection();
        try {
            var sql = """
                INSERT INTO shortnessofbreath () values ();
                      """;

            var statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();

            int id = rs.getInt(1);
            System.out.println("Id is " + id);

            return getShortnessOfBreathById(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void deleteById(int id) {
        var connection = DbUtils.getConnection();
        try {
            var sql = """
                UPDATE shortnessofbreath 
                    SET deleted = true
                WHERE id = ?
                """;

            var statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
