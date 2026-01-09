import javax.swing.*;
import java.util.*;

public class Main {
    static String[] especiesAceptadas = {"Perro", "Gato","Conejo", "Loro", "Tortuga" };
    static  ArrayList<String> animalesRescatados = new ArrayList<>();
    static Map<String, String> relacionCuidador = new HashMap<>();
    static Queue<String> colaAdopcion = new LinkedList<>();

    public static void main(String[]args) {

        try {
            mostrarMenu();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e );
        }
    }

    public static void mostrarMenu() {

        String opcion;
        do {

        opcion = JOptionPane.showInputDialog(null, "--MENU PRINCIPAL--\n"
                + "a) Ver especies aceptadas\n"
                + "b) Agregar un nuevo animal al listado de rescatados\n"
                + "c) Asignar un cuidador a un animal\n"
                + "d) Pasar un animal a la cola de espera de adopcion\n"
                + "e) Adoptar un animal\n"
                + "f) Lista todos los animales y sus cuidadores actuales\n"
                + "g) Salir");


        switch (opcion) {
            case "a": verEspeciesAceptadas();
                break;
            case "b": agregarNuevoAnimal();
                break;
            case "c": asignarCuidador();
                break;
            case "d": pasarAnimalColaEspera();
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
        String listaEspecies = "Especies aceptadas:\n";
        for(String especies : especiesAceptadas) {
            listaEspecies += "- "+ especies + "\n";

        }
        JOptionPane.showMessageDialog(null, listaEspecies);
    }

    public static void agregarNuevoAnimal() {
        String nombre =  JOptionPane.showInputDialog(null, "Teclea el nombre del nuevo animal (Ej: nombre-especie))");
        animalesRescatados.add(nombre);
        JOptionPane.showMessageDialog(null, nombre + " añadido correctamente");

    }

    public static void asignarCuidador() {
        String nombreAnimal = JOptionPane.showInputDialog(null, "Teclea el nombre del animal");
        String nombreCuidador = JOptionPane.showInputDialog(null, "Teclea el nombre del cuidador");
        relacionCuidador.put(nombreAnimal, nombreCuidador);


    }

    public static void pasarAnimalColaEspera() {
        String nombreAnimal = JOptionPane.showInputDialog(null, "Teclea el nombre del animal que \n"
                                                 + "quieres añadir a la cola de espera");

    }

}
