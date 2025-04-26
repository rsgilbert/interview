/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.carlton.interview;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author SSG
 */
public class ShortnessOfBreath {
     private int id;
    private int patientId;
    private Date interviewDate;
    private Time interviewTime;
    private boolean hasShortnessOfBreath;
    private String severityLevel;
    private boolean moreShortThanYesterday;
    private boolean deleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public Time getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(Time interviewTime) {
        this.interviewTime = interviewTime;
    }

    public boolean isHasShortnessOfBreath() {
        return hasShortnessOfBreath;
    }

    public void setHasShortnessOfBreath(boolean hasShortnessOfBreath) {
        this.hasShortnessOfBreath = hasShortnessOfBreath;
    }

    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public boolean isMoreShortThanYesterday() {
        return moreShortThanYesterday;
    }

    public void setMoreShortThanYesterday(boolean moreShortThanYesterday) {
        this.moreShortThanYesterday = moreShortThanYesterday;
    }
    
    

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
