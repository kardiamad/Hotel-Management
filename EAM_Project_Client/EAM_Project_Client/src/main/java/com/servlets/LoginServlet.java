/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.interfaces.User;
import com.services.UserImplService;
import com.services.IUser;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
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
        String url = "/index.jsp";
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
        boolean result = true;
        User user = null;
	String login_error = "";
        UserImplService service = new UserImplService();
        IUser port = service.getUserImplPort();
        String username = request.getParameter("uname");
        String password = request.getParameter("upassword");
        if((username.equals(""))) {
            result = false;
            login_error += "Please enter userame";
        }else if(password.equals("")) {
            result = false;
            login_error += "Please enter password";
        }
        if(result) {
            user = port.getUser(username, password);
            if(user != null){
                HttpSession session = request.getSession(false);
                session.setAttribute("id", user.getId());
                session.setAttribute("username", user.getName());
                if(user.getType().equals("1")){
                    session.setAttribute("isAdmin", true);
                    response.sendRedirect(request.getContextPath() + "/admin");
                }
                else {
                    session.setAttribute("isAdmin", false);
                    response.sendRedirect(request.getContextPath() + "/welcome");
                }
            } else {
                request.setAttribute("user", user);
                request.setAttribute("error", "Username or Password is incorrect");
                RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request, response);
            }
        } else {
            request.setAttribute("error", login_error);
            request.setAttribute("user", user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
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
