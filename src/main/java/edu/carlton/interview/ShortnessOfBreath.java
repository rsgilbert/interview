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
    private Date interviewDate = new Date(0);
    private Time interviewTime = new Time(0,0,0);
    private boolean hasShortnessOfBreath = false;
    private String severityLevel = "";
    private boolean moreShortThanYesterday = false;
    private boolean deleted = false;

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
        if(interviewDate == null) {
            return new Date();
        }
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public Time getInterviewTime() {
        if(interviewTime == null) {
            return new Time(0,0,0);
        }
        return interviewTime;
    }

    public void setInterviewTime(Time interviewTime) {
        if(interviewTime == null) {
            interviewTime = new Time(0,0,0);
        }
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
