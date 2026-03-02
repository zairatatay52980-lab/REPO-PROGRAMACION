package Vista;

import Controladores.TitularController;
import Modelo.Titular;
import Utilidades.EntradaDatos;

import javax.swing.*;
import java.util.List;

public class MenuTitular {

    private TitularController titularController;

    public MenuTitular() {
        this.titularController = new TitularController();
    }

    public void mostrarMenu() {

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "--- M E N U   P R I N C I P A L ---\n"
                    + "\n 1.Registrar Titular"
                    + "\n 2.Modificar Titular"
                    + "\n 3.Borrar Titular"
                    + "\n 4.Listar Titulares"
                    + "\n 5.Listar titular por nombre"
                    + "\n 6.Buscar por ID"
                    + "\n 7.Buscar por DNI"
                    + "\n 0.Salir\n"));


            switch (opcion) {
                case 1 -> registrarTitular();
                case 2 -> modificarTitular();
                case 3 -> borrarTitular();
                case 4 -> listarTitulares();
                case 5 -> listarPorNombre();
                case 6 -> buscarPorId();
                case 7 -> buscarPorDnii();
                case 0 -> JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 0);

    }


    public void listarPorNombre(){
        JOptionPane.showMessageDialog(null, "--- LISTAR TITULARES POR NOMBRE ---");

        String nombre = EntradaDatos.validarTexto("Teclea el nombre del titular ", "Nombre", "^[A-Za-z]+$");
        if (nombre == null) {
            return; // el usuario canceló
        }

        StringBuilder stringBuilder = titularController.buscarPorNombre(nombre);

        if (stringBuilder.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "No hay titulares registrados con ese nombre.");
        } else
        {
            JOptionPane.showMessageDialog(null, stringBuilder.toString());
        }


    }

    private void listarTitulares() {
        JOptionPane.showMessageDialog(null, "--- LISTAR TITULARES ---");

        List<Titular> listaTitulares = titularController.listarTitulares();

        if (listaTitulares.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "No hay titulares registrados.");
        } else
        {
            StringBuilder mensaje = new StringBuilder();
            for (Titular t : listaTitulares) {
                mensaje.append(t.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString());
        }

    }

    public void borrarTitular() {
        JOptionPane.showMessageDialog(null, "-- BORRAR TITULAR --");

        try{
            String dni = EntradaDatos.validarTexto("Teclea el DNI del titular a borrar ", "DNI", "^[0-9]{8}[A-Za-z]$");

            if(dni != null){

                titularController.borrarTitular(dni);
                JOptionPane.showMessageDialog(null, "Titular con el DNI " + dni + " borrado correctamente.");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }


    }

    public void modificarTitular() {
        JOptionPane.showMessageDialog(null, "-- MODIFICAR TITULAR --");

        Titular titular = buscarPorDni();

        if (titular != null){

            String nuevoNombre = EntradaDatos.validarTexto("Teclea el nuevo nombre del titular ", "Nombre", "^[A-Za-z]+$");

            if(nuevoNombre != null){
                titularController.modificarTitular(titular, nuevoNombre);
                JOptionPane.showMessageDialog(null, "Titular modificado correctamente");
            }
        }

    }

    public Titular buscarPorId(){
        JOptionPane.showMessageDialog(null, "-- BUSCAR TITULAR POR ID --");

        int id = Integer.parseInt(EntradaDatos.validarTexto("Teclea el ID del titular", "ID", "^[0-9]+$"));

        if(id != -1){
            Titular titular = titularController.buscarPorId(id);

            if (titular != null) {
                JOptionPane.showMessageDialog(null,"Titular encontrado: " + titular);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún titular con el ID proporcionado.");
            }
            return titular;
        }


        return null;
    }

    public Titular buscarPorDnii() {

        JOptionPane.showMessageDialog(null, "-- BUSCAR TITULAR POR DNI --");

        String dni = EntradaDatos.validarTexto("Teclea el DNI del titular ", "DNI", "^[0-9]{8}[A-Za-z]$");

        if(dni != null){
            Titular titular = titularController.buscarPorDni(dni);
            return titular;
        }

        return null;
    }


    public Titular buscarPorDni() {



        String dni = EntradaDatos.validarTexto("Teclea el DNI del titular ", "DNI", "^[0-9]{8}[A-Za-z]$");

        if(dni != null){
            Titular titular = titularController.buscarPorDni(dni);
            return titular;
        }

        return null;
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
