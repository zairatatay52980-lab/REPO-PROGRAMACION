package Utilidades;

import javax.swing.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class BaseDatos {

    private static final String URL = "jdbc:mysql://localhost:3306/nombreBD";
    private static final String USER = "root";
    private static final String PASS = "usbw";


    public static Connection getConnection() throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
    }
    public static void cerrarConexion(Connection conn) throws SQLException {
        conn.close();
    }






}
