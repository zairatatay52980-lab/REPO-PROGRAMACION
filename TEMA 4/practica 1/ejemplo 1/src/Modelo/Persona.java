package Modelo;

import java.time.LocalDate;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private boolean casado;

    //Metodos


    public Persona(String nombre, String apellido, int edad, LocalDate fechaNacimiento, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.casado = casado;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
