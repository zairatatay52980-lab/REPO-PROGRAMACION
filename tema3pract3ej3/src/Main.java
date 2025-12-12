import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static Deque<String> pilaLibros = new ArrayDeque<String>();
    public static void main(String[] args) {

        try {

            mostrarMenu();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "error");
        }
    }

    public static void mostrarMenu() {
        String opcion = JOptionPane.showInputDialog("--MENU PRINCIPAL--\n"
                + "1. Añadir un libro a la pila\n"
                + "2. Consultar libro\n"
                + "3. REtirar libro\n"
                + "4. Mostrar todos los libros\n"
                + "5. Ver lista\n"
                + "6. Salir");
        hacerOpcion(opcion);
    }

    public static void hacerOpcion(String opcion) {
        switch (opcion) {
            case "1": añadirLibro();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
        }
    }

    public static void añadirLibro() {
        String titulo = JOptionPane.showInputDialog("Teclea el titulo del libro");
        pilaLibros.add(titulo);
    }



}