/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.interfaces.Room;
import com.interfaces.RoomService;
import com.services.IRoom;
import com.services.IRoomService;
import com.services.RoomImplService;
import com.services.RoomServiceImplService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SubmitServiceRequestServlet", urlPatterns = {"/submitServiceRequest"})
public class SubmitServiceRequestServlet extends HttpServlet {


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
        boolean result = true, rowInserted = false;
        String error = "";
        int flower = 0, towel = 0;
        int room_number = 0;
        RoomService roomServiceInstance = new RoomService();
        RoomServiceImplService roomServiceService = new RoomServiceImplService();
        IRoomService roomServicePort = roomServiceService.getRoomServiceImplPort();
        Room roomInstance = new Room();
        RoomImplService service = new RoomImplService();
        IRoom port = service.getRoomImplPort();
        
        String scent = request.getParameter("scent");
        String id = request.getParameter("id");
        try {
            flower = Integer.parseInt(request.getParameter("flower"));
            towel = Integer.parseInt(request.getParameter("towel"));
            room_number = Integer.parseInt(request.getParameter("room"));
        }catch(Exception ex){
            
        }
        if(flower == 0 && scent == null && towel == 0) {
            result = false;
            error += "Please choose services required";
        }
        if(result) {
            roomServiceInstance.setRoomNumber(room_number);
            roomServiceInstance.setFlower(flower);
            roomServiceInstance.setScent("Y");
            roomServiceInstance.setTowel(towel);
            roomServiceInstance.setApproved("N");
            roomInstance.setAdditionalServices("Requested");
            port.updateRoomServiceStatus(room_number, "Requested");
            rowInserted = roomServicePort.addRoomServices(roomServiceInstance);
            if(rowInserted){
                request.setAttribute("roomService", roomServiceInstance);
                RequestDispatcher dispatcher = request.getRequestDispatcher("ServiceRequestSuccess.jsp");
                dispatcher.forward(request, response);
            }
            
        }else {
            request.setAttribute("error", error);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ServiceRequestForm.jsp");
            dispatcher.forward(request, response);
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
