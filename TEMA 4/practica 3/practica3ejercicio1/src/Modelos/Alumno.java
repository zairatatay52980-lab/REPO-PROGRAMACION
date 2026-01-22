package Modelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
    private String dni;
    private ArrayList<Libro> LibrosAlquilados;


    public Alumno(String nombre, LocalDate fechanacimiento, String paisNacimiento, String dni, ArrayList<Libro> librosAlquilados) {
        super(nombre, fechanacimiento, paisNacimiento);
        this.dni = dni;
        LibrosAlquilados = librosAlquilados;
    }

    public Alumno(String nombre, LocalDate fechanacimiento, String paisNacimiento, String dni) {
        super(nombre, fechanacimiento, paisNacimiento);
        this.dni = dni;
    }


    public String getdni() {
        return dni;
    }

    public ArrayList<Libro> getLibrosAlquilados() {
        return LibrosAlquilados;
    }
    public void setLibrosAlquilados(ArrayList<Libro> librosAlquilados) {
        LibrosAlquilados = librosAlquilados;
    }

    public boolean alquilarLibro(Libro libro) {

        return false;
    }
    public boolean devolverLibro(Libro libro) {

        return false;
    }

}
