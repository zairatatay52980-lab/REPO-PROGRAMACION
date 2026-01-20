package Modelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
    private String DNI;
    private ArrayList<Libro> LibrosAlquilados;


    public Alumno() {
    }

    public Alumno(String nombre, LocalDate fechanacimiento, String paisNacimiento) {
        super(nombre, fechanacimiento, paisNacimiento);
    }

    public Alumno(String nombre, LocalDate fechanacimiento, String paisNacimiento, String DNI) {
        super(nombre, fechanacimiento, paisNacimiento);
        this.DNI = DNI;
    }

    public Alumno(String nombre, LocalDate fechanacimiento, String paisNacimiento, String DNI, ArrayList<Libro> librosAlquilados) {
        super(nombre, fechanacimiento, paisNacimiento);
        this.DNI = DNI;
        LibrosAlquilados = librosAlquilados;
    }


    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
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
