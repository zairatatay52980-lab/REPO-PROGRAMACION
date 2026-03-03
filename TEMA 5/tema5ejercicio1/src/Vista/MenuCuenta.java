package Vista;

import Controladores.CuentaController;
import Modelo.Cuenta;
import Utilidades.EntradaDatos;

import javax.swing.*;

public class MenuCuenta {

    private CuentaController cuentaController;

    public MenuCuenta() {
        this.cuentaController = new CuentaController();
    }

    public void mostrarMenuCuenta() {

        int opcion;

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "--- M E N U   C U E N T A ---\n"
                                + "\n 1.Registrar Cuenta"
                                + "\n 2.Modificar Cuenta"
                                + "\n 3.Borrar Cuenta"
                                + "\n 4.Listar Cuentas"
                                + "\n 5.Listar cuentas por titular"
                                + "\n 6.Buscar por ID"
                                + "\n 7.Buscar por numero de cuenta"
                                + "\n"
                                + "\n 0.VOLVER AL MENU PRINCIPAL\n"));

            switch (opcion) {
                case 1 -> registrarCuenta();
                /*case 2 -> modificarCuenta();
                case 3 -> borrarCuenta();
                case 4 -> listarCuentas();
                case 5 -> listarPorTitular();
                case 6 -> buscarPorId();
                case 7 -> buscarPorNumeroCuenta();*/
                case 0 -> JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        }while(opcion != 0);

    }

    public  void registrarCuenta() {
        JOptionPane.showMessageDialog(null, "--- REGISTRAR CUENTA ---");

        try{
            String iban = EntradaDatos.validarTexto("Teclea el numero de cuenta (IBAN)", "IBAN", "^ES[0-9]{22}$");

            if(iban!=null){
                    double saldo = Integer.parseInt(EntradaDatos.validarTexto("Teclea el saldo de la cuenta", "Saldo", "^[0-9]+$"));

                    if(saldo!=-1){
                        cuentaController.registrarCuenta(iban, saldo);
                        JOptionPane.showMessageDialog(null, "Cuenta registrada correctamente.");

                    }
                }


        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        }

    }


