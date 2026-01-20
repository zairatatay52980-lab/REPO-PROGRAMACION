import Modelos.Alumno;
import Modelos.Autor;
import Modelos.Libro;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  ArrayList<Autor> autores = new ArrayList<>();
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

    public static void generarDatos(){
        //1. generar autores
        Autor autor1 = new Autor("Javier Casitllo", LocalDate.of(1985,11, 3), "España");
        Autor autor2 = new Autor("Jane Austen", LocalDate.of(1739,9,11), "Reino Unido");
        Autor autor3 = new Autor("Julia Quinn", LocalDate.of(1989,12,12), "Canada");

        //3. generar libros
        libros.add(new Libro("El dia que se perdio la cordura", "345", "Castillo",autor1));
        libros.add(new Libro("Orgullo y Prejuicio", "411", "Bolsillo",autor2));
        libros.add(new Libro("El duque y yo", "359", "Match Stories",autor3));

        //5. generar alumnos
        alumnos.add(new Alumno("Marta", LocalDate.of(2007, 7, 11), "España", "00000000A"));
        alumnos.add(new Alumno("Pedro", LocalDate.of(2006, 9, 19), "Italia", "00000001B"));
        alumnos.add(new Alumno("Juan", LocalDate.of(2002, 1, 3), "Argentina", "00000002N"));
        alumnos.add(new Alumno("Lola", LocalDate.of(2005, 12, 23), "España", "00000004D"));

    }


    public static void mostrarMenu(){

        int opcion = 0;
        do {
            try {
                JOptionPane.showInputDialog(null, "---MENU BIBLIOTECA---"
                +"\n 1.Alquilar libro"
                +"\n 2.Devolver libro"
                +"\n 3.Ver datos disponibles"
                +"\n 0.Salir");


                switch(opcion){
                    case 1:alquilarLibro();
                    break;
                    case 2:devolverLibro();
                    break;
                    case 3: listarAlumnos();
                    break;
                    case 0: JOptionPane.showMessageDialog(null, "Saliendo..");
                    break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error, introduce un numero valido");
            }
        }while (opcion != 4);

    }

    public static void alquilarLibro(){

    }

    public static void devolverLibro(){

    }

    public static void listarAlumnos(){

    }




}

