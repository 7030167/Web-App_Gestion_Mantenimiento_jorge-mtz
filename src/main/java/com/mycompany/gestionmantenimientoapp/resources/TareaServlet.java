/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gestionmantenimientoapp.resources;

import com.mycompany.gestionmantenimientoapp.Conexion;
import com.mycompany.gestionmantenimientoapp.TareaMantenimiento;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author guindous
 */

@WebServlet("/listarTareas")
public class TareaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<TareaMantenimiento> listaTareas = new ArrayList<>();

        try {
            Connection conn = Conexion.getConexion();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tareas");

            while (rs.next()) {
                TareaMantenimiento tarea = new TareaMantenimiento();
                tarea.setId(rs.getInt("id"));
                tarea.setDescripcion(rs.getString("descripcion"));
                tarea.setEstado(rs.getString("estado"));
                tarea.setFechaProgramada(rs.getString("fecha_programada"));
                tarea.setIdAnomalia(rs.getInt("id_anomalia"));

                listaTareas.add(tarea);
            }

            request.setAttribute("tareas", listaTareas);
            request.getRequestDispatcher("tareasProgramadas.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("dashboard.jsp?error=tareas");
        }
    }
}

