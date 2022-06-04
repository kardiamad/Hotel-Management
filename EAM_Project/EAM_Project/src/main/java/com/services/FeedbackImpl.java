/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.Feedback;
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

@WebService(endpointInterface="com.interfaces.IFeedback")
public class FeedbackImpl {
    public List<Feedback> getFeedback(){
        Feedback feedback = null;
        UserImpl userImpl = new UserImpl();
        List<Feedback> listFeedbacks = new ArrayList<Feedback>();
        try {
            Connection con = userImpl.initiateDBConnection();
            String sql = "SELECT * FROM eamproject.feedback";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                feedback = new Feedback(rs.getInt("id"), rs.getString("username"), rs.getString("text"));
                listFeedbacks.add(feedback);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listFeedbacks;
    }
    
    public boolean addFeedback(String username, String msg){
        Feedback feedback = null;
        UserImpl userImpl = new UserImpl();
        boolean rowInserted = false;
        try {
            Connection con = userImpl.initiateDBConnection();
            String sql = "INSERT INTO eamproject.feedback (username, text) VALUES (?, ?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, username);
		statement.setString(2, msg);
		
		rowInserted = statement.executeUpdate() > 0;
		statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rowInserted;
    }
    
    public boolean deleteFeedback(int id){
        Feedback feedback = null;
        UserImpl userImpl = new UserImpl();
        boolean rowInserted = false;
        try {
            Connection con = userImpl.initiateDBConnection();
            String sql = "DELETE FROM eamproject.feedback WHERE id = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);
		
		rowInserted = statement.executeUpdate() > 0;
		statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rowInserted;
    }
}
