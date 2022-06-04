/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.interfaces.Room;
import com.services.IRoom;
import com.services.IRoomService;
import com.services.RoomImplService;
import com.services.RoomServiceImplService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateRoomStatusServlet", urlPatterns = {"/vacateRoom"})
public class UpdateRoomStatusServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RoomImplService service = new RoomImplService();
        IRoom port = service.getRoomImplPort();
        RoomServiceImplService roomServiceService = new RoomServiceImplService();
        IRoomService roomServicePort = roomServiceService.getRoomServiceImplPort();
        int roomNumber = 0;
        try{
            roomNumber = Integer.parseInt(request.getParameter("room"));
            Room room = new Room();
            room.setNumber(roomNumber);
            room.setUserId(0);
            room.setUserFName("");
            room.setUserLName("");
            room.setUserEmail("");
            room.setUserPhone("");
            room.setVacant("Y");
            boolean updated = port.updateRoom(room);
            roomServicePort.removeRoomServicesForVacantRoom(roomNumber);
            response.sendRedirect("manageRooms");
        }catch(Exception ex){
            
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
