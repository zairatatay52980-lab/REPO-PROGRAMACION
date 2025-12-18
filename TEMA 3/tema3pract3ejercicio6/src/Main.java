import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            mostrarMenu();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static void mostrarMenu() {
        String opcion;

        opcion = JOptionPane.showInputDialog(null, "--MENU PRINCIPAL--\n"
                + "a) Ver especies aceptadas.\n"
                + "b) Agregar un nuevo animal al listado de rescatados.\n"
                + "c) Asignar un cuidador a un animal.\n"
                + "d) Pasar un animal a la cola de espera de adopcion. ´\n"
                + "e) Adoptar un animal.\n"
                + "f) Lista todos los animales y sus cuidadores actuales.\n"
                + "g) Salir");


        switch (opcion) {
            case "a":
                VerEspeciesAceptadas();
                break;
            case "b":
                break;
            case "c":
                break;
            case "d":
                break;
            case "e":
                break;
            case "f":
                break;
            case "g":
                JOptionPane.showMessageDialog(null, "Saliendo..");
                break;
        }

    }while(!opcion.equalsIgnoreCase("g"));

}

    public static void verEspeciesAceptadas() {

    }
}
