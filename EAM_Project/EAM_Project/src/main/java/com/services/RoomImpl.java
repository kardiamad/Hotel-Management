/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.Room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;

@WebService(endpointInterface="com.interfaces.IRoom")
public class RoomImpl {
    public List<Room> getRooms(){
        Room room = null;
        UserImpl userImpl = new UserImpl();
        List<Room> listRooms = new ArrayList<Room>();
        try {
            Connection con = userImpl.initiateDBConnection();
            String sql = "SELECT * FROM eamproject.room";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                room = new Room(rs.getInt("number"), rs.getInt("bedroom"), rs.getInt("bathroom"), rs.getString("phone"), rs.getInt("tv"), rs.getString("additional_services"),
                rs.getString("vacant"), rs.getInt("user_id"), rs.getString("user_fname"), rs.getString("user_lname"), rs.getString("user_email"), rs.getString("user_phone"));
                listRooms.add(room);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listRooms;
    }
    
    public List<Room> getVacantRooms(){
        Room room = null;
        UserImpl userImpl = new UserImpl();
        List<Room> listRooms = new ArrayList<Room>();
        try {
            Connection con = userImpl.initiateDBConnection();
            String sql = "SELECT * FROM eamproject.room where vacant = 'Y'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                room = new Room(rs.getInt("number"), rs.getInt("bedroom"), rs.getInt("bathroom"), rs.getString("phone"), rs.getInt("tv"), rs.getString("additional_services"),
                rs.getString("vacant"), rs.getInt("user_id"), rs.getString("user_fname"), rs.getString("user_lname"), rs.getString("user_email"), rs.getString("user_phone"));
                listRooms.add(room);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listRooms;
    }
    
    public Room getRoomByNumber(int number){
        Room room = null;
        UserImpl userImpl = new UserImpl();
        try {
            Connection con = userImpl.initiateDBConnection();
            PreparedStatement stmt = con.prepareStatement("Select * from eamproject.room where number = ?");
            stmt.setInt(1,number); //1 specifies the first parameter in the query
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                room = new Room(rs.getInt("number"), rs.getInt("bedroom"), rs.getInt("bathroom"), rs.getString("phone"), rs.getInt("tv"), rs.getString("additional_services"),
                rs.getString("vacant"), rs.getInt("user_id"), rs.getString("user_fname"), rs.getString("user_lname"), rs.getString("user_email"), rs.getString("user_phone"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return room;
    }
    
    public List<Room> getRoomsByUserId(int id){
        List<Room> room = new ArrayList<Room>();
        boolean result = false;
        UserImpl userImpl = new UserImpl();
        try {
            Connection con = userImpl.initiateDBConnection();
            PreparedStatement stmt = con.prepareStatement("Select * from eamproject.room where user_id = ?");
            stmt.setInt(1,id); //1 specifies the first parameter in the query
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                room.add(new Room(rs.getInt("number"), rs.getInt("bedroom"), rs.getInt("bathroom"), rs.getString("phone"), rs.getInt("tv"), rs.getString("additional_services"),
                rs.getString("vacant"), rs.getInt("user_id"), rs.getString("user_fname"), rs.getString("user_lname"), rs.getString("user_email"), rs.getString("user_phone")));
            }
            stmt.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return room;
    }
    
    public boolean updateRoomServiceStatus(int roomNumber, String serviceStatus) {
        UserImpl userImpl = new UserImpl();
        boolean rowUpdated = false;
        try {
            Connection con = userImpl.initiateDBConnection();
            String sql = "UPDATE eamproject.room SET additional_services = ? WHERE number = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, serviceStatus);
            statement.setInt(2, roomNumber);
            rowUpdated = statement.executeUpdate() > 0;
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rowUpdated;
    }
    
    public boolean updateRoom(Room room){
        UserImpl userImpl = new UserImpl();
        boolean rowUpdated = false;
        try {
            Connection con = userImpl.initiateDBConnection();
            String sql = "UPDATE eamproject.room SET user_fname = ?, user_lname = ?, user_phone = ?, user_email = ?, vacant = ?, user_id = ?, additional_services = ?";
            sql += " WHERE number = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, room.getUser_FName());
            statement.setString(2, room.getUser_LName());
            statement.setString(3, room.getUser_phone());
            statement.setString(4, room.getUser_email());
            statement.setString(5, room.getVacant());
            statement.setInt(6, room.getUser_id());
            statement.setString(7, "None");
            statement.setInt(8, room.getNumber());

            rowUpdated = statement.executeUpdate() > 0;
            statement.close();
		
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rowUpdated;
    }
}
