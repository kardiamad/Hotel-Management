/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;

@WebService(endpointInterface="com.interfaces.IUser")
public class UserImpl {
    public User getUser(String name, String password){
        User user = null;
        try {
            Connection con = initiateDBConnection();
            PreparedStatement stmt = con.prepareStatement("Select * from eamproject.user where name = ? and password = ?");
            stmt.setString(1,name); //1 specifies the first parameter in the query
            stmt.setString(2,password);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("password"), rs.getString("type"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user;
    }
    
    public User getUserById(int id){
        User user = null;
        try {
            Connection con = initiateDBConnection();
            PreparedStatement stmt = con.prepareStatement("Select * from eamproject.user where id = ?");
            stmt.setInt(1,id); //1 specifies the first parameter in the query
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("password"), rs.getString("type"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user;
    }
    
    public int createOrReturnUser(String name, String password) {
        User user = null;
        int userId = 0;
        try {
            Connection con = initiateDBConnection();
            PreparedStatement selectStmt = con.prepareStatement("Select * from eamproject.user where name = ?");
            selectStmt.setString(1, name);
            ResultSet rs = selectStmt.executeQuery();
            while(rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("password"), rs.getString("type"));
                return user.getId();
            }
            PreparedStatement stmt = con.prepareStatement("Insert into eamproject.user (name, password, type) values (?,?,?)");
            stmt.setString(1, name); //1 specifies the first parameter in the query
            stmt.setString(2, password);
            stmt.setInt(3, 0);
            stmt.executeUpdate(); 
            rs = selectStmt.executeQuery();
            while(rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userId;
    }
    
    public Connection initiateDBConnection(){
        Connection con = null;
        try {
            String db_URL, db_Username, db_Password;
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            db_URL = "jdbc:mysql://localhost:3306/eamproject?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false";
            db_Username = "root";
            db_Password = "saloni";
            con = DriverManager.getConnection(db_URL, db_Username, db_Password);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
