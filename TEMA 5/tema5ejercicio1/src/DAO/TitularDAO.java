package DAO;

import Controladores.TitularController;
import Modelo.Titular;
import Utilidades.BaseDatos;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TitularDAO {


    public static Titular buscarPorDni(String dni) {
        String sql = "select * from titular where dni = ?";

        try {
            Connection connection = BaseDatos.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, dni);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new Titular(
                        resultSet.getString("nombre"),
                        resultSet.getInt("id"),
                        resultSet.getString("dni")
                );
            }

            BaseDatos.cerrarConexion(connection);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }


    public void modificarTitular(Titular titular) {
        String sql = "update titular set nombre = ? where dni = ?";

        try {
            Connection connection = BaseDatos.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(2, titular.getDni());
            preparedStatement.setString(1, titular.getNombre());
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "(DAO) Titular modificado correctamente");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void insertarTitular(Titular titular) {

        String sql = "insert into titular (nombre, dni) values (?, ?)";

        try {
            Connection connection = BaseDatos.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setString(1, titular.getNombre());
            preparedStatement.setString(2, titular.getDni());
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "(DAO) Titular insertado correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Mensaje de error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Estado SQL: " + e.getSQLState());

        }

    }

    public int borrarTitular(String dni) {
        String sql = "delete from titular where dni= ?";

        try {
            Connection connection = BaseDatos.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, dni);
            int n = preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "(DAO) Titular borrado correctamente");
            return n;

        } catch (SQLException e) {
            e.printStackTrace();

            JOptionPane.showMessageDialog(null, "Mensaje de error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Estado SQL: " + e.getSQLState());

        }

        return 0;
    }


    public List<Titular> listarTitulares() {

        List<Titular> lista = new ArrayList<>();
        String sql = "select * from titular";

        try (Connection connection = BaseDatos.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {


            while (resultSet.next()) {
                lista.add(new Titular(
                        resultSet.getString("nombre"),
                        resultSet.getInt("id"),
                        resultSet.getString("dni")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Mensaje de error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Estado SQL: " + e.getSQLState());
        }

        return lista;
    }

    public List<Titular> listarPorNombre(String nombre) {

        List<Titular> lista = new ArrayList<>();
        String sql = "select * from titular where nombre LIKE ?";

        try (Connection connection = BaseDatos.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, "%" + nombre + "%");
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    lista.add(new Titular(
                            resultSet.getString("nombre"),
                            resultSet.getInt("id"),
                            resultSet.getString("dni")
                    ));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Mensaje de error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Estado SQL: " + e.getSQLState());
        }

        return lista;
    }
}
