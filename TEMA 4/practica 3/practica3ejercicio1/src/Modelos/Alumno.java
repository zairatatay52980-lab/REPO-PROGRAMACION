package Modelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
    private String dni;
    private ArrayList<Libro> librosAlquilados;


    public Alumno(String nombre, LocalDate fechanacimiento, String paisNacimiento, String dni) {
        super(nombre, fechanacimiento, paisNacimiento);
        this.dni = dni;
        librosAlquilados = new ArrayList<>();
    }


    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }

    public ArrayList<Libro> getLibrosAlquilados() {
        return librosAlquilados;
    }
    public void setLibrosAlquilados(ArrayList<Libro> librosAlquilados) {
        this.librosAlquilados = librosAlquilados;
    }

    public boolean alquilarLibro(Libro libro) {
        if(librosAlquilados.size()==2)
            // No puede más de dos
            return false;
        librosAlquilados.add(libro);
        return true;
    }
    public boolean devolverLibro(Libro libro) {
        return librosAlquilados.remove(libro);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Alumno: ").append(super.getNombre()).append("\n");
        sb.append("Libros alquilados:");

        if (librosAlquilados.isEmpty()) {
            sb.append(" Ninguno");
        } else {
            for (Libro libro : librosAlquilados) {
                sb.append("\n - ").append(libro.getTitulo());
            }
        }

        return sb.toString();
    }

}
