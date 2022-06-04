/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

import com.models.Room;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IRoom {
    @WebMethod
    @WebResult(name = "rooms")
    public List<Room> getRooms();
    
    @WebMethod
    @WebResult(name = "rooms")
    public List<Room> getVacantRooms();
    
    @WebMethod
    @WebResult(name = "room")
    public Room getRoomByNumber(int number);
    
    @WebMethod
    @WebResult(name="room")
    public boolean updateRoomServiceStatus(int roomNumber, String serviceStatus);
    
    @WebMethod
    @WebResult(name = "room")
    public boolean updateRoom(Room room);
    
    @WebMethod
    @WebResult(name = "rooms")
    public List<Room> getRoomsByUserId(int id);
}
