package DAO;

import Modelo.Cuenta;
import Utilidades.BaseDatos;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CuentaDAO {

    public static void registrarCuenta(Cuenta cuenta) {

        String sql = "insert into cuenta (iban, saldo) values (?,?)";

        try{
            Connection connection = BaseDatos.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, cuenta.getIban());
            preparedStatement.setDouble(2, cuenta.getSaldo());

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "(DAO) Cuenta registrada correctamente");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al registrar cuenta: " + e.getMessage());
        }





    }
}
