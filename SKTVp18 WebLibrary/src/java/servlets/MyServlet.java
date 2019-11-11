/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "MyServlet", urlPatterns = {
    "/login",
    "/page1",
    "/page2",
    "/page3",
    "/page4",
    "/hello",
    "/CreateBook"
})
public class MyServlet extends HttpServlet {

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
       String path = request.getServletPath();
        
        switch (path) {
            case"/CreateBook":
                book
                break;      
            case"/login":
                String login = request.getParameter("login");
                String password = request.getParameter("password");
                if("ivan".equals(login)&& "123123".equals(password)){
               request.setAttribute("info","Привет,"+ login+"!") ;
                }else{
                 request.setAttribute("info", "Неправельный логин или пароль");
                } 
              request.getRequestDispatcher("/index.jsp")
                      .forward(request, response);
                break;
                
            case "/page1":
                String info = "Привет от Сервлета!";
                request.setAttribute(info,"info");
                request.getRequestDispatcher("/WEB-INF/page1.jsp").forward(request, response);
                break;
            case "/page2":
                String name = request.getParameter("name");
                String lastname = request.getParameter("lastname");
                info = "Привет от Сервлета!";
                request.setAttribute(info,"info");
                request.setAttribute("page", name + " " + lastname);
                request.getRequestDispatcher("/WEB-INF/page2.jsp").forward(request, response);
                break;
            case "/page3":
                 info = "Привет от Сервлета!";
                request.setAttribute(info,"info");
                request.getRequestDispatcher("/WEB-INF/page3.jsp").forward(request, response);
                break;
            case "/page4":
             
                 info = "Привет!";
                request.setAttribute(info,"info");
             
                request.getRequestDispatcher("/page4.jsp").forward(request, response);
               
                break;
                
            case "/hello":
                 name = request.getParameter("name");
                 lastname = request.getParameter("lastname");
                 request.setAttribute("info","Привет,"+ name  + lastname +"!") ; 
                  request.getRequestDispatcher("/index.jsp")
                      .forward(request, response);
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
