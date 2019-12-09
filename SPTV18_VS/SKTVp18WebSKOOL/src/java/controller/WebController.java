/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Person;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.criteria.CriteriaBuilder.Case;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "WebController", urlPatterns = {
    "/ShowLogin",
    "/Login",
    "/ShowNewPerson"
})
public class WebController extends HttpServlet {
@JDB Person

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
        request.setCharacterEncoding("UTF-8");
        String path = request.getServletPath(); 
        switch (path) {
             case "showLogin":
               request.getRequestDispatcher("/showLogin.jsp")
                        .forward(request, response);
               break;
             case "/login":
                 String login = request.getParameter("login");
                  String passvord = request.getParameter("passvord");
                 if("ivan".equals(login)&& "123123".equals("password")){
                request.setAttribute("info","Привет,"+ login+"!") ;
                }else{
                 request.setAttribute("info", "Неправельный логин или пароль");
                } 
                request.getRequestDispatcher("/index.jsp")
                      .forward(request, response);
                 break; 
              case "/showNewPerson":
                 request.getRequestDispatcher("/showNewPerson.jsp")
                    .forward(request, response);
                 break; 
              case "/newPerson":     
                 String name = request.getParameter("name");
                 String lastname = request.getParameter("lastname");
                 String status = request.getParameter("status");
                 String email = request.getParameter("email");
                 Person person = newPerson (name, lastname, status, email);
                 request.setAttribute("info"," polzovatel" +person.getName()+""+person.getLastname()+"zaregistrirovatsja.");
                 request.getRequestDispatcher("/index.jsp")
                    .forward(request, response);
              break; 
              
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
    }

    private Person newPerson(String name, String lastname, String status, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


