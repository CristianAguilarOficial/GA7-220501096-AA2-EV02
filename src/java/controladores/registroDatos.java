/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author camil
 */
public class registroDatos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String msg )
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registroDatos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registroDatos at " + msg + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String Identificador = request.getParameter("cedula");
        String Password = request.getParameter("password");
        
        
        if("1116543128".equals(Identificador) && "user502".equals(Password)){
            
          response.sendRedirect("principal.html");
        
        }else{
        processRequest(request, response, "Aceso no valido");    
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String Nombre = request.getParameter("nombre");
        String Apellido = request.getParameter("apellido");
        String Cedula = request.getParameter("cedula");
        String Email = request.getParameter("email");
        String Password = request.getParameter("password");
        String ConfirmPassword = request.getParameter("confirmPassword");
        
        System.out.print(Nombre);
        System.out.print(Apellido);
        System.out.print(Cedula);
        System.out.print(Email);
        System.out.print(Password);
        System.out.print(ConfirmPassword);
        
       response.sendRedirect("index.html");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
