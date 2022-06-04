/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

import com.models.RoomService;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IRoomService {
    @WebMethod
    @WebResult(name = "room_services")
    public List<RoomService> getRoomServices();
    
    @WebMethod
    @WebResult(name = "room_number")
    public RoomService getRoomServicesByRoomNumber(int number);
    
    @WebMethod
    @WebResult(name = "room_number")
    public boolean updateRoomServices(RoomService roomService);
    
    @WebMethod
    @WebResult(name = "room_number")
    public boolean addRoomServices(RoomService roomService);
    
    @WebMethod
    @WebResult(name = "room_number")
    public boolean approveRoomServices(int id);
    
    @WebMethod
    @WebResult(name = "room_number")
    public boolean removeRoomServicesForVacantRoom(int id);
}
