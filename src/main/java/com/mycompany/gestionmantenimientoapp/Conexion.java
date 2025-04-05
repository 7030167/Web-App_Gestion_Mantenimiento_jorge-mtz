/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionmantenimientoapp;

/**
 *
 * @author guindous
 */
public class Conexion {
    public static Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost/mantenimiento", "root", "contraseña");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
