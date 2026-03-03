import Vista.MenuCuenta;
import Vista.MenuTitular;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int opcion;

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "--- M E N U   P R I N C I P A L ---\n"
                    + "\n 1. Menu Titular"
                    + "\n 2. Menu Cuentas"
                    + "\n 0. Salir"));

            switch (opcion){
                case 1 -> { MenuTitular menuTitular = new MenuTitular();
                            menuTitular.mostrarMenuTitular();
                }
                case 2 -> { MenuCuenta menuCuenta = new MenuCuenta();
                            menuCuenta.mostrarMenuCuenta();
                }
                case 0 -> JOptionPane.showMessageDialog(null, "Saliendo de la aplicación...");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida");
            }

        }while(opcion != 0);

    }
}









