/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.interfaces.Room;
import com.services.IRoom;
import com.services.RoomImplService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServiceRequestServlet", urlPatterns = {"/serviceRequest"})
public class ServiceRequestServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        List<Room> rooms = new ArrayList();
        RoomImplService service = new RoomImplService();
        IRoom port = service.getRoomImplPort();
        HttpSession session = request.getSession(false);
        String id = session != null && session.getAttribute("id") != null ? session.getAttribute("id").toString() : "";
        if(id.isEmpty()) {
            response.sendRedirect(request.getContextPath() + "/login");
            return;
        }
        try {
            rooms = port.getRoomsByUserId(Integer.parseInt(id));
                if(!rooms.isEmpty()) {
                    request.setAttribute("rooms", rooms);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("ServiceRequestForm.jsp");
                    dispatcher.forward(request, response);
            } else {
                request.setAttribute("error", "Please book a room with us before ordering services");
                RequestDispatcher dispatcher = request.getRequestDispatcher("ServiceRequestError.jsp");
                dispatcher.forward(request, response);
            }
        } catch(Exception ex){
            System.out.println(ex);
        }    
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
