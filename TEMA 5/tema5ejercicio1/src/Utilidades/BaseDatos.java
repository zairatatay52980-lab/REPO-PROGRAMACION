package Utilidades;

import javax.swing.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BaseDatos {

    private static final String URL = "jdbc:mysql://localhost:3306/tema5practica1";
    private static final String USER = "root";
    private static final String PASS = "usbw";



    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static void cerrarConexion(Connection conn) throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
}
