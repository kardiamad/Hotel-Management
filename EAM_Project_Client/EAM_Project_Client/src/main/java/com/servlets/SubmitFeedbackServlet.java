/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.services.FeedbackImplService;
import com.services.IFeedback;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SubmitFeedbackServlet", urlPatterns = {"/feedback"})
public class SubmitFeedbackServlet extends HttpServlet {

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("FeedbackForm.jsp");
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
        boolean result = true, rowInserted = false;
        String error = "";
        FeedbackImplService service = new FeedbackImplService();
        IFeedback port = service.getFeedbackImplPort();
        String username = request.getParameter("cname");
        String msg = request.getParameter("msg").trim();
        if(username.equals("")) {
            result = false;
            error += "Please enter your name";
        }else if(msg.equals("")) {
            result = false;
            error += "Please enter feedback";
        }
        if(result) {
            rowInserted = port.addFeedback(username, msg);
            if(rowInserted){
                request.setAttribute("success", "Your feedback has been saved. Thank you for your feedback!");
                RequestDispatcher dispatcher = request.getRequestDispatcher("FeedbackForm.jsp");
                dispatcher.forward(request, response);
            }
        }else {
            request.setAttribute("error", error);
            RequestDispatcher dispatcher = request.getRequestDispatcher("FeedbackForm.jsp");
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
