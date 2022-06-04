/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

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

@WebServlet(name = "ApproveServiceServlet", urlPatterns = {"/approveService"})
public class ApproveServiceServlet extends HttpServlet {

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
        RoomServiceImplService roomServiceService = new RoomServiceImplService();
        IRoomService roomServicePort = roomServiceService.getRoomServiceImplPort();
        RoomImplService service = new RoomImplService();
        IRoom port = service.getRoomImplPort();
        int id = 0;
        int room_number;
        try{
            id = Integer.parseInt(request.getParameter("id"));
            room_number = Integer.parseInt(request.getParameter("room"));
            boolean updated = roomServicePort.approveRoomServices(id);
            port.updateRoomServiceStatus(room_number, "Approved");
            response.sendRedirect("manageServices");
        }catch(Exception ex){
            
        }
        
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
        doGet(request, response);
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
