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
        String opcion;
       do {
           opcion = JOptionPane.showInputDialog("--MENU PRINCIPAL--\n"
                   + "1. Añadir un libro a la pila\n"
                   + "2. Consultar libro\n"
                   + "3. Retirar libro\n"
                   + "4. Mostrar todos los libros\n"
                   + "5. Ver lista\n"
                   + "6. Salir");
           hacerOpcion(opcion);
       }while(!opcion.equalsIgnoreCase("6"));
    }

    public static void hacerOpcion(String opcion) {
        switch (opcion) {
            case "1": añadirLibro();
                break;
            case "2":mostrarLibro();
                break;
            case "3": eliminarLibro();
                break;
            case "4":mostrarListaLibros();
                break;
            case "5":verificarPilaVacia();
                break;
            case "6":
                break;
        }
    }

    public static void añadirLibro() {
        String titulo = JOptionPane.showInputDialog("Teclea el titulo del libro");
        pilaLibros.push(titulo);
    }

    public static void mostrarLibro() {
        JOptionPane.showMessageDialog(null, pilaLibros.peek());
    }

    public static void eliminarLibro() {
        JOptionPane.showMessageDialog(null, pilaLibros.pop());

    }

    public static void mostrarListaLibros() {
        StringBuilder mostrarLista= new StringBuilder("Estos son los libros");

        for(String libro:pilaLibros){
            mostrarLista.append(":\n "+libro);
        }

        JOptionPane.showMessageDialog(null, mostrarLista);
    }

    public static void verificarPilaVacia() {
        if (pilaLibros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pila esta vacia");
        } else {
            JOptionPane.showMessageDialog(null, "La pila no esta vacia?");
        }
    }
}