/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.carlton.interview;

import java.util.Date;

/**
 *
 * @author SSG
 */
public class Patient {
    private int id;
    private String lastName;
    private String previousLastName;
    private String firstName;
    private String homeAddress;
    private String homeCity;
    private String homeState;
    private String homeZip;
    private String country;
    private String citizenship;
    private String mobilePhone;
    private String emergencyPhoneNumber;
    private String emailAddress;
    private String socialSecurityNumber;
    private Date dateOfBirth;
    private String gender;
    private String ethnicAssociation;
    private String maritalStatus;
    private String currentPrimaryHCP;
    private String comments;
    private String nextOfKin;
    private String nextOfKinRelationship;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPreviousLastName() {
        return previousLastName;
    }

    public void setPreviousLastName(String previousLastName) {
        this.previousLastName = previousLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    public String getHomeZip() {
        return homeZip;
    }

    public void setHomeZip(String homeZip) {
        this.homeZip = homeZip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmergencyPhoneNumber() {
        return emergencyPhoneNumber;
    }

    public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
        this.emergencyPhoneNumber = emergencyPhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthnicAssociation() {
        return ethnicAssociation;
    }

    public void setEthnicAssociation(String ethnicAssociation) {
        this.ethnicAssociation = ethnicAssociation;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getCurrentPrimaryHCP() {
        return currentPrimaryHCP;
    }

    public void setCurrentPrimaryHCP(String currentPrimaryHCP) {
        this.currentPrimaryHCP = currentPrimaryHCP;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getNextOfKinRelationship() {
        return nextOfKinRelationship;
    }

    public void setNextOfKinRelationship(String nextOfKinRelationship) {
        this.nextOfKinRelationship = nextOfKinRelationship;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", lastName=" + lastName + ", previousLastName=" + previousLastName + ", firstName=" + firstName + ", homeAddress=" + homeAddress + ", homeCity=" + homeCity + ", homeState=" + homeState + ", homeZip=" + homeZip + ", country=" + country + ", citizenship=" + citizenship + ", mobilePhone=" + mobilePhone + ", emergencyPhoneNumber=" + emergencyPhoneNumber + ", emailAddress=" + emailAddress + ", socialSecurityNumber=" + socialSecurityNumber + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", ethnicAssociation=" + ethnicAssociation + ", maritalStatus=" + maritalStatus + ", currentPrimaryHCP=" + currentPrimaryHCP + ", comments=" + comments + ", nextOfKin=" + nextOfKin + ", nextOfKinRelationship=" + nextOfKinRelationship + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        return this.id == other.id;
    }
    
    
    
    
    
}
