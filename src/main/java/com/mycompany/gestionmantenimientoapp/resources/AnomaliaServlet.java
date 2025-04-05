/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gestionmantenimientoapp.resources;

import com.mycompany.gestionmantenimientoapp.Conexion;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author guindous
 */

@WebServlet("/registrarAnomalia")
public class AnomaliaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String descripcion = request.getParameter("descripcion");
        String fecha = request.getParameter("fecha"); // formato: yyyy-MM-dd
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario")); // enviar este valor desde el formulario

        try {
            Connection conn = Conexion.getConexion();
            String sql = "INSERT INTO anomalias (descripcion, fecha, id_usuario) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, descripcion);
            ps.setString(2, fecha);
            ps.setInt(3, idUsuario);
            ps.executeUpdate();

            response.sendRedirect("dashboard.jsp?msg=anomalia_registrada");

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("registroAnomalia.jsp?error=1");
        }
    }
}
