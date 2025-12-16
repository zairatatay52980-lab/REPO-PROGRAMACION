import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static Set<String> porteros = new HashSet<>();
    static Set<String> defensas = new HashSet<>();
    static Set<String> delanteros = new HashSet<>();
    static Set<String> centrocampistas = new HashSet<>();

    public static void main(String[] args) {

        try {
            mostrarMenu();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void mostrarMenu() {
        String opcion;
        boolean salir;
        do {
            opcion = JOptionPane.showInputDialog(null, "-Menu Principal-\n"
                    + "a.Insertar judador\n"
                    + "b.Dar de alta jugador\n"
                    + "c.Dar de baja jugador\n"
                    + "d.Modificar jugador\n"
                    + "e.salir");

            if (opcion == null) {
                opcion = "f";
            }
            switch (opcion) {
                case "a":
                    insertarJugador();
                    break;
                case "b":
                    darAlta();
                    break;
                case "c":
                    darBaja();
                    break;
                case "d":
                    modificarJugador();
                    break;
                case "e":
                    salir = true;
                    break;
            }
            salir = false;
        } while (salir);

    }

    public static void insertarJugador() {
        Object[] seleccionRol = pedirRol();

        Set<String> conjunto = null;
        String nombreRol = null;

        String nombreJugador = JOptionPane.showInputDialog(null, "Teclea el nombre del  "+ nombreRol);

        if(nombreJugador != null && !nombreJugador.trim().isEmpty()) {
            boolean agregado = conjunto.add(nombreJugador);
            if(agregado) {
                JOptionPane.showMessageDialog(null, nombreJugador +"jugador agregado al conjunto de "+ nombreRol);
            }else{
                JOptionPane.showMessageDialog(null, nombreJugador +"jugador no agregado");
            }
        }

    }

    public static void darAlta() {
        insertarJugador();

    }

    public static void darBaja() {
        Object[] seleccionRol = pedirRol();

        Set<String> conjunto = null;
        String nombreRol = null;

        String nombreBorrar = JOptionPane.showInputDialog(null, "Teclea el nombre que quieres borrar");

        if(nombreBorrar != null) {
            boolean eliminado = conjunto.remove(nombreBorrar);
        }
        JOptionPane.showMessageDialog(null, nombreBorrar +" eliminado");
    }

    public static void modificarJugador() {
        Object[] seleccionRol = pedirRol();

        Set<String> conjunto = null;
        String nombreRol = null;

        String nombreAntiguo = JOptionPane.showInputDialog(null, "Teclea el nombre del jugador que quieres modificar");
        if (conjunto.contains(nombreAntiguo)) {
            String nombreNuevo = JOptionPane.showInputDialog(null, "Introduce el nuevo nombre para " + nombreAntiguo);

            if (nombreNuevo != null) {
                conjunto.remove(nombreAntiguo);
                boolean agregado = conjunto.add(nombreNuevo);

                if (agregado) {
                    JOptionPane.showMessageDialog(null, "Nombre modificado de " + nombreAntiguo + " a " + nombreNuevo);
                }
            }
        }
    }


    public static Object[] pedirRol() {
        String rol;
        do {
             rol = JOptionPane.showInputDialog(null,
                    "Selecciona el rol:\n"
                            + "1. Porteros\n"
                            + "2. Defensas\n"
                            + "3. Centrocampistas\n"
                            + "4. Delanteros");
        }while (rol == null);

        Set<String> conjunto = null;
        String nombre = null;

        switch (rol) {
            case "1":
                conjunto = porteros;
                nombre = "porteros";
                break;
            case "2":
                conjunto = defensas;
                nombre = "defensas";
                break;
            case "3":
                conjunto = centrocampistas;
                nombre = "centrocampistas";
                break;
            case "4":
                conjunto = delanteros;
                nombre = "delanteros";
                break;

        }
        return new Object[]{conjunto, nombre};
    }

}


