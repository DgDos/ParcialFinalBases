/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ColumnaDAO;
import dao.TablaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sary
 */
public class ColumnaSerM extends HttpServlet {

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
        int idC = Integer.parseInt(request.getParameter("id_columna"));
        ColumnaDAO columna_dao = new ColumnaDAO();

        try {
            columna_dao.deleteColumna(idC);
        } catch (SQLException ex) {
            Logger.getLogger(SchemaSer.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.sendRedirect("menu.html");
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
        String nombreC = request.getParameter("nombre_columna");
        int idC = Integer.parseInt(request.getParameter("id_columna"));
        String tipoC = request.getParameter("tipo");
        ColumnaDAO columna_dao = new ColumnaDAO();
        try {
                columna_dao.updateColumna(nombreC, tipoC, idC);
        } catch (SQLException ex) {
            Logger.getLogger(SchemaSer.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.sendRedirect("menu.html");
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
