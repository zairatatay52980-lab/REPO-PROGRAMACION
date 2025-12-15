import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer, String> contactos = new HashMap <>();

    public static void main(String[] args) {
        try {
           mostrarMenu();

        }catch (Exception e)
            {
            JOptionPane.showMessageDialog(null,e);
            }
    }

    public static void mostrarMenu()throws Exception{
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog("--MENU PRINCIPAL--\n"
                    + "1.- Anadir un nuevo numero\n"
                    + "2.- Borrar un numero \n"
                    + "3.- Buscar un numero \n"
                    + "4.- Borrar por nombre \n"
                    + "5.- Buscar por nombre \n"
                    + "6.- Salir ");

            ejecutarOpcion(opcion);

        } while (!opcion.equalsIgnoreCase("6"));

    }

    public static void ejecutarOpcion(String opcion) throws Exception {
        switch (opcion) {
            case "1": añadirNumero();
                break;
            case "2": borrarNumero();
                break;
            case "3": buscarNumero();
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;

        }
    }

    public static void añadirNumero() throws Exception{
        Integer numero= Integer.valueOf(JOptionPane.showInputDialog("Introduce el contacto de un alumno"));
        String nombre= JOptionPane.showInputDialog("Introduce el nombre del alumno");

        contactos.put(numero,nombre);
    }

    public static void borrarNumero() throws Exception{
        Integer numero= Integer.valueOf(JOptionPane.showInputDialog("Introduce el contacto que  quieres eliminar"));
        String nombre= JOptionPane.showInputDialog("Introduce el nombre del alumno");

        contactos.remove(numero,nombre);
    }

    public static void buscarNumero() throws Exception{

    }

}
