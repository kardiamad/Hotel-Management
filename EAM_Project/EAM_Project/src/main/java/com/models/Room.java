/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

public class Room {
    private int number;
    private int bedroom;
    private int bathroom;
    private String phone;
    private int tv;
    private String additionalServices;
    private String vacant;
    private int userId;
    private String userFName;
    private String userLName;
    private String userEmail;
    private String userPhone;

    public Room(int number, int bedroom, int bathroom, String phone, int tv, String additionalServices, String vacant, int userId, String userFName, String userLName, String userEmail, String userPhone) {
        this.number = number;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.phone = phone;
        this.tv = tv;
        this.additionalServices = additionalServices;
        this.vacant = vacant;
        this.userId = userId;
        this.userFName = userFName;
        this.userLName = userLName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
    }

    public Room(int number, int bedroom, int bathroom, String phone, int tv, String vacant) {
        this.number = number;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.phone = phone;
        this.tv = tv;
        this.vacant = vacant;
    }

    public Room() {
    }

    public Room(int number, String vacant, int userId, String userFName, String userLName, String userEmail, String userPhone) {
        this.number = number;
        this.vacant = vacant;
        this.userId = userId;
        this.userFName = userFName;
        this.userLName = userLName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
    }

       

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the bedroom
     */
    public int getBedroom() {
        return bedroom;
    }

    /**
     * @param bedroom the bedroom to set
     */
    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    /**
     * @return the bathroom
     */
    public int getBathroom() {
        return bathroom;
    }

    /**
     * @param bathroom the bathroom to set
     */
    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    /**
     * @return the tv
     */
    public int getTv() {
        return tv;
    }

    /**
     * @param tv the tv to set
     */
    public void setTv(int tv) {
        this.tv = tv;
    }

    /**
     * @return the flower
     */
    public String getAdditionalServices() {
        return additionalServices;
    }

    /**
     * @param additionalServices the state of additionalServices to set
     */
    public void setAdditionalServices(String additionalServices) {
        this.additionalServices = additionalServices;
    }
    
    /**
     * @return the vacant
     */
    public String getVacant() {
        return vacant;
    }

    /**
     * @param vacant the vacant to set
     */
    public void setVacant(String vacant) {
        this.vacant = vacant;
    }

    /**
     * @return the userId
     */
    public int getUser_id() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUser_id(int userId) {
        this.userId = userId;
    }

    /**
     * @return the userFName
     */
    public String getUser_FName() {
        return userFName;
    }

    /**
     * @param userFName the userFName to set
     */
    public void setUser_FName(String userFName) {
        this.userFName = userFName;
    }

    /**
     * @return the userLName
     */
    public String getUser_LName() {
        return userLName;
    }

    /**
     * @param userLName the userLName to set
     */
    public void setUser_LName(String userLName) {
        this.userLName = userLName;
    }

    /**
     * @return the userPhone
     */
    public String getUser_phone() {
        return userPhone;
    }

    /**
     * @param userPhone the userPhone to set
     */
    public void setUser_phone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * @return the userEmail
     */
    public String getUser_email() {
        return userEmail;
    }

    /**
     * @param userEmail the userEmail to set
     */
    public void setUser_email(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
