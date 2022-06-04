
package com.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.interfaces.ObjectFactory;
import com.interfaces.RoomService;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IRoomService", targetNamespace = "http://interfaces.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IRoomService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "room_number", targetNamespace = "")
    @RequestWrapper(localName = "addRoomServices", targetNamespace = "http://interfaces.com/", className = "com.interfaces.AddRoomServices")
    @ResponseWrapper(localName = "addRoomServicesResponse", targetNamespace = "http://interfaces.com/", className = "com.interfaces.AddRoomServicesResponse")
    @Action(input = "http://interfaces.com/IRoomService/addRoomServicesRequest", output = "http://interfaces.com/IRoomService/addRoomServicesResponse")
    public boolean addRoomServices(
        @WebParam(name = "arg0", targetNamespace = "")
        RoomService arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.interfaces.RoomService>
     */
    @WebMethod
    @WebResult(name = "room_services", targetNamespace = "")
    @RequestWrapper(localName = "getRoomServices", targetNamespace = "http://interfaces.com/", className = "com.interfaces.GetRoomServices")
    @ResponseWrapper(localName = "getRoomServicesResponse", targetNamespace = "http://interfaces.com/", className = "com.interfaces.GetRoomServicesResponse")
    @Action(input = "http://interfaces.com/IRoomService/getRoomServicesRequest", output = "http://interfaces.com/IRoomService/getRoomServicesResponse")
    public List<RoomService> getRoomServices();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "room_number", targetNamespace = "")
    @RequestWrapper(localName = "updateRoomServices", targetNamespace = "http://interfaces.com/", className = "com.interfaces.UpdateRoomServices")
    @ResponseWrapper(localName = "updateRoomServicesResponse", targetNamespace = "http://interfaces.com/", className = "com.interfaces.UpdateRoomServicesResponse")
    @Action(input = "http://interfaces.com/IRoomService/updateRoomServicesRequest", output = "http://interfaces.com/IRoomService/updateRoomServicesResponse")
    public boolean updateRoomServices(
        @WebParam(name = "arg0", targetNamespace = "")
        RoomService arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "room_number", targetNamespace = "")
    @RequestWrapper(localName = "approveRoomServices", targetNamespace = "http://interfaces.com/", className = "com.interfaces.ApproveRoomServices")
    @ResponseWrapper(localName = "approveRoomServicesResponse", targetNamespace = "http://interfaces.com/", className = "com.interfaces.ApproveRoomServicesResponse")
    @Action(input = "http://interfaces.com/IRoomService/approveRoomServicesRequest", output = "http://interfaces.com/IRoomService/approveRoomServicesResponse")
    public boolean approveRoomServices(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.interfaces.RoomService
     */
    @WebMethod
    @WebResult(name = "room_number", targetNamespace = "")
    @RequestWrapper(localName = "getRoomServicesByRoomNumber", targetNamespace = "http://interfaces.com/", className = "com.interfaces.GetRoomServicesByRoomNumber")
    @ResponseWrapper(localName = "getRoomServicesByRoomNumberResponse", targetNamespace = "http://interfaces.com/", className = "com.interfaces.GetRoomServicesByRoomNumberResponse")
    @Action(input = "http://interfaces.com/IRoomService/getRoomServicesByRoomNumberRequest", output = "http://interfaces.com/IRoomService/getRoomServicesByRoomNumberResponse")
    public RoomService getRoomServicesByRoomNumber(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "room_number", targetNamespace = "")
    @RequestWrapper(localName = "removeRoomServicesForVacantRoom", targetNamespace = "http://interfaces.com/", className = "com.interfaces.RemoveRoomServicesForVacantRoom")
    @ResponseWrapper(localName = "removeRoomServicesForVacantRoomResponse", targetNamespace = "http://interfaces.com/", className = "com.interfaces.RemoveRoomServicesForVacantRoomResponse")
    @Action(input = "http://interfaces.com/IRoomService/removeRoomServicesForVacantRoomRequest", output = "http://interfaces.com/IRoomService/removeRoomServicesForVacantRoomResponse")
    public boolean removeRoomServicesForVacantRoom(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}