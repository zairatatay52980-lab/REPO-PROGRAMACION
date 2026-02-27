package DAO;

import Modelo.Titular;
import Utilidades.BaseDatos;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TitularDAO {


    public void insertarTitular(Titular titular) {

        String sql = "insert into titular (nombre, dni) values (?, ?)";

        try{
            Connection connection = BaseDatos.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);



            preparedStatement.setString(1, titular.getNombre());
            preparedStatement.setString(2, titular.getDni());
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "(DAO) Titular insertado correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Mensaje de error: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"Estado SQL: " + e.getSQLState());

        }

    }

}
