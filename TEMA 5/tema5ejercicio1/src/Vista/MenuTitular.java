package Vista;

import Controladores.TitularController;
import Utilidades.EntradaDatos;

import javax.swing.*;

public class MenuTitular {

    private TitularController titularController;

    public MenuTitular() {
        this.titularController = new TitularController();
    }

    public void mostrarMenu() {

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "--- M E N U   P R I N C I P A L ---\n"
                    + "\n 1.Registrar Titular"));


            switch (opcion) {
                case 1 -> registrarTitular();
                default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 0);

    }

    public void registrarTitular() {

        JOptionPane.showMessageDialog(null, "-- REGISTRAR TITULAR --");

        try{

            String dni = EntradaDatos.validarTexto("Teclea el DNI del titular ", "DNI", "^[0-9]{8}[A-Za-z]$");

            if(dni!=null){
                String nombre = EntradaDatos.validarTexto("Teclea el nombre del titular ", "Nombre", "^[A-Za-z]+$");

                if(nombre!=null){
                    titularController.crearTitular(nombre, dni);
                    JOptionPane.showMessageDialog(null, "Titular " + nombre + " con el DNI " + dni + " registrado correctamente.");

                }
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }




    }
}
