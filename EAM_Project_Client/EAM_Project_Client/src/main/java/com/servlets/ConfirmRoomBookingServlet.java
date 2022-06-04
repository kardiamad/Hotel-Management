/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.interfaces.Room;
import com.services.UserImplService;
import com.services.IUser;
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

@WebServlet(name = "ConfirmRoomBookingServlet", urlPatterns = {"/bookingConfirmation"})
public class ConfirmRoomBookingServlet extends HttpServlet {


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
        String url = "/UserDashboard.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	dispatcher.forward(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        boolean result = true, rowInserted;
	String error = "";
        Room room;
        RoomImplService service = new RoomImplService();
        UserImplService customerService = new UserImplService();
        IRoom port = service.getRoomImplPort();
        IUser userPort = customerService.getUserImplPort();
        int room_number = Integer.parseInt(request.getParameter("rnumber"));
        String first_name = request.getParameter("fname");
        String last_name = request.getParameter("lname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String id = request.getParameter("id");
        if(id.isEmpty()) {
            Integer user_id = userPort.createOrReturnUser(email, "EAM@123_Hotel");
            id = user_id.toString();
        }
        if(first_name.equals("")) {
            result = false;
            error += "Please enter First Name";
        }else if(last_name.equals("")) {
            result = false;
            error += "Please enter Last Name";
        }
        else if(phone.equals("")) {
            result = false;
            error += "Please enter Phone Number";
        }
        else if(email.equals("")) {
            result = false;
            error += "Please enter Email ID";
        }
        if(result) {
            room = port.getRoomByNumber(room_number);
            room.setUserId(Integer.parseInt(id));
            room.setUserFName(first_name);
            room.setUserLName(last_name);
            room.setPhone(phone);
            room.setUserEmail(email);
            room.setVacant("N");
            rowInserted = port.updateRoom(room);
            if(rowInserted){
                request.setAttribute("room", room);
                RequestDispatcher dispatcher = request.getRequestDispatcher("BookingSuccess.jsp");
                dispatcher.forward(request, response);
            }   
        } else {
            List<Room> rooms = new ArrayList<Room>();
            rooms = port.getVacantRooms();
            request.setAttribute("rooms", rooms);
            request.setAttribute("error", error);
            RequestDispatcher dispatcher = request.getRequestDispatcher("BookingForm.jsp");
            dispatcher.forward(request, response);
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
