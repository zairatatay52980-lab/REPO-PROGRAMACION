import Modelos.Alumno;
import Modelos.Autor;
import Modelos.Libro;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ArrayList<Libro> libros = new ArrayList<>();
    public static ArrayList<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) {

        try {

            generarDatos();

            mostrarMenu();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void generarDatos() {
        //1. generar autores
        Autor autor1 = new Autor("Javier Casitllo", LocalDate.of(1985, 11, 3), "España");
        Autor autor2 = new Autor("Jane Austen", LocalDate.of(1739, 9, 11), "Reino Unido");
        Autor autor3 = new Autor("Julia Quinn", LocalDate.of(1989, 12, 12), "Canada");

        //3. generar libros
        libros.add(new Libro("El dia que se perdio la cordura", "345", "Castillo", autor1));
        libros.add(new Libro("Orgullo y Prejuicio", "411", "Bolsillo", autor2));
        libros.add(new Libro("El duque y yo", "359", "Match Stories", autor3));

        //5. generar alumnos
        alumnos.add(new Alumno("Marta", LocalDate.of(2007, 7, 11), "España", "00000000A"));
        alumnos.add(new Alumno("Pedro", LocalDate.of(2006, 9, 19), "Italia", "00000001B"));
        alumnos.add(new Alumno("Juan", LocalDate.of(2002, 1, 3), "Argentina", "00000002N"));
        alumnos.add(new Alumno("Lola", LocalDate.of(2005, 12, 23), "España", "00000004D"));

    }


    public static void mostrarMenu() {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "---MENU BIBLIOTECA---"
                + "\n 1.Alquilar libro"
                + "\n 2.Devolver libro"
                + "\n 3.Ver datos disponibles"
                + "\n 0.Salir"));

        do {


                switch (opcion) {
                    case 1:
                        alquilarLibro();
                        break;
                    case 2:
                        devolverLibro();
                        break;
                    case 3:
                        verDatos();
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Saliendo..");
                }

            } while (opcion != 0) ;

        }


    public static void alquilarLibro() {
        Libro libro = solicitarLibro();

        if (!libro.isEjemplaresDisponibles())
            JOptionPane.showMessageDialog(null, "No hay ejemplares disponibles");

        else {
            Alumno alum = solicitarAlumno();
            if (alum.alquilarLibro(libro)) {
                JOptionPane.showMessageDialog(null, "El libro " + libro.getTitulo() + " ha sido alquilado por " + alum.getNombre());
            } else {
                JOptionPane.showMessageDialog(null, "El alumno " + alum.getNombre() + " no tiene libros disponibles para alquilar");

            }

        }
        mostrarMenu();
    }

    public static Alumno solicitarAlumno() {
        boolean correcto = false;

        Alumno alum = null;

        do {
            try {
                String dni = JOptionPane.showInputDialog(null, "Introduce el DNI del alumno: ");


                if (!dni.matches("^[0-9]{8}[A-Z]$"))
                    throw new Exception("DNI incorrecto");

                alum = alumnos.stream()
                        .filter(a -> a.getDni().equalsIgnoreCase(dni))
                        .findFirst()
                        .orElse(null);
                if (alum == null)
                    throw new Exception("El alumno no existe");
                correcto = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while (!correcto);
        return alum;
    }


    public static Libro solicitarLibro() {
        boolean correcto = false;
        Libro libro = null;
        do {
            try {
                String titulo = JOptionPane.showInputDialog(null, "Introduce el titulo del libro: ");

                libro = libros.stream()
                        .filter(l -> l.getTitulo().equalsIgnoreCase(titulo))
                        .findFirst()
                        .orElse(null);
                if (libro == null)
                    throw new Exception("El libro no existe");

                correcto = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        while (!correcto);
        return libro;
    }


    public static void devolverLibro() {
        Alumno alumno = solicitarAlumno();
        Libro libro = solicitarLibro();

        if (alumno.devolverLibro(libro)) {
            JOptionPane.showMessageDialog(null, "Libro devuelto exitosamente :)");
            libro.devolver();
        } else {
            JOptionPane.showMessageDialog(null, "El alumno " + alumno.getNombre() + " no tiene ese libro");
        }

        mostrarMenu();
    }

    public static void verDatos() {
         StringBuilder datos= new StringBuilder();
         datos.append("Libros: \n");

         for(Libro libro : libros) {
             datos.append(libro.toString()).append("\n");
         }

         datos.append("\n");

         datos.append("Alumnos: \n");


        for(Alumno alumno: alumnos)
        {
            datos.append(alumno.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, datos.toString());


        mostrarMenu();
}
}









