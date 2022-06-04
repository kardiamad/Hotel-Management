/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

public class RoomService {

    /**
     * @return the room_number
     */
    public int getRoom_number() {
        return roomNumber;
    }

    /**
     * @param room_number the room_number to set
     */
    public void setRoom_number(int room_number) {
        this.roomNumber = room_number;
    }
    private int id;
    private int roomNumber;
    private int flower;
    private String scent;
    private int towel;
    private String approved;

    public RoomService() {
    }

    public RoomService(int id, int room_number, int flower, String scent, int towel, String approved) {
        this.id = id;
        this.roomNumber = room_number;
        this.flower = flower;
        this.towel = towel;
        this.scent = scent;
        this.approved = approved;
    }

    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the flower
     */
    public int getFlower() {
        return flower;
    }

    /**
     * @param flower the flower to set
     */
    public void setFlower(int flower) {
        this.flower = flower;
    }

    /**
     * @return the towel
     */
    public int getTowel() {
        return towel;
    }

    /**
     * @param towel the towel to set
     */
    public void setTowel(int towel) {
        this.towel = towel;
    }

    /**
     * @return the scent
     */
    public String getScent() {
        return scent;
    }

    /**
     * @param scent the scent to set
     */
    public void setScent(String scent) {
        this.scent = scent;
    }

    /**
     * @return the approved
     */
    public String getApproved() {
        return approved;
    }

    /**
     * @param approved the approved to set
     */
    public void setApproved(String approved) {
        this.approved = approved;
    }

    
}
