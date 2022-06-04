/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.RoomService;
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

@WebService(endpointInterface="com.interfaces.IRoomService")
public class RoomServiceImpl {
    public List<RoomService> getRoomServices(){
        UserImpl userImpl = new UserImpl();
        List<RoomService> listRoomServices = new ArrayList<RoomService>();
        try {
            Connection con = userImpl.initiateDBConnection();
            String sql = "SELECT * FROM eamproject.roomservice";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                RoomService roomService = new RoomService(rs.getInt("id"), rs.getInt("room_number"), rs.getInt("flower"), rs.getString("scent"), rs.getInt("towel"), rs.getString("approved"));
                listRoomServices.add(roomService);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listRoomServices;
    }
    
    public RoomService getRoomServicesByRoomNumber(int number){
        RoomService roomService = new RoomService();
        UserImpl userImpl = new UserImpl();
        try {
            Connection con = userImpl.initiateDBConnection();
            PreparedStatement stmt = con.prepareStatement("Select * from eamproject.roomservice where room_number = ?");
            stmt.setInt(1,number); //1 specifies the first parameter in the query
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                roomService = new RoomService(rs.getInt("id"), rs.getInt("room_number"), rs.getInt("flower"), rs.getString("scent"), rs.getInt("towel"), rs.getString("approved"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return roomService;
    }
    
    public boolean updateRoomServices(RoomService roomService){
        UserImpl userImpl = new UserImpl();
        boolean rowUpdated = false;
        try {
            Connection con = userImpl.initiateDBConnection();
            String sql = "UPDATE eamproject.roomservice SET flower= ?, scent = ?, towel = ?";
            sql += " WHERE id = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(4, roomService.getId());
            statement.setInt(1, roomService.getFlower());
            statement.setString(2, roomService.getScent());
            statement.setInt(3, roomService.getTowel());

            rowUpdated = statement.executeUpdate() > 0;
            statement.close();
		
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rowUpdated;
    }
    
    public boolean approveRoomServices(int id){
        UserImpl userImpl = new UserImpl();
        boolean rowUpdated = false;
        try {
            Connection con = userImpl.initiateDBConnection();
            String sql = "UPDATE eamproject.roomservice SET approved= ?";
            sql += " WHERE id = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(2, id);
            statement.setString(1, "Y");

            rowUpdated = statement.executeUpdate() > 0;
            statement.close();
		
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rowUpdated;
    }
    
    public boolean addRoomServices(RoomService roomService){
        UserImpl userImpl = new UserImpl();
        boolean rowUpdated = false;
        try {
            Connection con = userImpl.initiateDBConnection();
            String sql = "INSERT INTO eamproject.roomservice (room_number, flower, scent, towel, approved) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, roomService.getRoom_number());
            statement.setInt(2, roomService.getFlower());
            statement.setString(3, roomService.getScent());
            statement.setInt(4, roomService.getTowel());
            statement.setString(5, roomService.getApproved());

            rowUpdated = statement.executeUpdate() > 0;
            statement.close();
		
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rowUpdated;
    }
    
    public boolean removeRoomServicesForVacantRoom(int roomNumber) {
        UserImpl userImpl = new UserImpl();
        boolean rowUpdated = false;
        try {
            Connection con = userImpl.initiateDBConnection();
            String sql = "Delete from eamproject.roomservice where room_number = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, roomNumber);
            rowUpdated = statement.executeUpdate() > 0;
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rowUpdated;
    }
}
